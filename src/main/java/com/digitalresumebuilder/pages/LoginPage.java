package com.digitalresumebuilder.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
	
		public void setUsername(String setUser) 
		{
		 WebElement username=driver.findElement(By.name("Username"));
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
		 remclick.click();
		}
		
		public void LoginClick()
		{
		 WebElement login=driver.findElement(By.xpath("//button[@class='login100-form-btn']"));
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
		
		public void MyProfile()
		{
			WebElement profile=driver.findElement(By.xpath("//a[@routerlink='/profilehome' and @class='nav-link' and @href='/profilehome']"));
			profile.click();
		}
		public String getProfile()
		{
			return(driver.getCurrentUrl());
		}

		
		//Logout	
		public void LogoutClick() 
		{
		 WebElement logoutclick = driver.findElement(By.xpath("//a[text()='Logout']"));
	     logoutclick.click();
	}	
		public String getLogout()
		{
			return(driver.getCurrentUrl());
		}
		
}

