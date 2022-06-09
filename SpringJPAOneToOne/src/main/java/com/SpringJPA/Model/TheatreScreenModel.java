package com.SpringJPA.Model;

import java.util.Set;
import com.SpringJPA.Entity.MovieName;
import com.SpringJPA.Entity.MovieTickets;

public class TheatreScreenModel
{
	String theatreId;
	MovieName movieplaying;
	Set<MovieTickets> totalbookedtickets;
	public String getTheatreId()
	{
		return theatreId;
	}
	public void setTheatreId(String theatreId)
	{
		this.theatreId = theatreId;
	}
	public MovieName getMovieplaying()
	{
		return movieplaying;
	}
	public void setMovieplaying(MovieName movieplaying)
	{
		this.movieplaying = movieplaying;
	}
	public Set<MovieTickets> getTotalbookedtickets()
	{
		return totalbookedtickets;
	}
	public void setTotalbookedtickets(Set<MovieTickets> totalbookedtickets)
	{
		this.totalbookedtickets = totalbookedtickets;
	}
	
	
	

}
