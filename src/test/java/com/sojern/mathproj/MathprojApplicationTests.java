package com.sojern.mathproj;

import com.sojern.mathproj.controller.MathController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions;
@SpringBootTest
class MathprojApplicationTests {

	@Autowired
	private MathController controller;


	@Test
	void contextLoads() {
		Assertions.assertNotNull(controller);
	}

}
