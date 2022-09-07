package com.example;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AuthTesting {
	Authentication a;
	@Before
	public void createObject() {
		a= new Authentication();
		System.out.println("The object is created");
	}
	@Test
	public void test1() {
		String res = a.Auth("Admin", "Admin");
		assertEquals("Login Successful", res);
		System.out.println("Test 1 completed Successfully");
	}
	
	@Test
	public void test2() {
		String res = a.Auth("Admin", "admin");
		assertEquals("Login Failed", res);
		System.out.println("Test 2 completed Successfully");
	}
	@Test
	public void test3() {
		String res = a.Auth("", "admin");
		assertEquals("Enter the username or password", res);
		System.out.println("Test 3 completed Successfully");
	}
	
	@After
	public void destroyObj() {
		a=null;
		System.out.println("The object is destroyed");
	}

}
