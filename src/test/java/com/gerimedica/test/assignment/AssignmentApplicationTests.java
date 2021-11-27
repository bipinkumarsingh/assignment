package com.gerimedica.test.assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gerimedica.test.assignment.model.Data;
import com.gerimedica.test.assignment.repository.DataRepository;

@SpringBootTest
class AssignmentApplicationTests {

	@Autowired
	DataRepository dataRepository;
	
	
	@Test
	public void testgetData() {
		//Data data = dataRepository.findByCode("271636001");
		//assertEquals("271636001", data.getCode());
	}

}
