package com.hwua.springdemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hwua.springdemo.dao.IUserDao;
import com.hwua.springdemo.entity.User;
import com.hwua.springdemo.service.IUserService;

@Component
public class UserServiceImpl implements IUserService {

	//不要在类在进行创建对象，把创建对象的工作交给Spring容器，依赖注入
	@Autowired
	private IUserDao userDao;
	
	public void create(User user) throws Exception {
		userDao.create(user);
		throw new Exception();
	}
	
}
