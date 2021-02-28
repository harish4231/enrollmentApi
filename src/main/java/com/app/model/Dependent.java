package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dependent {

	
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int dependents_id;

	@Column
	private String dependents_name;

	@Column
	private String birth_date;

	public int getDependents_id() {
		return dependents_id;
	}

	public void setDependents_id(int dependents_id) {
		this.dependents_id = dependents_id;
	}
	
	/*
	 * @Column private int enrollees_id;
	 * 
	 * 
	 * 
	 * public int getEnrollees_id() { return enrollees_id; }
	 * 
	 * public void setEnrollees_id(int enrollees_id) { this.enrollees_id =
	 * enrollees_id; }
	 */

	public String getDependents_name() {
		return dependents_name;
	}

	public void setDependents_name(String dependents_name) {
		this.dependents_name = dependents_name;
	}

	public String getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}
	
	

		
}