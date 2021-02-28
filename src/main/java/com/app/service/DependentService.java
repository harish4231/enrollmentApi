package com.app.service;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.model.Dependent;

@Service
public interface DependentService {

	
	
	public List<Dependent> getAllDependents();
	
	public Dependent getDependentById(int id);
	
	public Dependent save(Dependent s);
	
	public void delete(int id);
}