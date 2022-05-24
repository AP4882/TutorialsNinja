package com.tutorialsninja.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features= {"classpath:FeatureFiles/orders.feature"},
glue= {"classpath:com.tutorialsninja.automation.stepdef"},
plugin= {"html:target/cucumber_html_report"},
tags= {"@OrdersTest1"}
)
public class TestRunner {

}
