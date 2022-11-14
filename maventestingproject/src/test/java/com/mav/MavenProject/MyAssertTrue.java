package com.mav.MavenProject;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MyAssertTrue {
	public boolean isEvenNumber(int number) {
		boolean result= true;
		if(number%2==0) {
			result= true;	
		}
		return result;	
	}
	@Test
	public void evenNumberTest() {
		MyAssertTrue ast= new MyAssertTrue();
		assertTrue(ast.isEvenNumber(6));
	}

}




