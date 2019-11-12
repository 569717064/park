package com.woniuxy.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 这个类负责配置注册:
 * 1.配置CORS
 * 2.配置拦截器
 * 3.配置消息转化器
 * @author 56971
 *
 */
@Configuration
public class RootConfig implements WebMvcConfigurer{
	
	
	//配置CORS
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
			.allowedOrigins("*")
			.allowedMethods("GET","DELETE","POST","PUT","OPTIONS")
			.allowedHeaders("*")
			.allowCredentials(true);//允许客户端携带cookie
	}
}
