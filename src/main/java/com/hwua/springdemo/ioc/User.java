package com.hwua.springdemo.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 用户类
 */
public class User {
	private Long id;
	private String username;
	private String password;
	private Integer age;
	
	private Pet pet;
	
	//下面是属性的set方法
	public void setId(Long id) {
		this.id = id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	@Override
	public String toString() {
		pet.eat();
		return "用户 [id=" + id + ", username=" + username + ", password=" + password + ", age=" + age + "]";
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		User user = (User)context.getBean("user");
		System.out.println(user);
	}
}
