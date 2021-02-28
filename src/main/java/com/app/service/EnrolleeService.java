package com.app.service;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.model.Enrollee;

@Service
public interface EnrolleeService {

	
	
	public List<Enrollee> getAllEnrollees();
	
	public Enrollee getEnrolleeById(int id);
	
	public Enrollee save(Enrollee s);
	
	public void delete(int id);
}