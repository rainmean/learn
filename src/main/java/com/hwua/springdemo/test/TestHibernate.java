package com.hwua.springdemo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hwua.springdemo.entity.User;
import com.hwua.springdemo.service.impl.UserServiceImpl;
@Configuration//做为配置类
@ComponentScan(basePackages="com.hwua.springdemo.dao, com.hwua.springdemo.service")//指定扫描用@Component注解的类，并加载为Bean
public class TestHibernate {

	public static void main(String[] args) throws Exception {
		// 读取配置类获取Appliaction上下文
		ApplicationContext context = new AnnotationConfigApplicationContext(TestHibernate.class);
		// 获取master的bean
		
		UserServiceImpl userServcieImpl = context.getBean(UserServiceImpl.class);
		User user = new User();
		user.setAge(100);
		user.setUsername("2312312");
		user.setPassword("2342");
		userServcieImpl.create(user);
		System.out.println("添加成功");
	}
}
