package com.basic.formautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FormAutomationStepDef {
	WebDriver driver;
	//driver=new ChromeDriver();

	@Given("^launch the browser$")
	public void launch_the_browser() throws Throwable {
	 
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\chira\\Desktop\\SeleniumAnilSir\\chromedriver_win32_B45\\chromedriver.exe");
		  driver =new ChromeDriver(); 
		  driver.manage().window().maximize();

	}

	@When("^launch the url$")
	public void launch_the_url() throws Throwable {
		
		driver.get("http://demo.automationtesting.in/Register.html");

	}

	@Then("^enter the first name and second name$")
	public void enter_the_first_name_and_second_name() throws Throwable {
		
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Asha");
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Maity");
		

	}
	@Then("^close the application$")
	public void close_the_application() throws Throwable {
		driver.quit();
	    
	    
	}


}
