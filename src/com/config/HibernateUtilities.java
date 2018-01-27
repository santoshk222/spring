package com.config;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import spittr.Spitter;
import spittr.Spittle;

public class HibernateUtilities {

	private static ServiceRegistry serviceRegistry;
	private static SessionFactory sessionFactory;

	static {

		try {
			System.out.println("HibernateUtilities--Entered");
			Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
			serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			
			configuration.addAnnotatedClass(Spitter.class);
			
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			System.out.println("HibernateUtilities--completed");

		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("HibernateUtilities--Problem creating session factory: " + e.getMessage());
		}
	}

	public static SessionFactory getsSessionFactory() {
		return sessionFactory;
	}
	
}