package com.hwua.springdemo.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 主人
 */
public class Master {

	private String name;//姓名
	private Pet pet;//拥有的宠物
	
	//构造方法
	public Master(String name, Pet pet) {
		this.name = name;
		this.pet = pet;
	}
	
	public void feed(){
		System.out.println("主人：" + name + "在喂食...");
		pet.eat();
	}
	
	public static void main(String[] args) {
		//读取spring.xml配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//获取master的bean
		Master master = (Master)context.getBean("master");
		//调用主人的喂食方法
		master.feed();
	}
}
