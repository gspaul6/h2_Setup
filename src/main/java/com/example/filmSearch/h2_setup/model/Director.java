package com.example.filmSearch.h2_setup.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.Data;
/**
 *  @author Gurpratap Singh Paul
 * This is the Entity class Director which maps Director Table
 * Here we have used One to Many Mapping Between Director and Movie Table
 */
@Entity
@Data
@Table(name="director")
public class Director implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="name")
	private String name;
	
	@OneToMany(
			mappedBy="director",
			cascade=CascadeType.ALL,
			orphanRemoval=true			
			)
	private List<Movie> movies = new ArrayList<>();
	
	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	public Director(String name) {
				
		this.name = name;
	}

	public Director() {
				
	}	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}