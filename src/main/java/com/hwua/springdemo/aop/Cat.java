package com.hwua.springdemo.aop;

import org.springframework.stereotype.Component;

/**
 * 宠物猫
 */
public class Cat implements Pet {
	public void eat() {
		System.out.println("猫在吃鱼...");
	}
}
