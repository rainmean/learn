package com.hwua.springdemo.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * AOP的切面类
 */
public class Aspect {

	public void call(){
		System.out.println("@@@主人叫唤宠物...");
	}
	
	public void prepared(){
		System.out.println("@@@主人准备食物...");
	}
	
	public void clean(){
		System.out.println("@@@宠物吃完了，主人收拾东西...");
	}
	
	public void play(){
		System.out.println("@@@主人和宠物开始玩耍！！！");
	}
	
	public void dead(){
		System.out.println("@@@宠物挂掉了！！！");
	}
	
	//环绕通知
	public void arroud(ProceedingJoinPoint joinPoint){
		try {
			//前置处理
			System.out.println("###主人叫唤宠物...");
			System.out.println("###主人准备食物...");
			
			joinPoint.proceed();//切入点
			
			//后置处理
			System.out.println("###宠物吃完了，主人收拾东西...");
			System.out.println("###主人和宠物开始玩耍！！！");
		} catch (Throwable e) {
			System.out.println("###宠物挂掉了！！！");
			System.out.println("死掉的原因："+e.getMessage());
		}
	}
}
