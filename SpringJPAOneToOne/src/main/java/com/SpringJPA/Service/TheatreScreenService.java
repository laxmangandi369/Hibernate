
package com.SpringJPA.Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import com.SpringJPA.Entity.TheatreScreen;
@Service
public interface TheatreScreenService
{
	Object getAllTheatreScreen();
	Object findByTheatreId(String id);
}
