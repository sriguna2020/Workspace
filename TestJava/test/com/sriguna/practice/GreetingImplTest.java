package com.sriguna.practice;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GreetingImplTest {

	private Greeting greet;

	@Before
	public void setup() {
		System.err.println("setup()");
		greet = new GreetingImpl();

	}

	@Test
	public void greetShouldReturnValidOutput() {

		System.out.println("greetShouldReturnValidOutput()");
		String greetStmt = greet.greet("JUnit");
		assertNotNull(greetStmt);
		assertEquals("Hello JUnit", greetStmt);

	}

	@Test(expected = IllegalArgumentException.class)
	public void greetShouldGiveException_For_NameIsNull() {

		System.out.println("greetShouldGiveException_For_NameIsNull()");
		greet.greet(null);

	}

	@Test(expected = IllegalArgumentException.class)
	public void greetShouldGiveException_For_NameIsBlank() {

		System.out.println("greetShouldGiveException_For_NameIsBlank()");
		greet.greet("");

	}

	
	@After
	public void cleanUp(){
		
		System.err.println("cleanUp()");
		greet = null;
		
	}
	
	
}
