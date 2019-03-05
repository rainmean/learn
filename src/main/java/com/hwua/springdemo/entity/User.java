package com.hwua.springdemo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * 用户类
 */
@Entity//持久化类注解
@Table(name="t_user")//表名映射，如果不注解，则默认表名和类名一致
public class User implements Serializable{
	
	@Id//主键注解
	@GeneratedValue(strategy=GenerationType.IDENTITY)//主键生成策略
	private Long id;
	
	@Column(name="username", length=32, unique=true)
	private String username;
	
	@Column(name="password", length=32)
	private String password;
	
	@Column(name="age", length=3)
	private Integer age;
	
	public User() {
	}
	
	public User(Long id, String username, Integer age) {
		super();
		this.id = id;
		this.username = username;
		this.age = age;
	}

	public User(Long id, String username, String password, Integer age) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.age = age;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", age=" + age + "]";
	}
}
