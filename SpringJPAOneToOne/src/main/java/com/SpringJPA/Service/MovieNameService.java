package com.SpringJPA.Service;

import org.springframework.stereotype.Service;

import com.SpringJPA.Model.MovieNameModel;
import com.SpringJPA.Model.MovieTicketModel;

@Service
public interface MovieNameService {

	
	Object getAllMovieName();
	Object saveMovieName(MovieNameModel movieName);
	Object findByMovieName(String movieName);
	Object deleteMovieName(Long id);
}
