package com.digitalresumebuilder.test;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.digitalresumebuilder.constants.Automationconstants;
import com.digitalresumebuilder.pages.HomePage;
import com.digitalresumebuilder.pages.LoginPage;
import com.digitalresumebuilder.pages.Signup;

public class TestSignup extends Testbaselogin
{  
   LoginPage log =null;
   HomePage hm= null;
   Signup reg = null;
   @Test(priority=1)
	
	public void verifyEmptySignup() throws IOException, Throwable  {
		
	    hm=new HomePage(driver);
		reg=new Signup(driver);
		hm.SignupClick();
		Thread.sleep(500);
		reg.OrSignupClick();
		String Username="";
		String phone="";
		String mail="";
		String Passwrd="";
		String CPasswrd="";
		reg.setUsername(Username);
		reg.setPhno(phone);
		reg.setMail(mail);
		reg.setPass(Passwrd);
		reg.setCpass(CPasswrd);		
		reg.Registerclick();
		Thread.sleep(1000);
		String actualUrl="http://167.71.226.96/login";
		System.out.println(actualUrl);
		Assert.assertEquals(actualUrl,Automationconstants.expectedUrl);
	
	}
@Test(priority=2)
	
	public void verifyInvalidSignup() throws IOException, Throwable  {
		reg=new Signup(driver);
		hm=new HomePage(driver);
		
		hm.SignupClick();
		Thread.sleep(500);
		reg.OrSignupClick();
		String Username="vidhya";
		String Phno="212FHB";
		String mail="1234";
		String Passwrd="S1r1e1e1@";
		String CPasswrd="S1r1e1e1@";
		
		reg.setUsername(Username);
		reg.setPhno(Phno);
		reg.setMail(mail);
		reg.setPass(Passwrd);
		reg.setCpass(CPasswrd);
				
		reg.Registerclick();
		Thread.sleep(1000);
		
		String actualUrl="http://167.71.226.96/login";
		System.out.println(actualUrl);
		Assert.assertEquals(actualUrl,Automationconstants.expectedUrl);
	
	}
	@Test(priority=3)
	
	public void verifyValidSignup() throws IOException, Throwable  {
		hm=new HomePage(driver);
		reg=new Signup(driver);
		hm.SignupClick();
		Thread.sleep(500);
		reg.OrSignupClick();
		String Username="Aiswarya";
		String Phno="9961728800";
		String mail="arkurup4@yahoo.com";
		String Passwrd="Aiswarya@93";
		String CPasswrd="Aiswarya@93";
		
		reg.setUsername(Username);
		reg.setPhno(Phno);
		reg.setMail(mail);
		reg.setPass(Passwrd);
		reg.setCpass(CPasswrd);
		reg.Registerclick();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		String actualUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl,Automationconstants.expectedUrl);
		
	}
		
@Test(priority = 4)
	
	public void verifySignupLogin() throws InterruptedException  {
	
	log=new LoginPage(driver);
	hm=new HomePage(driver);
	reg=new Signup(driver);
	hm.SignupClick();
	Thread.sleep(1000);
	log.setUsername("Aiswarya");
	log.setPassword("Aiswarya@93");
	log.RememberClick();
	Thread.sleep(500);
	log.LoginClick();	
	Thread.sleep(1000);
	hm.scrollToTop();
	String actualText=log.getLogin();
	//System.out.println(actualText);
	Assert.assertEquals(actualText,Automationconstants.ExpectedText);
	
}


}



	 

