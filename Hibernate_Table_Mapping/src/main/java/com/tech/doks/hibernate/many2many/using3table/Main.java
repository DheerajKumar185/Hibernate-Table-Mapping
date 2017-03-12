package com.tech.doks.hibernate.many2many.using3table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();

		Employee employee1 = new Employee();
		employee1.setEmpId(10485);
		employee1.setName("Dheeraj Kumar");

		Employee employee2 = new Employee();
		employee2.setEmpId(10486);
		employee2.setName("Ashish Ramtekkar");

		Employee employee3 = new Employee();
		employee3.setEmpId(10487);
		employee3.setName("Nikhil Hokam");

		Laptop laptop1 = new Laptop();
		laptop1.setId(101);
		laptop1.setName("Dell Inspiron 15");

		Laptop laptop2 = new Laptop();
		laptop2.setId(102);
		laptop2.setName("Dell Inspiron 13");

		Laptop laptop3 = new Laptop();
		laptop3.setId(103);
		laptop3.setName("Lenovo 15");

		Laptop laptop4 = new Laptop();
		laptop4.setId(104);
		laptop4.setName("HP");

		Laptop laptop5 = new Laptop();
		laptop5.setId(105);
		laptop5.setName("Lenovo 13");

		laptop1.getEmployee().add(employee1);
		laptop2.getEmployee().add(employee2);
		laptop3.getEmployee().add(employee3);
		laptop4.getEmployee().add(employee1);
		laptop5.getEmployee().add(employee2);

		session.beginTransaction();
		session.save(laptop1);
		session.save(laptop2);
		session.save(laptop3);
		session.save(laptop4);
		session.save(laptop5);
		session.save(employee1);
		session.save(employee2);
		session.save(employee3);
		session.getTransaction().commit();
	}

}
