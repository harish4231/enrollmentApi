package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Enrollee;

public interface EnrolleeRepo extends JpaRepository<Enrollee, Integer> {

}