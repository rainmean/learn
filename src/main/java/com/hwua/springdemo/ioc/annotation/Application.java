package com.hwua.springdemo.ioc.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//做为配置类
@ComponentScan(basePackages="com.hwua.springdemo.ioc.annotation")//指定扫描用@Component注解的类，并加载为Bean
public class Application {
	
	public static void main(String[] args) {
		// 读取配置类获取Appliaction上下文
		ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		// 获取master的bean
		Master master = context.getBean(Master.class);
		// 调用主人的喂食方法
		master.feed();
	}
}
