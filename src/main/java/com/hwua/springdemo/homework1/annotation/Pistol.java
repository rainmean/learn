package com.hwua.springdemo.homework1.annotation;

import org.springframework.stereotype.Component;

/**
 * 步枪
 */
@Component
public class Pistol implements Weapon {
	public void fire() {
		System.out.println("步枪射击！哒哒哒哒！！！");
	}
}
