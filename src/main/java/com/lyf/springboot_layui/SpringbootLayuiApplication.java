package com.lyf.springboot_layui;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lyf.springboot_layui")
public class SpringbootLayuiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLayuiApplication.class, args);
	}
}
