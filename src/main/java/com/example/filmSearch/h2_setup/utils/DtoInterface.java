package com.example.filmSearch.h2_setup.utils;

import com.example.filmSearch.h2_setup.DTO.DtoName;
import com.example.filmSearch.h2_setup.model.Movie;

public interface DtoInterface {

	public static DtoName ToDtoName(Movie movie) {
		return new DtoName(movie.getTitle());
	}

	
	
}
