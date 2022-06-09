package com.SpringJPA.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;
import com.SpringJPA.Entity.TheatreScreen;
import com.SpringJPA.dao.TheatreScreenRepository;

@Service
public class TheatreScreenServiceImpl implements TheatreScreenService
{
	@Autowired
	TheatreScreenRepository repository;
	
	@Autowired
	ModelMapper mapper;

	@Override
	public Object getAllTheatreScreen()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object findByTheatreId(String id)
	{
		// TODO Auto-generated method stub
		return null;
	}

 
}
