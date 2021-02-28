package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Dependent;

public interface DependentRepo extends JpaRepository<Dependent, Integer> {

}