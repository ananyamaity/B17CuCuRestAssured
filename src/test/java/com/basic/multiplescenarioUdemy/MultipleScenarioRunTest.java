//program not running

package com.basic.multiplescenarioUdemy;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src\\test\\resources\\com\\basic\\multiplescenarioFF"},
		glue= {"com\\basic\\multiplescenarioYouTube\\MultipleScenarioSd.java"}
		
		)

public class MultipleScenarioRunTest {
	

}


//C:\Users\chira\eclipse-workspace\B17CucuRestAssured\src\test\resources\com\basic\multiplescenarioFF

//C:\Users\chira\eclipse-workspace\B17CucuRestAssured\src\test\java\com\basic\multiplescenarioYouTube\MultipleScenarioSd.java

