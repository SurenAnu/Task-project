package org.Globel_Runner;

import org.Base_Class.Base_Classes;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\org\\Globel_feature\\globel.feature" , glue = "org.Globel_Stepdefinition"
,monochrome = true,
plugin = {"html:Report/rep.html ", "pretty" } )

public class Runner_class  {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void Start() {
		FirefoxOptions opt = new FirefoxOptions();
		opt.addArguments("private window");
	 driver = new FirefoxDriver(opt);
	 Base_Classes.max(driver);
		
	}
	@AfterClass
		public static void stop(){
	//driver.quit();
	
}}
