package com.example.filmSearch.h2_setup.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.filmSearch.h2_setup.model.Actor;
import com.example.filmSearch.h2_setup.model.Movie;
/**
 *  @author Gurpratap Singh Paul
 * This is the Actor Repository which used to make individual queries for an Actor Table
 */
@Repository
public interface ActorRepository extends CrudRepository<Actor,Integer> {
	
	@Query("Select a.id from Actor a where a.name=:name")
    int getId_Actor(@Param("name") String name);
	
	@Query("Select a from Actor a join fetch a.movies m where m.id=:id ")
	List<Actor> findMovieById(@Param("id") int id_name);

}
