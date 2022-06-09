package com.SpringJPA.Model;

import java.io.Serializable;
import java.util.Set;
import com.SpringJPA.Entity.MovieTickets;
import com.SpringJPA.Entity.TheatreScreen;

public class MovieTicketModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String seatNumbers;
	String totalSeatsBooked;
	String foodType;
	String seatType;
	TheatreScreen screen;
	
	public String getSeatNumber()
	{
		return seatNumbers;
	}
	public void setSeatNumber(String seatNumber)
	{
		this.seatNumbers = seatNumber;
	}
	public String getTotalSeatsBooked()
	{
		return totalSeatsBooked;
	}
	public void setTotalSeatsBooked(String totalSeatsBooked)
	{
		this.totalSeatsBooked = totalSeatsBooked;
	}
	public String getFoodType()
	{
		return foodType;
	}
	public void setFoodType(String foodType)
	{
		this.foodType = foodType;
	}
	public String getSeatType()
	{
		return seatType;
	}
	public void setSeatType(String seatType)
	{
		this.seatType = seatType;
	}
	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}
	public String getSeatNumbers()
	{
		return seatNumbers;
	}
	public void setSeatNumbers(String seatNumbers)
	{
		this.seatNumbers = seatNumbers;
	}
	public TheatreScreen getScreen()
	{
		return screen;
	}
	public void setScreen(TheatreScreen screen)
	{
		this.screen = screen;
	}
	
	
}
