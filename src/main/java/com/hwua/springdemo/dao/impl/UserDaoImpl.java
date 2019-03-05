package com.hwua.springdemo.dao.impl;

import org.hibernate.Session;

import org.springframework.stereotype.Component;

import com.hwua.springdemo.dao.IUserDao;
import com.hwua.springdemo.entity.User;
import com.hwua.springdemo.util.HibernateUtil;
@Component
public class UserDaoImpl implements IUserDao {

	public void create(User user) {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
	}

}
