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
class EnrolleesapiApplicationTestsUpdate {

	
	@Autowired
	private EnrolleeRepo enrolleeRepo;
	
	@Test
    @Order(3)    
	void updateReq() {
		System.out.println("test case updateReq.....!!");
		Optional<Enrollee> found = enrolleeRepo.findById(22);
		Enrollee tempEnrollee = found.get();
		tempEnrollee.setEnrollees_name("twentytwoUpdatedVal");
		
		enrolleeRepo.save(tempEnrollee);
	    // then
		System.out.println("Test cases success :: updateReq  ....+"+"twentytwoUpdatedVal"+"....."+found.get().getEnrollees_name());
	    assertEquals("twentytwoUpdatedVal",found.get().getEnrollees_name() );
	}
	
  
    
}
