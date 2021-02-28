package com.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.app.dao.EnrolleeRepo;
import com.app.model.Enrollee;

@SpringBootTest
class EnrolleesapiApplicationTestsFind {

	
	@Autowired
	private EnrolleeRepo enrolleeRepo;
	    
	    
	
	@Test
    @Order(2)    
	void getreq() {
		System.out.println("test case getreq.....!!");
		
		Optional<Enrollee> found = enrolleeRepo.findById(22);

	    // then
		System.out.println("Test cases success :: getreq  ....+"+"twentytwo"+"....."+found.get().getEnrollees_name());
	    assertEquals("twentytwo",found.get().getEnrollees_name() );
		
	}
	
	
	
	
    
}
