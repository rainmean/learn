package com.hwua.springdemo.ioc.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 主人
 */
@Scope("prototype")//设置Bean的作用域范围（默认是singleton，就是每次通过getBean()获取的实例都是同一个，如果想要每次获取的实例都是新的实例，那么就设置为prototype）
@Component
public class Master {

	@Autowired
	@Qualifier("cat")
	private Pet pet;//拥有的宠物
	
	public void feed(){
		System.out.println("主人：在喂食...");
		pet.eat();
	}
	
	public static void main(String[] args) {
		//读取spring.xml配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("com/hwua/springdemo/ioc/auto/spring.xml");
		//获取master的bean
		Master master = (Master)context.getBean("master");
		//调用主人的喂食方法
		master.feed();
		
		Master master2 = (Master)context.getBean("master");
		
		//判断两个master实例是否是同一个实例
		System.out.println(master==master2);
	}
}
