package com.multithreading.executor.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "USER_TBL")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private String gender;
    
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;		
	}
	public void setEmail(String email) {
		this.email = email;
		
	}
	public void setGender(String gender) {
		this.gender = gender;
		
	}
	 public int getId() {
			return id;
	 }	
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getGender() {
		return gender;
	}

}