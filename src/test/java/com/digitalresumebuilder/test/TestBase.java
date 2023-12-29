package com.digitalresumebuilder.test;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestBase {
	WebDriver driver;
	public static Properties prop= null;
	@BeforeTest
	public  void set() throws IOException {
		prop= new Properties();
		FileInputStream inputfile = new FileInputStream("D:\\eclipse\\workspace\\digitalresume\\digitalresumebuilder\\src\\test\\resources\\Folder\\login.features");
	     prop.load(inputfile);
           driver =new ChromeDriver();

		driver.get(prop.getProperty("url"));

	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

	}
	}


