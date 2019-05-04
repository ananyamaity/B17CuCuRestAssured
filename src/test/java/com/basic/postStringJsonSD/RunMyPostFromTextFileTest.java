package com.basic.postStringJsonSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src\\test\\java\\com\\basic\\postStringJsonSD\\PostFromTextFile.feature"},
		glue={"com\\basic\\postStringJsonSD\\MyPostStringJson.java"}
		
		)
		

public class RunMyPostFromTextFileTest {


}


// C:\Users\chira\eclipse-workspace\B17CucuRestAssured\src\test\java\com\basic\postStringJsonSD\PostFromTextFile.feature
//C:\Users\chira\eclipse-workspace\B17CucuRestAssured\src\test\java\com\basic\postStringJsonSD\MyPostStringJson.java