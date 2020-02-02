package com.king.shiro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.king.shiro.mapper")//将项目中对应的mapper类的路径加进来就可以了
//@EnableAutoConfiguration
public class S5Application {

	public static void main(String[] args) {
		SpringApplication.run(S5Application.class, args);
	}


}
