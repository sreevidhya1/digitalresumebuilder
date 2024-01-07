package com.digitalresumebuilder.test;



	import java.io.FileInputStream;
	import java.io.IOException;
	import java.time.Duration;
	import java.util.Properties;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.digitalresumebuilder.pages.LoginPage2;

	public class TestBaseProfile {
		WebDriver driver;
		LoginPage2 log=null;
		public static Properties prop=null;
		@BeforeTest
		public void Setup() throws IOException, InterruptedException
		{
			prop=new Properties();
			FileInputStream ip=new FileInputStream("C:\\Users\\sravy\\eclipse-workspace\\digitalresumebuilderproject\\src\\test\\resources\\config.properties");
			prop.load(ip);
			driver=new ChromeDriver();
			
			driver.get(prop.getProperty("url2"));
			
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			log=new LoginPage2(driver);
			
			log.signupclick();
		    log.setUsername("sravya");
			log.setPassword("Sravyalak123#");
			log.RememberClick();
			log.LoginClick();
		}
		@AfterTest
		public void afterTest() throws InterruptedException
		{
		Thread.sleep(5000);
		driver.quit();
		}
		}



