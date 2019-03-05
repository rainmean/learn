package com.hwua.springdemo.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserAspect {
	// 切入点
	@Pointcut("execution(* com.hwua.springdemo.service.*.*(..))")
	public void create() {
	}

	@Before("create()") // 前置处理
	public void call(JoinPoint joinPoint) {
		System.out.println("收集用户信息。。。");
	}

	@After("create()") // 后置处理（不管切入的方法是否出现异常都会执行）
	public void clean(JoinPoint joinPoint) {
		System.out.println("添加操作执行完毕");
	}

	@AfterReturning("create()") // 切入方法正常执行后，执行处理，如果出现异常就不会执行
	public void play(JoinPoint joinPoint) {
		System.out.println("用户添加成功！！！");
	}

	@AfterThrowing("create()") // 当切入方法发生异常时执行
	public void dead(JoinPoint joinPoint) {
		System.out.println("出错了！！！");
	}

}
