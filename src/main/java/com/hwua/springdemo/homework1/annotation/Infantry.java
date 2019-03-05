package com.hwua.springdemo.homework1.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 步兵类
 */
@Component
public class Infantry {

	//持有武器
	@Autowired
	@Qualifier("pistol")
	private Weapon weapon;
	
	public void fire(){
		weapon.fire();
	}
}
