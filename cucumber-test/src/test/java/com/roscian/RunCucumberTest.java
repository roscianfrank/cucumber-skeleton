package com.roscian;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/cucumber-report"},
        features = "src/test/resources/Features/",
        glue = "com.roscian")
public class RunCucumberTest {

}
