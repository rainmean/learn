package com.hwua.springdemo.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * AOP的切面类
 */

@Aspect//定义为切面类
public class AspectAnnotation {

	//切入点
	@Pointcut("execution(* com.hwua.springdemo.aop.annotation.Master.feed(..))")
	public void feed(){
	}
	
	@Before("feed()")//前置处理
	public void call(JoinPoint joinPoint){
		System.out.println("连接点对象："+joinPoint.getTarget().getClass().getSimpleName());
		System.out.println("连接点方法："+joinPoint.getSignature());
		System.out.println("连接点方法参数："+joinPoint.getArgs()[0]);//获取第一个参数
		System.out.println("@@@主人叫唤宠物...");
	}
	
	@After("feed()")//后置处理（不管切入的方法是否出现异常都会执行）
	public void clean(JoinPoint joinPoint){
		System.out.println("@@@宠物吃完了，主人收拾东西...");
	}
	
	@AfterReturning("feed()")//切入方法正常执行后，执行处理，如果出现异常就不会执行
	public void play(JoinPoint joinPoint){
		System.out.println("@@@主人和宠物开始玩耍！！！");
	}
	
	@AfterThrowing("feed()")//当切入方法发生异常时执行
	public void dead(JoinPoint joinPoint){
		System.out.println("@@@宠物挂掉了！！！");
	}
	
	//环绕通知
	@Around("feed()")
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
