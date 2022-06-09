package com.SpringJPA.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringJPA.Entity.MovieName;
import com.SpringJPA.Model.MovieNameModel;
import com.SpringJPA.dao.MovieNameRepository;

@Service
public class MovieNameServiceImpl implements MovieNameService
{
	@Autowired
	MovieNameRepository movieNameRepository;
	
	@Autowired
	ModelMapper mapper;

	@Override
	public Object getAllMovieName() {
		Map<String,Object> data = new HashMap<>();
		List<MovieName> name= movieNameRepository.findAll();
		data.put("names",name);
		return data;
	}

//	@Override
//	public Object saveMovieName(MovieNameModel movieName) {
//		MovieNameModel movieNam = mapper.map(movieName, MovieNameModel.class);
//		try {
//			movieNameRepository.saveAll(movieNam);
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}

	@Override
	public Object findByMovieName(String movieName) {
			Map<String,Object> data = new HashMap<String, Object>();
			MovieName moviename= null;
			moviename = (MovieName)movieNameRepository.findByName(movieName);
			if(moviename!=null)
			{
				data.put("tickets",mapper.map(moviename, MovieNameModel.class));
			}
			else {
				throw new RuntimeException("no tickets found for "+movieName);
			}
			return data;
	}

	@Override
	public Object deleteMovieName(Long id) {
		MovieName movieName=null;
		
		movieName = movieNameRepository.getReferenceById(id);
		if(movieName!=null)
		{
			movieNameRepository.delete(movieName);
		}
		else
		{
			throw new RuntimeException("cant find the ticket with ticket id "+id);
		}

		return null;
	}

	@Override
	public Object saveMovieName(MovieNameModel movieName) {
		MovieName mName = mapper.map(movieName, MovieName.class);
		try {
			movieNameRepository.save(mName);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
