package com.hwua.springdemo.homework1.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 炮兵类
 */
@Component
public class Artillery {

	@Autowired
	@Qualifier("cannon")
	private Weapon weapon;
	
	public void fire(){
		weapon.fire();
	}
}
