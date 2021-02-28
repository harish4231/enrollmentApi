package com.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.dao.EnrolleeRepo;
import com.app.model.Dependent;
import com.app.model.Enrollee;

@SpringBootTest
class EnrolleesapiApplicationTestsInsert {

	
	@Autowired
	private EnrolleeRepo enrolleeRepo;
	
	@Test
    @Order(1)    
	void postInsertreq() {
		System.out.println("test case postInsertreq.....!!");
	
	  Enrollee s1 = new Enrollee();
		s1.setActivation_status("Y");
		s1.setBirth_date("01/01/2001");
		s1.setEnrollees_id(22);
		s1.setEnrollees_name("twentytwo");
		s1.setPhone_number("504106504106");
		
		
		Dependent a1 = new Dependent();
		a1.setBirth_date("11/11/2011");
		a1.setDependents_name("twentytwo01dependent11");
		a1.setDependents_id(2201);
		
		Dependent a2 = new Dependent();
		a2.setBirth_date("22/12/2012");
		a2.setDependents_name("twentytwo02dependent22");
		a2.setDependents_id(2202);
		
		List list = new ArrayList();
		list.add(a1);
		list.add(a2);
		
		s1.setDependents(list);
		
		enrolleeRepo.save(s1);

	    // when
	    Optional<Enrollee> found = enrolleeRepo.findById(s1.getEnrollees_id());

	    // then
	    System.out.println("Test cases success :: postInsertreq  ....+"+s1.getEnrollees_name()+"....."+found.get().getEnrollees_name());
	    assertEquals(s1.getEnrollees_name(),found.get().getEnrollees_name() );
	    
	}    
	
	
    
}
