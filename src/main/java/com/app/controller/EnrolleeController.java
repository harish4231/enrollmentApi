package com.app.controller;

import java.util.List;

import com.app.exception.BadRequestException;
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

import com.app.model.Enrollee;
import com.app.service.EnrolleeService;

@RestController
@RequestMapping("/api/enrollees")
public class EnrolleeController {

	
	
	@Autowired
	EnrolleeService service;

	@ApiOperation(value= "Find All Enrollees")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Successfully retrieved list"),
			@ApiResponse(code=401, message="you are not authorized to view the resource"),
			@ApiResponse(code=404, message= "The resource you were trying to reach is not found")
	}
	)
	@GetMapping("/getAll")
	public List<Enrollee> getAllEnrollees(){
		return service.getAllEnrollees();
	}

	@ApiOperation(value= "Find Enrollees By Id numbers")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Successfully retrieved list"),
			@ApiResponse(code=401, message="you are not authorized to view the resource"),
			@ApiResponse(code=404, message= "The resource you were trying to reach is not found")
	}
	)
	@GetMapping("/getById")
	public Object getById(@RequestParam int id) throws Exception{
		
		Enrollee enrolleeObj = (Enrollee) (service.getEnrolleeById(id));
		if(enrolleeObj == null) {
			throw new BadRequestException("Invalid Input");
		}
		
		return enrolleeObj;
	}

	@ApiOperation(value= "Add Enrollees details to database")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Successfully retrieved list"),
			@ApiResponse(code=401, message="you are not authorized to view the resource"),
			@ApiResponse(code=404, message= "The resource you were trying to reach is not found")
	}
	)
	@PostMapping("/insertEnrollee")
	public Enrollee insertEnrollee(@RequestBody Enrollee std) {
		return service.save(std);
	}


	@ApiOperation(value= "Update enrollees details")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Successfully retrieved list"),
			@ApiResponse(code=401, message="you are not authorized to view the resource"),
			@ApiResponse(code=404, message= "The resource you were trying to reach is not found")
	}
	)
	@PutMapping("/updateEnrollee")
	public Enrollee updateEnrollee(@RequestBody Enrollee std) {
		return service.save(std);
	}

	@ApiOperation(value= "Delete Enrollees By Id numbers")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="Successfully retrieved list"),
			@ApiResponse(code=401, message="you are not authorized to view the resource"),
			@ApiResponse(code=404, message= "The resource you were trying to reach is not found")
	}
	)
	@DeleteMapping("/deleteEnrollee/{id}")
	public String deleteEnrollee(@PathVariable int id) {
		service.delete(id);
		return "success";
	}
	
	
}
