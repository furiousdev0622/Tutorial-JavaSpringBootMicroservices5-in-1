package com.in28minutes.rest.webservices.restfulwebservices.user;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Post {

    @Id
    @GeneratedValue
    private Integer id;

    private String description;

    public Integer getId() {
	return id;
    }
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private User user;

    public void setId(Integer id) {
	this.id = id;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    @Override
    public String toString() {
	return "Post [id=" + id + ", description=" + description + "]";
    }

}
