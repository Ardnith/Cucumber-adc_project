package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature", glue = "com\\stepDefinition",dryRun = false,monochrome = true,plugin ={"pretty","html:target/Htmlreport/report.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class TestRunner_class {
	
	public static WebDriver driver;
	@BeforeClass
	public static void setUp() {

		driver=Base_Class.getbrowser("chrome");
	}

	@AfterClass
	public static void tearDown() {

	//	driver.close();
	}

}