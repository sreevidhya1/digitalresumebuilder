package com.digitalresumebuilder.test;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;


import com.digitalresumebuilder.pages.LoginPage1;

public class TestBase {
	WebDriver driver;
	LoginPage1 log = null;
	public static Properties prop= null;
	@BeforeMethod
	public  void set() throws IOException, InterruptedException {
		prop= new Properties();
		FileInputStream inputfile = new FileInputStream("D:\\eclipse\\workspace\\digitalresume\\digitalresumebuilder\\src\\test\\resources\\Folder\\login.features");
	     prop.load(inputfile);
           driver =new ChromeDriver();

		driver.get(prop.getProperty("url"));

	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		log = new LoginPage1(driver);
		log.signupclick();
		Thread.sleep(500);
		log.setUsername("vidhya");
		log.setPassword("S1r1e1e1@");
		log.RememberClick();
		
		log.LoginClick();

	}
	@AfterMethod
	public void afterTest() throws InterruptedException
	{
	Thread.sleep(5000);
	driver.quit();
	}
	
	}


