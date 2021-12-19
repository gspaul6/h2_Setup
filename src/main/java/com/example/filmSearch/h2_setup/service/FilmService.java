package com.example.filmSearch.h2_setup.service;

import java.util.List;

import com.example.filmSearch.h2_setup.model.Movie;


public interface FilmService {
	public List<Movie>getMovie(String name);
}
