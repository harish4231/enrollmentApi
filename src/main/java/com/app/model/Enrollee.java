package com.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Enrollee {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int enrollees_id;

	@Column
	private String enrollees_name;

	@Column
	private String birth_date;

	@Column
	private String phone_number;
	
	@Column
	private String activation_status;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "enrollees_id", referencedColumnName = "enrollees_id")
	List<Dependent> dependents;

	public List<Dependent> getDependents() {
		return dependents;
	}

	public void setDependents(List<Dependent> dependents) {
		this.dependents = dependents;
	}

	public int getEnrollees_id() {
		return enrollees_id;
	}

	public void setEnrollees_id(int enrollees_id) {
		this.enrollees_id = enrollees_id;
	}

	public String getEnrollees_name() {
		return enrollees_name;
	}

	public void setEnrollees_name(String enrollees_name) {
		this.enrollees_name = enrollees_name;
	}

	public String getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getActivation_status() {
		return activation_status;
	}

	public void setActivation_status(String activation_status) {
		this.activation_status = activation_status;
	}

	
}