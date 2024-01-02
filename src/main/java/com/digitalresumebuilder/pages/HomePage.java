package com.digitalresumebuilder.pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage
{
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Home
	public void Home() 
	{		
		WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));
		home.click();
	}	
		public String CheckAHome() 
		{
			return(driver.getCurrentUrl());
		}
			 
	//About us
	
		public void AboutUsClick() 
		{		
			WebElement aboutus=driver.findElement(By.xpath("//a[text()='Aboutus']"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			aboutus.click();
		}
			
		public String CheckAbout() 
		{
			return(driver.getCurrentUrl());
		}
		
		//Templates/Design
		
		public void TemplateClick()
		{
			WebElement template=driver.findElement(By.xpath("//a[@routerlink='templatehome' and @class='nav-link' and @href='/templatehome']"));
			template.click();
			
			
		}
		public String getTemplate()
		
		{
		  return(driver.getCurrentUrl());	
		}

	       //Sign Up
	
			public void SignupClick() throws InterruptedException
			{
			 WebElement	signupclick=driver.findElement(By.xpath("//a[contains(@href,'login')]"));
			 scrollToTop();
			 scrollIntoView(signupclick);
			 signupclick.click();
			}
			
		      //Sign Up
			
			public void SignOutClick() throws InterruptedException
			{
			 WebElement	signoutclick=driver.findElement(By.xpath("//a[contains(@class,'logout')]"));
			 scrollToTop();
			 scrollIntoView(signoutclick);
			 signoutclick.click();
			}
			
			//Create resume
			
			public void createResume() throws InterruptedException
			{
			WebElement currentElement = driver.switchTo().activeElement();
			
			currentElement=driver.findElement(By.xpath("//*[@id=\"js-main-slider\"]/div/div/div/div/div/a"));	
			scrollIntoView(currentElement);
			currentElement.click();
			}
			
			public String getCreateButton()
			{
				return driver.getCurrentUrl();
			}
			
			private void scrollIntoView(WebElement element) throws InterruptedException
			{
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
				Thread.sleep(500);
			}
			
			public void scrollToTop() throws InterruptedException
			{
				((JavascriptExecutor) driver).executeScript("javascript:window.scrollBy(0,250)","");
				Thread.sleep(500);
				((JavascriptExecutor) driver).executeScript("javascript:window.scrollTo(0,0)","");
				Thread.sleep(500);
			}
			

}
