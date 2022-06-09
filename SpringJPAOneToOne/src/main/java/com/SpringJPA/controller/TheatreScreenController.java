package com.SpringJPA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringJPA.Model.ResponseModel;
import com.SpringJPA.Model.TheatreScreenModel;
import com.SpringJPA.dao.TheatreScreenRepository;

@RestController
@RequestMapping("/api")
public class TheatreScreenController {

	@Autowired
	TheatreScreenRepository repository;
	
	@GetMapping("/theatre")
	public ResponseEntity<ResponseModel> getAllTheatreScreens()
	{
		ResponseModel response = ResponseModel.getInstance();
		response.setData(repository.findAll() );
		response.setMessage("ok count : "+repository.count());
		response.setStatusCode(HttpStatus.OK.value());
		
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	
	@PostMapping("/theatre")
	public ResponseEntity<ResponseModel> setTheatre(@RequestBody TheatreScreenModel model)
	{
		ResponseModel responseModel = ResponseModel.getInstance();
		responseModel.setData(repository.save(model));
		responseModel.setMessage("Success");
		responseModel.setStatusCode(HttpStatus.OK.value());
		return new ResponseEntity<ResponseModel>(responseModel,HttpStatus.OK);
	}
	
}
