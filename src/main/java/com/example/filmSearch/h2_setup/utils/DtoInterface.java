package com.example.filmSearch.h2_setup.utils;

import com.example.filmSearch.h2_setup.DTO.DtoName;
import com.example.filmSearch.h2_setup.model.Actor;
import com.example.filmSearch.h2_setup.model.Movie;
/**
 * @author Gurpratap Singh Paul
 * This interface take an object of Movie or Actor class and return an Object of an Dto 
 */
public interface DtoInterface {

	public static DtoName ToDtoName(Movie movie) {
		return new DtoName(movie.getTitle());
	}

	public static DtoName ToDtoName_Actor(Actor actor) {
		return new DtoName(actor.getName());
	}
	
	
}
