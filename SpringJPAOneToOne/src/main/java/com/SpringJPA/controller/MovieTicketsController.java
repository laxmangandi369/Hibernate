package com.SpringJPA.controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.SpringJPA.Model.MovieTicketModel;
import com.SpringJPA.Model.ResponseModel;
import com.SpringJPA.Service.MovieTicketsService;

@Controller
//@RequestMapping(name = "/api")
public class MovieTicketsController {

	@Autowired
	MovieTicketsService movieTicketsService;
	
	@GetMapping("/tickets")
	public ResponseEntity<ResponseModel> tickets()
	{
		ResponseModel responseModel = ResponseModel.getInstance();
		responseModel.setData(movieTicketsService.getAllMovieTickets());
		responseModel.setMessage("successful");
		responseModel.setStatusCode(HttpStatus.OK.value());
		
		return new ResponseEntity<>(responseModel,HttpStatus.OK);
	}
	
	@PostMapping("/tickets")
	public ResponseEntity<ResponseModel> tickets(@RequestBody MovieTicketModel model)
	{
		ResponseModel responseModel = ResponseModel.getInstance();
		responseModel.setData(movieTicketsService.saveMovieTickets(model));
		responseModel.setMessage("successfull");
		responseModel.setStatusCode(HttpStatus.OK.value());
	
		return new ResponseEntity<>(responseModel,HttpStatus.OK);
	}
	
	@GetMapping("/tickets/{name}")
	public ResponseEntity<ResponseModel> getTicketByName(@RequestParam(name = "name", required = true) String name)
	{
		ResponseModel responseModel = ResponseModel.getInstance();
		responseModel.setData(movieTicketsService.findByMovieName(name));
		responseModel.setMessage("successfull");
		responseModel.setStatusCode(HttpStatus.OK.value());
	
		return new ResponseEntity<>(responseModel,HttpStatus.OK);
	}
	
	@DeleteMapping("/tickets")
	public ResponseEntity<ResponseModel> delete(@RequestParam(name="id",required = true) Long id)
	{
		ResponseModel response = ResponseModel.getInstance();
		response.setData(movieTicketsService.deleteMovieTicket(id));
		response.setMessage("Successfull");
		response.setStatusCode(HttpStatus.OK.value());
		
		return new ResponseEntity<ResponseModel>(response,HttpStatus.OK);
	}
}
