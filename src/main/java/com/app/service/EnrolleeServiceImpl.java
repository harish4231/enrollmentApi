package com.app.service;
import java.util.List;
import java.util.Optional;

import com.app.exception.BadRequestException;
import com.app.exception.NotFoundException;
import com.app.model.Dependent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.EnrolleeRepo;
import com.app.model.Enrollee;

@Service
public class EnrolleeServiceImpl implements EnrolleeService {

	@Autowired
	EnrolleeRepo repo;
	
	public List<Enrollee> getAllEnrollees(){
		return repo.findAll();
	}
	
	public Enrollee getEnrolleeById(int id){
		return repo.findById(id).orElseThrow(() -> new NotFoundException("Enrollee with id " + id + " does not exist"));
	}
	
	public Enrollee save(Enrollee s) {
		Optional<Enrollee> mayExists = repo.findById(s.getEnrollees_id());
		if (mayExists.isPresent()) {
			throw new BadRequestException("Enrollee with id " + s.getEnrollees_id() + " already exists");
		}
		return repo.save(s);
	}
	
	public void delete(int id) {
		Enrollee enrollee= repo.findById(id).orElseThrow(() -> new NotFoundException("Enrollee with id " + id + " does not exist"));
		repo.deleteById(id);
	}
}