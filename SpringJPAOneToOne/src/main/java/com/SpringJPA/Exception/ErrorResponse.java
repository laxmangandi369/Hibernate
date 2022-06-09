package com.SpringJPA.Exception;

import java.util.Date;

public class ErrorResponse
{
	private Date timestamp;
	private String message;
	private String details;
	private int statusCode;
	private String error;
	public ErrorResponse(Date timestamp, String message, String details, int statusCode, String error)
	{
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
		this.statusCode = statusCode;
		this.error = error;
	}
	public Date getTimestamp()
	{
		return timestamp;
	}
	public void setTimestamp(Date timestamp)
	{
		this.timestamp = timestamp;
	}
	public String getMessage()
	{
		return message;
	}
	public void setMessage(String message)
	{
		this.message = message;
	}
	public String getDetails()
	{
		return details;
	}
	public void setDetails(String details)
	{
		this.details = details;
	}
	public int getStatusCode()
	{
		return statusCode;
	}
	public void setStatusCode(int statusCode)
	{
		this.statusCode = statusCode;
	}
	public String getError()
	{
		return error;
	}
	public void setError(String error)
	{
		this.error = error;
	}
	
	
}
