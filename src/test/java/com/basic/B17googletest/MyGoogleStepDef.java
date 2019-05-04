package com.basic.B17googletest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class MyGoogleStepDef {
	Response res;
	
	@Given("^i want to open Google$")
	public void i_want_to_open_Google() throws Throwable {
		System.out.println("Hitting Google.com");
		res=RestAssured.given().get("https://www.google.com");
	   }

/*	@Then("^I want to check \"([^\"]*)\" status code$")
	public void i_want_to_check_status_code(String st ) throws Throwable {
		System.out.println("Validating status code");
		
		int stcode=res.getStatusCode();
		Integer.toString(stcode);
		Assert.assertEquals(200, stcode);
		
		
		
	  }*/

@Then("^I want to check \"([^\"]*)\" status code$")
public void i_want_to_check_status_code(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Validating status code");
	
	int stcode=res.getStatusCode();
	String scode=Integer.toString(stcode);
	Assert.assertEquals(arg1, 	scode);
	  
}


}
