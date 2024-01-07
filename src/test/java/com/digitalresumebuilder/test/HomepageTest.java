package com.digitalresumebuilder.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.digitalresumebuilder.constants.Automationconstants;
import com.digitalresumebuilder.pages.HomePage;
import com.digitalresumebuilder.pages.LoginPage;

public class HomepageTest extends Testbaselogin
{
	 LoginPage log=null;
	  HomePage hm= null;
	//Checking the Title
			@Test(priority =1)
			
			public void titleCheck()
			{	
				log=new LoginPage(driver);
				String actualTitle=log.Login();	
				System.out.println(actualTitle);
				Assert.assertEquals(actualTitle, Automationconstants.ExpectedTitle);
			}
			//Testing of 'About Us' button
			 
			 @Test(priority =2)
			 
			 public void AboutUs() throws IOException, InterruptedException
			 {
				    hm=new HomePage(driver);
				    Thread.sleep(500);
					hm.AboutUsClick();
					Thread.sleep(500);
					String actualurl1=hm.CheckAbout();
					Assert.assertEquals(actualurl1,Automationconstants.expectedurl);
			 }
			
			 //Testing of 'Templates/Design' button
			 
			@Test(priority =3)
			
			public void Templates() throws IOException, InterruptedException
			{
				hm=new HomePage(driver);
				hm.TemplateClick();
				Thread.sleep(1000);
				String Actualtemplate=hm.getTemplate();
				Assert.assertEquals(Actualtemplate,Automationconstants.ExpectedTemplate);
				Thread.sleep(1000);
				WebElement Home = driver.findElement(By.xpath("//a[@class='nav-link active' and text()='Home']"));
				Thread.sleep(1000);
				Home.click();
			}
			
			//Testing of 'Create your Resume now' button
			
			@Test(priority =4)
			
			public void CreateResumeButton() throws IOException, InterruptedException
			{    
				hm=new HomePage(driver);
				hm.createResume();
				Thread.sleep(500);
				String Actualbutton=hm.getCreateButton();
				Assert.assertEquals(Actualbutton,Automationconstants.ExpectedButton);
			}
			
}