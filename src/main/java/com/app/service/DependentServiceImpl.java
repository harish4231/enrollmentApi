package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.exception.BadRequestException;
import com.app.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.DependentRepo;
import com.app.model.Dependent;

@Service
public class DependentServiceImpl implements DependentService {

	@Autowired
	DependentRepo repo;
	
	public List<Dependent> getAllDependents()
	{

		return repo.findAll();
	}
	
	public Dependent getDependentById(int id){
		return repo.findById(id).orElseThrow(() -> new NotFoundException("Dependent with id " + id + " does not exist"));
	}
	
	public Dependent save(Dependent s) {
		Optional<Dependent> mayExists = repo.findById(s.getDependents_id());
		if (mayExists.isPresent()) {
			throw new BadRequestException("Dependent with id " + s.getDependents_id() + " already exists");
		}
		return repo.save(s);
	}
	
	public void delete(int id) {
		Dependent dep=repo.findById(id).orElseThrow(() -> new NotFoundException("Dependent with id " + id + " does not exist"));
		repo.deleteById(id);
	}
}