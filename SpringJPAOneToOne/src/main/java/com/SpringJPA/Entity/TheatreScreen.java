package com.SpringJPA.Entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="theatre_screens")
public class TheatreScreen {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String TheatreId;
	
	@OneToOne(mappedBy = "theatreScreen")
	MovieName movieName;
	
	@OneToMany
	@JoinColumn(name = "theatre_id")
	Set<MovieTickets> movieTickets;

	public TheatreScreen(String theatreId, MovieName movieName, Set<MovieTickets> movieTickets) {
		super();
		this.TheatreId = theatreId;
		this.movieName = movieName;
		this.movieTickets = movieTickets;
	}

	public TheatreScreen() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTheatreId() {
		return TheatreId;
	}

	public void setTheatreId(String theatreId) {
		TheatreId = theatreId;
	}

	public MovieName getMovieName() {
		return movieName;
	}

	public void setMovieName(MovieName movieName) {
		this.movieName = movieName;
	}

	public Set<MovieTickets> getMovieTickets() {
		return movieTickets;
	}

	public void setMovieTickets(Set<MovieTickets> movieTickets) {
		this.movieTickets = movieTickets;
	}

		
}
