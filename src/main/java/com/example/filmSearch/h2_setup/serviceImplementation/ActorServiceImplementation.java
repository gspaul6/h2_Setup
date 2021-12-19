package com.example.filmSearch.h2_setup.serviceImplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.filmSearch.h2_setup.DTO.DtoName;
import com.example.filmSearch.h2_setup.model.Movie;
import com.example.filmSearch.h2_setup.repository.ActorRepository;
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
public class ActorServiceImplementation implements FilmService{

	
	@Autowired
	private MovieRepository movieRepository;
	
	public void setMovieRepository(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}
	
	
	@Autowired
	private ActorRepository actorRepository;
	
	
	public void setActorRepository(ActorRepository actorRepository) {
		this.actorRepository = actorRepository;
	}
	@Override
	public List<DtoName> getMovie(String name) {
		int id_name = actorRepository.getId_Actor(name);
		System.out.println(id_name);
		List<DtoName> names_list = new ArrayList<>();
		List<Movie> movie_list = movieRepository.findMovieById(id_name);
		names_list=movie_list.stream().map(m->DtoInterface.ToDtoName(m)).collect(Collectors.toList());
		return names_list;
	}

}
