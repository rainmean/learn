package com.hwua.springdemo.homework1;

/**
 * 炮兵类
 */
public class Artillery {

	private Weapon weapon;
	
	public Artillery(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void fire(){
		weapon.fire();
	}
}
