package com.digitalresumebuilder.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyProfile {
	WebDriver driver;
	public MyProfile(WebDriver driver)
	{

			this.driver=driver;
		}
	public void scrollIntoView(WebElement element) throws InterruptedException
  	{
  		((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
  		Thread.sleep(500);
  	}
	//to check the name is updated correctly
		public boolean verifyupdatename(String nam) {
			WebElement  full= driver.findElement(By.xpath("//div[@class='h2 title']"));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		    wait.until(ExpectedConditions.elementToBeClickable(full));
			String actualName = full.getText();
	        return actualName.equals(nam);
		}
		//to check the date of birth is updated correctly
		public boolean verifyUpdatedDOB(String expectedDOB) throws InterruptedException {
		
	        WebElement dobElement = driver.findElement(By.xpath("//div[contains(@class, 'card-body')]//div[contains(@class, 'row')]/div[contains(@class, 'col-sm-4') and contains(., 'Date of Birth:')]/following-sibling::div[contains(@class, 'col-sm-8')]\r\n"
	        		+ "")); 
	        scrollIntoView(dobElement);
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		    wait.until(ExpectedConditions.elementToBeClickable(dobElement));
	        String actualDOB = dobElement.getText();
	        return actualDOB.equals(expectedDOB);
	    }
		//to check the email is updated correctly
		public boolean verifyupdatedemail(String mail) {
			WebElement email = driver.findElement(By.xpath("//div[@class='col-sm-4' and strong[text()='Email:']]/following-sibling::div"));
			String actualemail = email.getText();
			return actualemail.equals(email);
		}
		//to check the phone no is updated correctly
		public boolean verifyupdatedphone(String phno) {
			WebElement phoneno =driver.findElement(By.xpath("//div[contains(@class, 'card-body')]//div[contains(@class, 'row')]/div[contains(@class, 'col-sm-4') and contains(., 'Phone:')]/following-sibling::div[contains(@class, 'col-sm-8')]\r\n"
					+ ""));
			String actualph = phoneno.getText();
			return actualph.equals(phno);
		}
		//to check language is updated correctly
		public boolean verifyupdatelanguage(String langu) {
			WebElement language= driver.findElement(By.xpath("//div[contains(@class, 'card-body')]//div[contains(@class, 'row')]/div[contains(@class, 'col-sm-4') and contains(., 'Language:')]/following-sibling::div[contains(@class, 'col-sm-8')]/table/tr/td\r\n"
					+ ""));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		    wait.until(ExpectedConditions.elementToBeClickable(language));
			String actuallang= language.getText();
			return actuallang.equals(langu);
			
			
		}
	}

