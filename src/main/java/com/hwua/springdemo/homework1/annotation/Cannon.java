package com.hwua.springdemo.homework1.annotation;

import org.springframework.stereotype.Component;

/**
 * 加农炮
 */
@Component
public class Cannon implements Weapon {
	public void fire() {
		System.out.println("加农炮发射！轰隆，嘣！！！！");
	}
}
