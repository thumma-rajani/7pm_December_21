package com.Amazon_Project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Logintestcase {
  @Test(priority=0)
  public void verify_valid_login() {
	  System.out.println("Valid login credentials");
  
  }
  @Test(priority=1)
  public void verify_invalid_login() {
	  System.out.println("InValid login credentials");
	  
  }
  @Test(priority=2)
    public void verif_link() {
    	String expname = "Google";
    	String actname = "google";
    	//Assertions are of2 types..Soft assertion and Hard assertion
    	//Soft ->assertEquals
    	//Hard->asserttrue or assertfalse
    	if(actname.equals(actname))
    	{
    		Assert.assertTrue(true);
    	}else
    	{
    		Assert.assertFalse(false);
    	}
    }
}
