package com.roscian;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import static com.roscian.helper.CucumberReport.generateReports;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","json:target/cucumber-parallel/cucumber.json"},
        features = "src/test/resources/Features/",
        glue = "com.roscian")
public class RunCucumberTest {
    @AfterClass
    public static void report(){
        generateReports();
    }
}
