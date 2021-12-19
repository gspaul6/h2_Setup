package com.example.filmSearch.h2_setup.serviceImplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.filmSearch.h2_setup.DTO.DtoName;
import com.example.filmSearch.h2_setup.model.Movie;
import com.example.filmSearch.h2_setup.repository.DirectorRepository;
import com.example.filmSearch.h2_setup.repository.MovieRepository;
import com.example.filmSearch.h2_setup.service.FilmService;
import com.example.filmSearch.h2_setup.utils.DtoInterface;

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
	public List<DtoName> getMovie(String name) {
		int id_name = directorRepository.getId_Director(name);
		List<DtoName> names_list = new ArrayList<>();
		List<Movie> movie_list = movieRepository.findMovieByDirectorId(id_name);
		names_list=movie_list.stream().map(m->DtoInterface.ToDtoName(m)).collect(Collectors.toList());
		return names_list;
	}

}
