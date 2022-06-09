package com.SpringJPA.Service;

import org.springframework.stereotype.Service;

import com.SpringJPA.Model.MovieTicketModel;

@Service
public interface MovieTicketsService {
	
	Object getAllMovieTickets();
	Object saveMovieTickets(MovieTicketModel movieTicket);
	Object findByMovieName(String movieName);
	Object deleteMovieTicket(Long id);

}
