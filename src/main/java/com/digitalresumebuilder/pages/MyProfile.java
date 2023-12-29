package com.digitalresumebuilder.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyProfile {
	WebDriver driver;
	public MyProfile(WebDriver driver)
	{

			this.driver=driver;
		}
	
		public boolean verifyupdatename(String nam) {
			WebElement  full= driver.findElement(By.xpath("//div[@class=\"h2 title\"]"));
			String actualName = full.getText();
	        return actualName.equals(nam);
		}
		public boolean verifyUpdatedDOB(String expectedDOB) {
	        WebElement dobElement = driver.findElement(By.xpath("//div[contains(@class, 'card-body')]//div[contains(@class, 'row')]/div[contains(@class, 'col-sm-4') and contains(., 'Date of Birth:')]/following-sibling::div[contains(@class, 'col-sm-8')]\r\n"
	        		+ "")); 
	        String actualDOB = dobElement.getText();
	        return actualDOB.equals(expectedDOB);
	    }
		public boolean verifyupdatedemail(String mail) {
			WebElement email = driver.findElement(By.xpath("//div[contains(@class, 'card-body')]//div[contains(@class, 'row')]/div[contains(@class, 'col-sm-4') and contains(., 'Email:')]/following-sibling::div[contains(@class, 'col-sm-8')]\r\n"
					+ ""));
			String actualemail = email.getText();
			return actualemail.equals(email);
		}
		public boolean verifyupdatedphone(String phno) {
			WebElement phoneno =driver.findElement(By.xpath("//div[contains(@class, 'card-body')]//div[contains(@class, 'row')]/div[contains(@class, 'col-sm-4') and contains(., 'Phone:')]/following-sibling::div[contains(@class, 'col-sm-8')]\r\n"
					+ ""));
			String actualph = phoneno.getText();
			return actualph.equals(phno);
		}
		public boolean verifyupdatelanguage(String langu) {
			WebElement language= driver.findElement(By.xpath("//div[contains(@class, 'card-body')]//div[contains(@class, 'row')]/div[contains(@class, 'col-sm-4') and contains(., 'Language:')]/following-sibling::div[contains(@class, 'col-sm-8')]/table/tr/td\r\n"
					+ ""));
			String actuallang= language.getText();
			return actuallang.equals(langu);
			
			
		}
	}

