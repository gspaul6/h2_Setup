package com.example.filmSearch.h2_setup.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.filmSearch.h2_setup.model.Movie;
import com.example.filmSearch.h2_setup.repository.DirectorRepository;
import com.example.filmSearch.h2_setup.repository.MovieRepository;
import com.example.filmSearch.h2_setup.service.FilmService;


import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
@NoArgsConstructor
public class DirectorServiceImplementation implements FilmService{

	@Autowired
	private MovieRepository movieRepository;
	
	public void setMovieRepository(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}
	
	@Autowired
	private DirectorRepository directorRepository;
	
	
	public void setDirectorRepository(DirectorRepository directorRepository) {
		this.directorRepository = directorRepository;
	}
	@Override
	public List<Movie> getMovie(String name) {
		int id_name = directorRepository.getId_Director(name);
		
		return movieRepository.findMovieByDirectorId(id_name);
	}

}
