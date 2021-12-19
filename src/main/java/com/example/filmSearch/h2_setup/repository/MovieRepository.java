package com.example.filmSearch.h2_setup.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.filmSearch.h2_setup.model.Movie;



public interface MovieRepository extends CrudRepository<Movie,Integer> {

	@Query("Select m from Movie m where m.director.id=:director_id")
	List<Movie> findMovieByDirectorId(@Param("director_id") int id);

	@Query("Select m from Movie m join fetch m.actors a where a.id=:id ")
	List<Movie> findMovieById(@Param("id") int id_name);
}
