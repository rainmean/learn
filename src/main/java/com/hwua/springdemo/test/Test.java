package com.hwua.springdemo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import com.hwua.springdemo.entity.User;
import com.hwua.springdemo.service.impl.UserServiceImpl;

@Configuration
@ComponentScan(basePackages="com.hwua.springdemo.dao, com.hwua.springdemo.service")
@EnableAspectJAutoProxy(proxyTargetClass=true)
@Import(UserAspect.class)//导入
public class Test {
	public static void main(String[] args) {
		// 读取配置类获取Appliaction上下文
		ApplicationContext context = new AnnotationConfigApplicationContext(Test.class);
		// 获取master的bean
		UserServiceImpl userService = context.getBean(UserServiceImpl.class);
		User user = new User();
		user.setAge(33);
		user.setUsername("dddd");
		user.setPassword("423425464534");
		try {
			userService.create(user);
		} catch (Exception e) {
		}
	}
}
