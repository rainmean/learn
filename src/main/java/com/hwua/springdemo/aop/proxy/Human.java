package com.hwua.springdemo.aop.proxy;

/**
 * 人类
 */
public class Human implements Sleepable {
	public void sleep() {
		System.out.println("睡觉了！！！");
	}
}
