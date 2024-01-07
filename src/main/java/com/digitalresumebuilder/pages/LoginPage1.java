package com.digitalresumebuilder.pages;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage1 {

	WebDriver driver;
	public LoginPage1(WebDriver driver)
	{
		this.driver=driver;
	}
	public String Login() 
	{
    	return(driver.getTitle());
	}
	public void signupclick() {
		WebElement clicksignup = driver.findElement(By.xpath("//a[@routerlink=\"login\"]"));
		clicksignup.click();
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
		
		public void LoginClick() throws InterruptedException
		{
		 WebElement login=driver.findElement(By.xpath("//button[@class='login100-form-btn']"));
		 scrollIntoView(login);
		 login.click();
		}
		public void scrollIntoView(WebElement element) throws InterruptedException
	 	{
	 		((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	 		Thread.sleep(500);
	 	}
		
		public void LogoutClick() 
		{
		 WebElement logoutclick = driver.findElement(By.xpath("//a[text()='Logout']"));
	     logoutclick.click();
	}	

}
