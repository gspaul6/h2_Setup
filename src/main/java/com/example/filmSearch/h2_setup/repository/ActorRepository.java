package com.example.filmSearch.h2_setup.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.filmSearch.h2_setup.model.Actor;

@Repository
public interface ActorRepository extends CrudRepository<Actor,Integer> {
	
	@Query("Select a.id from Actor a where a.name=:name")
    void getId_Actor(@Param("name") String name);

}
