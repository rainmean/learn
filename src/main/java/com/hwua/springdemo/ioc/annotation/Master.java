package com.hwua.springdemo.ioc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 主人
 */
@Component
public class Master {
	
	@Autowired//自动装配Bean
	/*@Qualifier("dog")//指定实现类型（如果Pet接口只有一个实现类，可以不指定此注解）*/	
	private Pet pet;//拥有的宠物
	
	public void feed(){
		System.out.println("主人在喂食...");
		pet.eat();
	}
	
}
