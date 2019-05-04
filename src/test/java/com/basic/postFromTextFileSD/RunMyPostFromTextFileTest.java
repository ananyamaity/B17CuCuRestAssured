package com.basic.postFromTextFileSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)
@CucumberOptions(
		
			monochrome=true,
			dryRun=false,
			features= {"src/test/resources/com/basic/postFromTextFileFF"},
			glue={"com/basic/postUpdatedJsonSD"},
			plugin={"pretty",
					"html:target/cucumber-htmlreport",
					"json:target/cucumber-report5.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
			}
		)
		

public class RunMyPostFromTextFileTest {


}




 

///B17CucuRestAssured/src/test/java/com/basic/postUpdatedJsonSD  ==step def for glue code
//src\test\resources\com\basic\postFromTextFileFF =feature file