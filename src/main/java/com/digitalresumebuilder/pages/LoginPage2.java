package com.digitalresumebuilder.pages;


	



	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class LoginPage2 {
		
		WebDriver driver;
		public LoginPage2(WebDriver driver)
		{
			this.driver=driver;
		}
		public String Login() 
		{
	    	return(driver.getTitle());
		}
		public void scrollIntoView(WebElement element) throws InterruptedException
	    {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	        Thread.sleep(500);
	    }
		public void signupclick() throws InterruptedException {
	        WebElement clicksignup = driver.findElement(By.xpath("//a[@routerlink='login']"));
	        scrollIntoView(clicksignup);
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
			 scrollIntoView((login));
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
			public void scrollToTop() throws InterruptedException
	        {
	            ((JavascriptExecutor) driver).executeScript("javascript:window.scrollBy(0,250)","");
	            Thread.sleep(500);
	            ((JavascriptExecutor) driver).executeScript("javascript:window.scrollTo(0,0)","");
	            Thread.sleep(500);
	        }
			
	}





