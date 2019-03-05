package com.hwua.springdemo.ioc.auto;

import org.springframework.stereotype.Component;

/**
 * 宠物猫
 */
@Component
public class Cat implements Pet {
	public void eat() {
		System.out.println("猫在吃鱼...");
	}
}
