package com.SpringJPA.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringJPA.Entity.TheatreScreen;
import com.SpringJPA.Model.TheatreScreenModel;
@Repository
public interface TheatreScreenRepository extends JpaRepository<TheatreScreen, Long> {

	Object save(TheatreScreenModel model);

}
