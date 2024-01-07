package com.digitalresumebuilder.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.digitalresumebuilder.*;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public String Login() 
	{
    	return(driver.getTitle());
	}
	
		public void setUsername(String setUser) throws InterruptedException 
		{
		 WebElement username=driver.findElement(By.name("Username"));
		 scrollIntoView(username);
		 username.clear();
		 username.sendKeys(setUser);
		 

		}
		
		public void setPassword(String passwordstr) 
		{
		 WebElement password=driver.findElement(By.name("pass"));
		 password.clear();
		 password.sendKeys(passwordstr);
	  		
	    }
		public void RememberClick()
		{
		 WebElement remclick=driver.findElement(By.xpath("//label[@class='label-checkbox100']"));
			//WebElement remclick=driver.findElement(By.xpath("[@id=\"checkbox\"]"));
			remclick.click();
		}
		
		public void LoginClick() throws InterruptedException
		{
		 WebElement login=driver.findElement(By.xpath("//button[@class='login100-form-btn']"));
		 scrollIntoView(login);
		 login.click();
		}
		
		public String getLogin()
		{
			return(driver.getCurrentUrl());
				
		}
		
		public String invalidCheck() 
		{
			return(driver.getCurrentUrl());
		}
		
		//My Profile
		
		public void MyProfile() throws InterruptedException
		{
			WebElement profile=driver.findElement(By.xpath("//a[@routerlink='/profilehome' and @class='nav-link' and @href='/profilehome']"));
			scrollToTop();
			scrollIntoView(profile);
			
			profile.click();
			
		}
		public String getProfile()
		{
			return(driver.getCurrentUrl());
		}
		
		private void scrollIntoView(WebElement element) throws InterruptedException
		{
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(500);
		}
		
		private void scrollToTop() throws InterruptedException
		{
			((JavascriptExecutor) driver).executeScript("javascript:window.scrollBy(0,250)","");
			Thread.sleep(500);
			((JavascriptExecutor) driver).executeScript("javascript:window.scrollTo(0,0)","");
			Thread.sleep(500);
		}

		
		//Logout	
		public void LogoutClick() throws InterruptedException 
		{
		scrollToTop();
		 WebElement logoutclick = driver.findElement(By.xpath("//a[text()='Logout']"));
		 scrollIntoView(logoutclick);
	     logoutclick.click();
	}	
		public String getLogout()
		{
			return(driver.getCurrentUrl());
		}
		
}
