package com.digitalresumebuilder.pages;



	

	import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class Template {
		WebDriver driver;
		
	    public Template(WebDriver driver)
	    {
	   	 this.driver=driver;
	    }
	    //Template link click
	    public void TemplateLink() throws InterruptedException
		{
			WebElement templink=driver.findElement(By.xpath("//a[@class='nav-link' and @routerlink='templatehome' and @href='/templatehome']"));
			scrollIntoView(templink);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
			wait.until(ExpectedConditions.elementToBeClickable(templink));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", templink);

			//templink.click();
		}
	    //select template
	    public void TemplateSelect()
		{
			WebElement tempselect=driver.findElement(By.xpath("//div[@class='h4' and text()='MULBERRY WHITE']"));
			tempselect.click();
		}
	    //download resume
	    public void Download()
		{
			WebElement download=driver.findElement(By.xpath("//button[@class='btn btn btn-dark m-1' and text()='Download Resume']"));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
			wait.until(ExpectedConditions.elementToBeClickable(download));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", download);

			//download.click();
			driver.switchTo().alert().accept();
		}
	   
	    //send a web link
	    public void Weblink() throws InterruptedException
		{
			WebElement weblink=driver.findElement(By.xpath("//button[@class='btn btn-success m-1' and text()='Send a Weblink']"));
			scrollIntoView(weblink);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
			wait.until(ExpectedConditions.elementToBeClickable(weblink));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", weblink);

			//weblink.click();
			driver.switchTo().alert().accept();
		}
	    public void scrollIntoView(WebElement element) throws InterruptedException {
			((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(500);
		}
	   
	}


