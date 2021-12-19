package com.example.filmSearch.h2_setup.service;

import java.util.List;

import com.example.filmSearch.h2_setup.DTO.DtoName;


/**
 * @author Gurpratap Singh Paul
 * This is the Service Interface which is further implemented by Different Services
 */
public interface FilmService {
	public List<DtoName>getMovie(String name);
}
