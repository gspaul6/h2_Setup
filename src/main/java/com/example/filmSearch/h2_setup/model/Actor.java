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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
/**
 *  @author Gurpratap Singh Paul
 * This is the Entity class Actor which maps Actor Table
 * Here we have used Many to Many Mapping Between Actor and Movie Table
 */
@Entity
@Data
@Table(name="actor")
public class Actor implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="name")
	private String name;

	@ManyToMany
	@JoinTable(
			name="actor_movie",
			joinColumns = @JoinColumn(name="actor_id"),
			inverseJoinColumns = @JoinColumn(name="movie_id")
			)
	private List<Movie>movies = new ArrayList<>();	

	public void setMovies(Movie movies) {
		this.movies.add(movies);
	}

	public Actor( String name) {				
		this.name = name;
	}

	public Actor() {


	}

	public int getId() {
		return id;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}