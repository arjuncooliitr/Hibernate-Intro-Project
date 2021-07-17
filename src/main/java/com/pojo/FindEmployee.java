package com.pojo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FindEmployee {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee emp=session.find(Employee.class,2);
		System.out.println("emp desc:-"+emp);
		
		transaction.commit();
		session.close();
		sessionFactory.close();

		
	}
}
