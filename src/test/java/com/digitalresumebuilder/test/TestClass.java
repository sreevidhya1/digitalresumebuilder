package com.digitalresumebuilder.test;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.digitalresumebuilder.constants.Automationconstants;
import com.digitalresumebuilder.pages.HomePage;
import com.digitalresumebuilder.pages.LoginPage;

@Test
	public class TestClass extends Testbaselogin
	{
	  public class helper {

	}

	LoginPage log=null;
	  HomePage hm= null;

	  //LOGIN PAGE
	
		
		
		//Testing with valid user name and password without ticking the Remember me check box

		@Test(priority =1)
		public void verifyUncheckRemember() throws IOException, InterruptedException
		{
			log=new LoginPage(driver);
			hm=new HomePage(driver);
			hm.SignupClick();
			Thread.sleep(500);
			log.setUsername("vidhya");
			log.setPassword("S1r1e1e1@");
			log.LoginClick();
			Thread.sleep(1000);
			String ActualUrl=log.invalidCheck();
			Assert.assertEquals(ActualUrl,Automationconstants.expectedUrl);
		}
		
		
		//Testing with invalid user name and valid password
		
		@Test(priority =2)
		public void verifyInvalidUsername() throws IOException, InterruptedException
		{
			
			log=new LoginPage(driver);
			hm=new HomePage(driver);
			hm.SignupClick();
			Thread.sleep(1000);		
			log.setUsername("Username");
			log.setPassword("S1r1e1e1@");
			log.RememberClick();
			Thread.sleep(500);
			log.LoginClick();
			Thread.sleep(1000);
			String actualUrl=log.invalidCheck();
			System.out.println("verifyInvalidUsername---ends----" + actualUrl);
			Assert.assertEquals(actualUrl,Automationconstants.expectedUrl);
			Thread.sleep(1000);
		}
		
		//Testing with invalid user name and invalid password
		 
		 @Test(priority =3)
		 
		public void verifyInvalid() throws IOException, InterruptedException
		
		{
			log=new LoginPage(driver);
			hm=new HomePage(driver);
			hm.SignupClick();
			Thread.sleep(500);
			log.setUsername("Username123");
			log.setPassword("Password");
			log.RememberClick();
			Thread.sleep(500);
			log.LoginClick();
			Thread.sleep(1000);
			String actualUrl=log.invalidCheck();
			//System.out.println("verifyInvalid---ends----" + actualUrl);
			Assert.assertEquals(actualUrl,Automationconstants.expectedUrl);
		}
		
		
		 
//Testing with blank user name and blank password
		 
		 @Test(priority =4)
		 
		public void verifyblank() throws IOException, InterruptedException
		
		{
			log=new LoginPage(driver);
			hm=new HomePage(driver);
			hm.SignupClick();
			Thread.sleep(1000);
			log.setUsername("");
			log.setPassword("");
			log.RememberClick();
			Thread.sleep(1000);
			log.LoginClick();
			Thread.sleep(1000);
			String actualUrl=log.invalidCheck();
			//System.out.println("verifyblank---ends----" + actualUrl);
			Assert.assertEquals(actualUrl,Automationconstants.expectedUrl);
		}
		
		//Testing with valid user name and password by ticking the Remember me check box 
			
			@Test(priority =5)
			public void  verifyValidLogin() throws IOException, InterruptedException
			{
			log=new LoginPage(driver);
			hm=new HomePage(driver);
			//driver.navigate("http://167.71.226.96/");
			driver.navigate().to("http://167.71.226.96/");
			
		    hm.SignupClick();
			Thread.sleep(500);
			System.out.println("Anoop---2---" + driver.getCurrentUrl());
			log.setUsername("vidhya");
			log.setPassword("S1r1e1e1@");
			log.RememberClick();
			System.out.println("Anoop---3---" + driver.getCurrentUrl());
			Thread.sleep(500);
			log.LoginClick();	
			Thread.sleep(1000);
			System.out.println("Anoop---4---" + driver.getCurrentUrl());
			//hm.scrollToTop();
			String actualText=driver.getCurrentUrl();
			hm.SignOutClick();
			//System.out.println(actualText);
			Assert.assertEquals(actualText,Automationconstants.ExpectedText);
			
		}	//Testing of 'Logout' button
			@Test(priority =6)
			
			public void LogoutCheck() throws IOException, InterruptedException
			{
				System.out.println("Anoop--1--" + driver.getCurrentUrl());
				log=new LoginPage(driver);
				hm=new HomePage(driver);
				hm.SignupClick();
				Thread.sleep(1000);
				System.out.println(driver.getCurrentUrl());
				log.setUsername("vidhya");
				System.out.println("2");
				log.setPassword("S1r1e1e1@");
				System.out.println("3");
				log.RememberClick();
				System.out.println("4");
				Thread.sleep(1000);
				System.out.println("5");
				log.LoginClick();
				Thread.sleep(1000);
				log.LogoutClick();
				Thread.sleep(1000);
				String Actualurl=log.getLogout();
				Assert.assertEquals(Actualurl,Automationconstants.Expectedurl);
			}
		 
		//Testing of 'My Profile' button
		
		@Test(priority =7)
		
		public void MyProfileIcon() throws IOException, InterruptedException
		{
			log=new LoginPage(driver);
			hm=new HomePage(driver);
			hm.SignupClick();
			Thread.sleep(1000);
			log.setUsername("vidhya");
			//Thread.sleep(1000);
			log.setPassword("S1r1e1e1@");
			log.RememberClick();
			Thread.sleep(500);
			log.LoginClick();	
			Thread.sleep(500);
			log.MyProfile();
			Thread.sleep(500);
			String ActualProfile=log.getProfile();
			Assert.assertEquals(ActualProfile,Automationconstants.ExpectedProfile);
		}
		
		
		
		
		
		
	}



