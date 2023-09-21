package com.example.movielibrary.models;

public class Director {
	private int directorid;
	private String firstname;
	private String lastname;
	private String nationality;
	private String gender;
	private int awards;
	private String birthplace;

	public Director() {

	}

	public int getDirectorid() {
		return directorid;
	}

	public void setDirectorid(int directorid) {
		this.directorid = directorid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAwards() {
		return awards;
	}

	public void setAwards(int awards) {
		this.awards = awards;
	}

	public String getBirthplace() {
		return birthplace;
	}

	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}

}
