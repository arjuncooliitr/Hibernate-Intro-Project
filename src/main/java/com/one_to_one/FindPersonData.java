package com.one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class FindPersonData {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Person_One_to_One p1=session.get(Person_One_to_One.class, 1);
		System.out.println("person desc:-"+p1);
		

		transaction.commit();
		session.close();
		sessionFactory.close();


}
}
