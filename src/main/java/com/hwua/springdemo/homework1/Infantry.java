package com.hwua.springdemo.homework1;

/**
 * 步兵类
 */
public class Infantry {

	//持有武器
	private Weapon weapon;

	public Infantry(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void fire(){
		weapon.fire();
	}
}
