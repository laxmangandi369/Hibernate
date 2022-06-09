package com.SpringJPA.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.websocket.server.ServerEndpoint;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringJPA.Entity.MovieTickets;
import com.SpringJPA.Model.MovieTicketModel;
import com.SpringJPA.dao.MovieTicketsRepository;

@Service
public class MovieTicketServiceImpl implements MovieTicketsService {
	
	@Autowired
	MovieTicketsRepository movieTicketsRepository;
	
	@Autowired
	ModelMapper mapper;

	@Override
	public Object getAllMovieTickets() {
		Map<String ,Object> data = new HashMap<String, Object>();
		
		List<MovieTickets> allTickets = movieTicketsRepository.findAll();
		data.put("allTickets", allTickets);
		return data;
	}

	@Override
	public Object saveMovieTickets(MovieTicketModel movieTicket) {
		MovieTickets movieTickets = mapper.map(movieTicket, MovieTickets.class);
		try {
			movieTicketsRepository.save(movieTickets);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	

	@Override
	public Object deleteMovieTicket(Long id) {
		MovieTickets movieTickets=null;
		
		movieTickets = movieTicketsRepository.getReferenceById(id);
		if(movieTickets!=null)
		{
			movieTicketsRepository.delete(movieTickets);
		}
		else
		{
			throw new RuntimeException("cant find the ticket with ticket id "+id);
		}

		return null;
	}

	@Override
	public Object findByMovieName(String movieName)
	{
	  List<MovieTickets> movieTicket = (List<MovieTickets>) movieTicketsRepository.findAll();
	  for(int i=0;i<movieTicket.size();i++)
	  {
		  if(movieTicket.get(i).getMovieName().equals(movieName))
		  {
			  return movieTicket.get(i);
		  }
		  
	  }
	  return null;
	}

}
