package com.hwua.springdemo.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate的Session工厂类
 */
public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
        	Configuration cfg = new Configuration().configure();//自动读取hibernate.cfg.xml核心配置文件
        	StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
        			.applySettings(cfg.getProperties()).build();
            return cfg.buildSessionFactory(serviceRegistry);
        }
        catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    /**
     * 获取session
     * @return
     */
    public static Session getSession(){
    	return sessionFactory.getCurrentSession();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
