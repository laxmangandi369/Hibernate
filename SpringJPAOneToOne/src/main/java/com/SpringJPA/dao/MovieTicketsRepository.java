package com.SpringJPA.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringJPA.Entity.MovieTickets;

@Repository
public interface MovieTicketsRepository extends JpaRepository<MovieTickets, Long> {
	

}
