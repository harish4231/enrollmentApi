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
class EnrolleesapiApplicationTestsDelete {


	    @Autowired
	    private EnrolleeRepo enrolleeRepo;
	    
    @Test
    @Order(4)    
	void deleteReq() {
		System.out.println("test case deleteReq.....!!");
		Optional<Enrollee> found = enrolleeRepo.findById(22);
		
		Enrollee tempEnrollee= (Enrollee ) found.get();
		tempEnrollee.setEnrollees_name("twentytwoUpdatedVal");
		
		enrolleeRepo.deleteById(tempEnrollee.getEnrollees_id());
		found = enrolleeRepo.findById(22);
	    // then
		System.out.println("Test cases success :: deleteReq  ....+"+false+"....."+found.isPresent() );
		assertEquals(false,found.isPresent() );

	}
    
}
