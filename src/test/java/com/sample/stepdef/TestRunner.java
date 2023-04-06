package com.sample.stepdef;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
   //path of feature file
   features = "src/test/resources/Features",
   //path of step definition file
   glue = "com.sample.stepdef",
   tags="@zzzz",
   plugin = { "pretty", "html:target/cucumber-reports.html" }
   )
public class TestRunner {
}