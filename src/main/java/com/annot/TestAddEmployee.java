package com.annot;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class TestAddEmployee {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Employee employee = new Employee(2, "firstName", "lastName2", 1234);
		//Serializable value=session.save(employee);
		session.saveOrUpdate(employee);
		
		//System.out.println("id:-"+value);
		

		transaction.commit();
		session.close();
		sessionFactory.close();

	}
}
