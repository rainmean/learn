package com.hwua.springdemo.ioc.auto;

import org.springframework.stereotype.Component;

/**
 * 宠物狗
 */
@Component
public class Dog implements Pet{
	public void eat() {
		System.out.println("狗啃骨头...");
	}
}
