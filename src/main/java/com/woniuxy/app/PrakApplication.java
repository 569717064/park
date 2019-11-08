package com.woniuxy.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot启动类
 * @author 56971
 *
 */
@SpringBootApplication(scanBasePackages = "com.woniuxy")
@MapperScan("com.woniuxy.dao")
public class PrakApplication {
	public static void main(String[] args) {
		SpringApplication.run(PrakApplication.class, args);
	}
}
