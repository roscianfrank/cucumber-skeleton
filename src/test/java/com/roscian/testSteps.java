package com.roscian;

import io.cucumber.java.en.Given;
import org.junit.Assert;

import static com.roscian.baseClass.driver;

public class testSteps {
    @Given("test cucumber")
    public void testCucumber() {
        System.out.println("Hello world");
        driver.get("https://www.google.com/");
        Assert.assertEquals("Google", driver.getTitle());
    }
}
