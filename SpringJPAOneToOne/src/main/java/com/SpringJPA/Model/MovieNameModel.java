package com.SpringJPA.Model;

import java.io.Serializable;
import com.SpringJPA.Entity.TheatreScreen;

public class MovieNameModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String name;
	String description;
	TheatreScreen screen;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}
	public TheatreScreen getScreen()
	{
		return screen;
	}
	public void setScreen(TheatreScreen screen)
	{
		this.screen = screen;
	}
	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}
	
	
}
