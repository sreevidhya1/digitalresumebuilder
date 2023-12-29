package com.digitalresumebuilder.pages;



	

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class Template {
		WebDriver driver;
		
	    public Template(WebDriver driver)
	    {
	   	 this.driver=driver;
	    }
	    //Template link click
	    public void TemplateLink()
		{
			WebElement templink=driver.findElement(By.linkText("TEMPLATES/DESIGNS"));
			templink.click();
		}
	    //select template
	    public void TemplateSelect()
		{
			WebElement tempselect=driver.findElement(By.xpath("//a[@class='nav-link']"));
			tempselect.click();
		}
	    //download resume
	    public void Download()
		{
			WebElement download=driver.findElement(By.xpath("//button[@class='btn btn btn-dark m-1']"));
			download.click();
			driver.switchTo().alert().accept();
		}
	   
	    //send a web link
	    public void Weblink()
		{
			WebElement weblink=driver.findElement(By.xpath("//button[@class='btn btn-success m-1']"));
			weblink.click();
			driver.switchTo().alert().accept();
		}
	   
	}


