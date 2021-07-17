package com.one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestAddPerson {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Address_One_to_One address =new Address_One_to_One();
		address.setCity("Gwalior");
		address.setPincode(474006);
		
		Person_One_to_One person =new Person_One_to_One(1,"Arjun",address);
		session.save(person);

		transaction.commit();
		session.close();
		sessionFactory.close();

	}
}
