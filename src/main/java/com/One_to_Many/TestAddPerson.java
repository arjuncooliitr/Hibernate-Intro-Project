package com.One_to_Many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;


public class TestAddPerson {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Configuration configuration = new Configuration().configure();
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();

			List<Address_one_to_many> addresses=
					new ArrayList<Address_one_to_many>();
			addresses.add(new Address_one_to_many(3,12340l, "pune"));
			addresses.add(new Address_one_to_many(4,12341l, "Bangalore"));
			Person_one_to_many person = new Person_one_to_many(3,"person name1", addresses);
			
			session.save(person);
			session.getTransaction().commit();

			session.beginTransaction();
		    Person_one_to_many person1=session.get(Person_one_to_many.class, 2);	
			System.out.println(person1.getName());
			
			
			
			
			transaction.commit();
			session.close();
			sessionFactory.close();

		}
}
