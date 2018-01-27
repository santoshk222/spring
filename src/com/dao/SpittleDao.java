package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.config.HibernateUtilities;

public class SpittleDao {
	SessionFactory factory=HibernateUtilities.getsSessionFactory();
	Session session;
	
	
	
	public SpittleDao() {
		/*System.out.println("SpittleDao--Constructor()");*/
	}
	public void init(){
		System.out.println("SpittleDao--init()");
	}
	
	public void destroy(){
		System.out.println("SpittleDao--destroy()");
	}

}
