package com.example.filmSearch.h2_setup.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.filmSearch.h2_setup.model.Director;

@Repository
public interface DirectorRepository extends CrudRepository<Director,Integer>{

	@Query("Select d.id from Director d where d.name=:name")
    int getId_Director(@Param("name") String name);
}