package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;

public class User {
    private int id;
    private String name;
    private LocalDate birthDate;

    public User(int id, String name, LocalDate birthDate) {
	super();
	this.id = id;
	this.name = name;
	this.birthDate = birthDate;
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

    public LocalDate getBirthDate() {
	return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
	this.birthDate = birthDate;
    }

    @Override
    public String toString() {
	return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
    }

}
