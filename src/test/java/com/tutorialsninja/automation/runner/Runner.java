package com.tutorialsninja.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features= {"classpath:FeatureFiles/Login.feature","classpath:FeatureFiles/Register.feature"},
glue= {"classpath:com.tutorialsninja.automation.stepdef"},
plugin= {"html:target/cucumber_html_report"}
//tags= {"@LoginTest1,@LoginTest2,@LoginTest3,@LoginTest4"}
)
public class Runner {

}
