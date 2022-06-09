package com.SpringJPA.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringJPA.Entity.MovieName;

@Repository
public interface MovieNameRepository extends JpaRepository<MovieName, Long> {
	List<MovieName> findByName(String name);

}
