package com.app.controller;

import java.util.List;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Dependent;
import com.app.service.DependentService;

@RestController
@RequestMapping("/api/dependents")
public class DependentController {

	
	
	@Autowired
	DependentService service;

	@ApiOperation(value= "Find All Dependents")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Successfully retrieved list"),
			@ApiResponse(code=401, message="you are not authorized to view the resource"),
			@ApiResponse(code=404, message= "The resource you were trying to reach is not found")
	}
	)
	@GetMapping("/getAll")
	public List<Dependent> getAllDependents(){
		return service.getAllDependents();
	}

	@ApiOperation(value= "Find Dependents based on Id")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Successfully retrieved list"),
			@ApiResponse(code=401, message="you are not authorized to view the resource"),
			@ApiResponse(code=404, message= "The resource you were trying to reach is not found")
	}
	)
	@GetMapping("/getById")
	public Object getById(@RequestParam int id){
		return service.getDependentById(id);
	}

	@ApiOperation(value= "Add new Dependents")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Successfully posted list"),
			@ApiResponse(code=401, message="you are not authorized to view the resource"),
			@ApiResponse(code=404, message= "The resource you were trying to reach is not found")
	}
	)
	@PostMapping("/insertDependent")
	public Dependent insertDependent(@RequestBody Dependent std) {
		return service.save(std);
	}


	@ApiOperation(value= "Update Dependent details")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Successfully posted list"),
			@ApiResponse(code=401, message="you are not authorized to view the resource"),
			@ApiResponse(code=404, message= "The resource you were trying to reach is not found")
	}
	)
	@PutMapping("/updateDependent")
	public Dependent updateDependent(@RequestBody Dependent std) {
		return service.save(std);
	}

	@ApiOperation(value= "Delete Dependent details")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Successfully posted list"),
			@ApiResponse(code=401, message="you are not authorized to view the resource"),
			@ApiResponse(code=404, message= "The resource you were trying to reach is not found")
	}
	)
	@DeleteMapping("/deleteDependent/{id}")
	public String deleteDependent(@PathVariable int id) {
		service.delete(id);
		return "success";
	}
	
	
}
