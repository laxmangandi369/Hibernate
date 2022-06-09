package com.SpringJPA.Exception;

import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler
{
	@ExceptionHandler
	public ErrorResponse exception(TicketNotFoundException ex)
	{
		return new ErrorResponse(new Date(),"Page not Found", ex.getMessage(),HttpStatus.NOT_FOUND.value(),ex.getMessage());
	}
	
}
