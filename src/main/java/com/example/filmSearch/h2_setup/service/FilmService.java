package com.example.filmSearch.h2_setup.service;

import java.util.List;

import com.example.filmSearch.h2_setup.DTO.DtoName;



public interface FilmService {
	public List<DtoName>getMovie(String name);
}
