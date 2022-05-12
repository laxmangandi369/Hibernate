package hibernateOneToManyMapping;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;

import hibernateOneToManyMapping.Entity.BusDetails;
import hibernateOneToManyMapping.Entity.Passenger;
import hibernateOneToManyMapping.util.HibernateUtil;

public class Main {
	public static void main(String[] args) {
		Passenger p1=new Passenger("Rohan", "8668530410");
		Passenger p2=new Passenger("Abhinav", "8668530411");
		Passenger p3=new Passenger("Anand", "8668530412");
		Passenger p4=new Passenger("Atif", "8668530413");
		Passenger p5=new Passenger("Monis", "9668530410");
		Set<Passenger> bus1passengerdetails = new HashSet<Passenger>();
		Set<Passenger> bus2passengerdetails = new HashSet<Passenger>();
		bus1passengerdetails.add(p1);
		bus1passengerdetails.add(p2);
		bus1passengerdetails.add(p3);
		bus2passengerdetails.add(p4);
		bus2passengerdetails.add(p5);
		BusDetails bus1 = new BusDetails("KA02U5684","Ram Prashad", bus1passengerdetails);
		BusDetails bus2 = new BusDetails("BR02U5694","Ram Charan Singh",bus2passengerdetails);
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(p4);
		session.save(p5);
		session.save(bus1);
		session.save(bus2);
		session.getTransaction().commit();
		session.close();
		
	}
}
