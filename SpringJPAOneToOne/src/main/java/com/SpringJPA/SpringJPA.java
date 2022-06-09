package com.SpringJPA;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.SpringJPA.Entity.MovieName;
import com.SpringJPA.Entity.MovieTickets;
import com.SpringJPA.Entity.TheatreScreen;
import com.SpringJPA.dao.MovieNameRepository;

@SpringBootApplication
public class SpringJPA {

	public static void main(String[] args) {
		

		
		SpringApplication.run(SpringJPA.class, args);
		
		
//		MovieName topGun_mavrick = new MovieName("Top Gun : Mavrick","Tom cruise starrrer");
//		MovieName parineeta = new MovieName("Parineeta", "Saif Ali Khan Starrer");
//		
//		MovieTickets t1 = new MovieTickets("A12,A13,A14","3","non-veg","regular");
//		MovieTickets t2 = new MovieTickets("A1,A2,A4","3","veg","exclusive");
//		MovieTickets t3 = new MovieTickets("A5,A6","2","none","regular");
//		
//		Set<MovieTickets> topgun_tickets = new HashSet<MovieTickets>();
//		topgun_tickets.add(t1);
//		topgun_tickets.add(t2);
//		topgun_tickets.add(t3);
//		
//		
//		TheatreScreen screen1 = new TheatreScreen("screen1",topGun_mavrick,topgun_tickets);
//		TheatreScreen screen1 = new The
		
	}

}
