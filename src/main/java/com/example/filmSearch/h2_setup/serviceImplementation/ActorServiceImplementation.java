package com.example.filmSearch.h2_setup.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.filmSearch.h2_setup.model.Movie;
import com.example.filmSearch.h2_setup.repository.ActorRepository;
import com.example.filmSearch.h2_setup.repository.MovieRepository;
import com.example.filmSearch.h2_setup.service.FilmService;

public class ActorServiceImplementation implements FilmService{

	
	@Autowired
	private MovieRepository movieRepository;
	
	public void setMovieRepository(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}
	
	
	@Autowired
	private ActorRepository actorRepository;
	
	
	public void setDirectorRepository(ActorRepository actorRepository) {
		this.actorRepository = actorRepository;
	}
	@Override
	public List<Movie> getMovie(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
