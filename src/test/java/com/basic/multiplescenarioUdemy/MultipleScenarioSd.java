package com.basic.multiplescenarioUdemy;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultipleScenarioSd {
	WebDriver driver;

	@Given("^User need to be a facebook login page1$")
	public void user_need_to_be_a_facebook_login_page1() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\chira\\Desktop\\SeleniumAnilSir\\chromedriver_win32_B45\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

	}

	@When("^User enters user first name$")
	public void user_enters_user_first_name() throws Throwable {
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Amita");

	}

	@Then("^User checks user first name is present$")
	public void user_checks_user_first_name_is_present() throws Throwable {
		String actualname = driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("value");
		Assert.assertEquals(actualname, "Amrita");

	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
		driver.quit();

	}

	@Given("^user need to be a facebook login page$")
	public void user_need_to_be_a_facebook_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\chira\\Desktop\\SeleniumAnilSir\\chromedriver_win32_B45\\chromedriver.exe\");");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

	}

	@When("^enters the surname$")
	public void enters_the_surname() throws Throwable {
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sen");

	}

	@Then("^User mobile field should be blank$")
	public void user_mobile_field_should_be_blank() throws Throwable {
		String mobNo = driver.findElement(By.xpath("//input[@name='reg_email__']")).getAttribute("value");
		Assert.assertEquals(" ", mobNo);

	}

}
