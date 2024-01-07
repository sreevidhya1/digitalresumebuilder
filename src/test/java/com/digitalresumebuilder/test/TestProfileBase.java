package com.digitalresumebuilder.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestProfileBase {
	WebDriver driver;
	public static Properties pro= null;
	@BeforeTest
	public  void set() throws IOException {
		pro= new Properties();
		FileInputStream inputfile = new FileInputStream("D:\\eclipse\\workspace\\digitalresume\\digitalresumebuilder\\src\\test\\resources\\Folder\\profile.features");
	     pro.load(inputfile);
           driver =new ChromeDriver();

		driver.get(pro.getProperty("url"));

	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

	}
	


}
