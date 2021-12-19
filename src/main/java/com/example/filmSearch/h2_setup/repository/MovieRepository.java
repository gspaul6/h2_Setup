package com.example.filmSearch.h2_setup.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.filmSearch.h2_setup.model.Movie;


/**
 *  @author Gurpratap Singh Paul
 * This is the Movie Repository which used to make individual queries for Director Table
 */
@Repository
public interface MovieRepository extends CrudRepository<Movie,Integer> {

	@Query("Select m from Movie m where m.director.id=:director_id")
	List<Movie> findMovieByDirectorId(@Param("director_id") int id);

	@Query("Select m from Movie m join fetch m.actors a where a.id=:id ")
	List<Movie> findMovieById(@Param("id") int id_name);
	
	@Query("Select m.id from Movie m where m.title=:title")
    int getId_Movie(@Param("title") String name);
}
