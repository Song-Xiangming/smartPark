package com.mdd.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	/**
	 * @return 获取会话工厂
	 */
	public static SessionFactory getSessionFactory ()
	{
		if(sessionFactory==null)
		{
			Configuration config = new Configuration().configure();
			ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		    sessionFactory = config.buildSessionFactory(serviceRegistry);
		    return sessionFactory; 
		}
		else 
		{
			return sessionFactory;
		}
		
		
	}
	/**
	 * @return 获取会话对象
	 */
	public static Session getSession() {
		return getSessionFactory().openSession();
	}
}
