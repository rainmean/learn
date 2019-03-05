package com.hwua.springdemo.aop;

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
	
	public void feed() throws Exception{
		System.out.println("主人：" + name + "在喂食...");
		pet.eat();
		throw new Exception("卧槽！！食物有毒！！！");
	}
	
	public static void main(String[] args){
		//读取spring.xml配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("com/hwua/springdemo/aop/aop.xml");
		//获取master的bean
		Master master = (Master)context.getBean("master");
		//调用主人的喂食方法
		try {
			master.feed();
		} catch (Exception e) {
			System.out.println("死掉的原因："+e.getMessage());
		}
	}
}
