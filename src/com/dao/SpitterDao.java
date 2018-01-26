package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.config.HibernateUtilities;

import spittr.Spitter;
import spittr.Spittle;

public class SpitterDao {
	public SpitterDao() {
		System.out.println("SpitterDao class");
	}
	
	SessionFactory factory=HibernateUtilities.getsSessionFactory();
	Session session;
	
	
	public Spitter SaveSpitter(Spitter spitter){
		session=factory.openSession();
		try{
			session.beginTransaction();
			session.save(spitter);
			session.getTransaction().commit();
		}catch(Exception e){
			
		}finally {
			session.close();
		}
		return spitter;
	}


	public Spitter findSpitter(Spitter spitter) {
		session=factory.openSession();
		Spitter temp=new Spitter();
		try{
			session.beginTransaction();
			temp=(Spitter)session.createQuery("from Spitter where userName=:u").setParameter("u", spitter.getUserName()).uniqueResult();
			if(temp.getPassword().equals(spitter.getPassword())){
				return temp;
			}
			else{
				temp.setId(-1);
				return temp;
			}
		}catch(Exception ex){
			System.out.println(ex.getMessage());
			return new Spitter(-1);
		}finally {
			session.close();
		}
		
	}

}
