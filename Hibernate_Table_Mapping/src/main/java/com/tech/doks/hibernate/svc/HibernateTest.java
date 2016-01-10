package com.tech.doks.hibernate.svc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tech.doks.hibernate.models.UserDetails;
import com.tech.doks.hibernate.models.Vehicle;

public class HibernateTest {
	
	public static void main(String[] args) {
		
		UserDetails user = new UserDetails();
		Vehicle vehicle = new Vehicle();

		user.setUserName("Dheeraj");
		vehicle.setVehicleName("Jeep");
		
		user.setVehicle(vehicle);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(vehicle);
		session.getTransaction().commit();
		
		user = null;
		session = sessionFactory.openSession();
		session.beginTransaction();
		user = (UserDetails) session.get(UserDetails.class, 1);
		System.out.println("User_Name :: " + user.getUserName());
	}

}
