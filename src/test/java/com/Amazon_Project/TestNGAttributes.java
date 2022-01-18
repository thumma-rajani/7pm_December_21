package com.Amazon_Project;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGAttributes {

	@Test(priority = 0, description = "My selenium training", invocationCount = 3, invocationTimeOut = 4000, groups = "Test1", timeOut = 4000)
	public void Test1() {
		System.out.println("Rajini1");
	}
	
	@Test (priority = 1, description = "Location is hyderabad", groups = "Test2")
	public void Test2() {
		System.out.println("Rajini2");
	}
	@Ignore
	@Test (groups= {"Test1","Test2"})
	public void Test3() {
		System.out.println("Groups Execution");
	}

	@Test
	public void method1()
	{
		System.out.println("TestMethod 1");
	}
	
	@Test
	public void method2()
	{
		System.out.println("TestMethod 2");
	}
	
	@Test(dependsOnMethods = {"method1","method2"})
	public void testMethods()
	{
		System.out.println("Run Test Methods");
	}
}
