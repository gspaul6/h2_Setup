package com.example.filmSearch.h2_setup.DTO;

/**
 * 
 * This is the Dto class Dto Name which is used to return information to the client, instead of the real object
 * 
 *
 * @author Gurpratap Singh Paul
 *
 */
public class DtoName {
	
	private String name;

	public DtoName() {
		
	}

	public DtoName(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "DtoName [name of the movie =" + name + "]";
	}
	

}
