package com.digitalresumebuilder.test;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Testbaselogin
	{
		ChromeDriver driver;
		
		@BeforeTest
		public void setUp() throws InterruptedException
		{
			driver=new ChromeDriver();
			driver.get("http://167.71.226.96/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
		}
		
		@AfterTest
		public void afterTest() throws InterruptedException
		{
		Thread.sleep(5000);
		driver.quit();
		}
	}
