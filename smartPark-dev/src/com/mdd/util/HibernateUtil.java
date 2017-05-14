package com.mdd.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	/**
	 * @return ��ȡ�Ự����
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
	 * @return ��ȡ�Ự����
	 */
	public static Session getSession() {
		return getSessionFactory().openSession();
	}
}
