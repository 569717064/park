package com.woniuxy.config;

import java.util.Map;
import java.util.Properties;

import org.apache.commons.collections.map.HashedMap;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.realm.jdbc.JdbcRealm.SaltStyle;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * 这个类负责配置shiro验证
 * @author 56971
 *
 */
@Configuration
public class ShiroConfig {
	
	
	//配置德鲁伊数据源
	@Bean
	public DruidDataSource dataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/park");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}
	
	
	//配置加密
	@Bean
	public HashedCredentialsMatcher credentialsMatcher() {
		HashedCredentialsMatcher credentialsMatcher = new HashedCredentialsMatcher();
		credentialsMatcher.setHashAlgorithmName("md5");//设置加密算法
		credentialsMatcher.setHashIterations(1024);//设置加密迭代次数
		return credentialsMatcher;
	}
	
	
	//配置realm
	@Bean
	public JdbcRealm realm() {
		JdbcRealm realm = new JdbcRealm();
		realm.setDataSource(dataSource());//引入数据源
		//设置当认证时用的sql
		realm.setAuthenticationQuery("select password, salt from users where username = ?");
		//设置通过主体获取角色的sql
		realm.setUserRolesQuery("SELECT rname FROM roles WHERE rid = (SELECT rid FROM users WHERE username = ?)");
		//设置通过角色获取权限的sql
		realm.setPermissionsQuery("SELECT pname FROM roles_permissions rp JOIN roles r ON rp.rid = r.rid JOIN permissions p ON rp.pid = p.pid WHERE rname = ?");
		//让shiro能知道先根据主体获得角色，再根据角色获取权限
		realm.setPermissionsLookupEnabled(true);
		//设置加密用的盐
		realm.setSaltStyle(SaltStyle.COLUMN);
		//引入加密
		realm.setCredentialsMatcher(credentialsMatcher());
		return realm;
	}
	
	
	//缓存管理器
//	@Bean
//	public EhCacheManager cacheManager() {
//		EhCacheManager cacheManager = new EhCacheManager();
//		cacheManager.setCacheManagerConfigFile("classpath:shiro-ehcache.xml");//配置缓存文件的位置
//		return cacheManager;
//	}
	
	
	//配置安全管理器
	@Bean
	public DefaultWebSecurityManager securityManager() {
		DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
		//引入realm
		securityManager.setRealm(realm());
//		securityManager.setCacheManager(cacheManager());//引入缓存管理器
		return securityManager;
	}
	
	
	//配置shiro过滤器
	@Bean
	public ShiroFilterFactoryBean shiroFilter() {
		ShiroFilterFactoryBean shiroFilter = new ShiroFilterFactoryBean();
		//引入安全管理器
		shiroFilter.setSecurityManager(securityManager());
		//设置认证失败的跳转页面
//		shiroFilter.setLoginUrl("");
		//设置认证成功，但是没有对应角色和权限的跳转页面
//		shiroFilter.setUnauthorizedUrl("");
		Map<String, String> map = new HashedMap();
		map.put("/**", "anon");
		shiroFilter.setFilterChainDefinitionMap(map);//设置权限
		return shiroFilter;
	}  
	
	
	//打开shiro注解
	@Bean
	public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor() {
		AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = //
				new AuthorizationAttributeSourceAdvisor();
		//引入安全管理器	
		authorizationAttributeSourceAdvisor.setSecurityManager(securityManager());																	
		return authorizationAttributeSourceAdvisor;
	}
	
	
}
