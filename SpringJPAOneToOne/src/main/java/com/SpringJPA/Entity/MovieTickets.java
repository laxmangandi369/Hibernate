package com.SpringJPA.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "booked_movie_tickets")
public class MovieTickets {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "seat_numbers")
	private String seatNumbers;
	@Column(name = "total_seats_booked")
	private String totalSeatsBooked;
	@Column
	private String foodType;
	@Column
	private String seatType;
	
	@ManyToOne
	MovieName movieName;
	
	@ManyToOne
	TheatreScreen screen;
	
	
	
	public MovieTickets(String seatNumbers, String totalSeatsBooked, String foodType, String seatType) {
		super();
		this.seatNumbers = seatNumbers;
		this.totalSeatsBooked = totalSeatsBooked;
		this.foodType = foodType;
		this.seatType = seatType;
		
	}

	public MovieTickets() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSeatNumbers() {
		return seatNumbers;
	}

	public void setSeatNumbers(String seatNumbers) {
		this.seatNumbers = seatNumbers;
	}

	public String getTotalSeatsBooked() {
		return totalSeatsBooked;
	}

	public void setTotalSeatsBooked(String totalSeatsBooked) {
		this.totalSeatsBooked = totalSeatsBooked;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public String getSeatType() {
		return seatType;
	}

	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}



	public TheatreScreen getScreen() {
		return screen;
	}

	public MovieName getMovieName()
	{
		return movieName;
	}

	public void setMovieName(MovieName movieName)
	{
		this.movieName = movieName;
	}

	public void setScreen(TheatreScreen screen)
	{
		this.screen = screen;
	}


	
		
}
