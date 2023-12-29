package com.digitalresumebuilder.test;



	import java.io.FileInputStream;
	import java.io.IOException;
	import java.time.Duration;
	import java.util.Properties;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeTest;

	public class TestBaseProfile {
		WebDriver driver;
		public static Properties prop=null;
		@BeforeTest
		public void Setup() throws IOException
		{
			prop=new Properties();
			FileInputStream ip=new FileInputStream("C:\\Users\\sravy\\eclipse-workspace\\digitalresumebuilderproject\\src\\test\\resources\\config.properties");
			prop.load(ip);
			driver=new ChromeDriver();
			
			driver.get(prop.getProperty("url2"));
			
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
		}
		}



