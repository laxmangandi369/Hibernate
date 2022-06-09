package com.SpringJPA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.SpringJPA.Model.MovieNameModel;
import com.SpringJPA.Model.MovieTicketModel;
import com.SpringJPA.Model.ResponseModel;
import com.SpringJPA.Service.MovieNameService;

@Controller
public class MovieNameController {
	
	@Autowired
	MovieNameService movieNameService;
	
	
	@GetMapping("/movies")
	public ResponseEntity<ResponseModel> getMovies()
	{
		ResponseModel model = ResponseModel.getInstance();
		model.setData(movieNameService.getAllMovieName());
		model.setMessage("Success");
		model.setStatusCode(HttpStatus.OK.value());
		
		return new ResponseEntity<>(model,HttpStatus.OK);
	}
	
	@PostMapping("/movies")
	public ResponseEntity<ResponseModel> tickets(@RequestBody MovieNameModel model)
	{
		ResponseModel responseModel = ResponseModel.getInstance();
		responseModel.setData(movieNameService.saveMovieName(model));
		responseModel.setMessage("successfull");
		responseModel.setStatusCode(HttpStatus.OK.value());
	
		return new ResponseEntity<>(responseModel,HttpStatus.OK);
	}

}
