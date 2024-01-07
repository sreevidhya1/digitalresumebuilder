package com.digitalresumebuilder.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;





public class EditPage {
	WebDriver driver;
	public EditPage(WebDriver driver)
{

		this.driver=driver;
	}
	// to click the profile button
	public void clickprofile() throws InterruptedException
	{
		WebElement myprofile = driver.findElement(By.xpath("//li/a[@routerlink=\"/profilehome\"]"));
		scrollIntoView(myprofile);
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(500));
		    wait.until(ExpectedConditions.elementToBeClickable(myprofile));
		    JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", myprofile);
		
	}
	// to click on the home button
	public void home() throws InterruptedException {
		WebElement clickhome = driver.findElement(By.xpath("//a[@routerlinkactive=\"active\"]"));
		scrollIntoView(clickhome);
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		    wait.until(ExpectedConditions.elementToBeClickable(clickhome));
		    JavascriptExecutor js = (JavascriptExecutor) driver;
           js.executeScript("arguments[0].click();",clickhome);
	}
	// to click on the edit button
	public void clickedit()
{
		WebElement editprofile= driver.findElement(By.xpath("//a[@routerlink=\"/editform\"]"));
		editprofile.click();
}
	//to clear and add the name
	public void name(String name)
{
         WebElement fullname = driver.findElement(By.xpath("//input[@id=\"name\"]"));
         if (!fullname.getAttribute("value").isEmpty()) {
             // Clear the existing value
             fullname.clear();
             System.out.println("Name  is cleared and entered new value");
         }
         // Enter the new value
         fullname.sendKeys(name);
     }
        
//to clear and add the date of birth
	public void dob(int dd, int mm, int yyyy) {
	WebElement date=  driver.findElement(By.id("date"));
	 // Convert integers to strings before sending keys
    String day = Integer.toString(dd);//it is used to convert the integer value to the string value
    // because in the send key method the string value can be pass not the integer
    String month = Integer.toString(mm);
    String year = Integer.toString(yyyy);
    
    if (!date.getAttribute("value").isEmpty()) {
        // Clear the existing value
    	date.clear();
    	System.out.println("DOB is cleared and entered new value");
    }
    // Concatenate the strings and send them as keys
    date.sendKeys(day + "/" + month + "/" + year);
	}
	// the selection is done wrongly so i have use this method to click the gender
	public boolean isGenderClickable() {
	    WebElement gen = driver.findElement(By.xpath("//p[text()=' Female ']"));
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        wait.until(ExpectedConditions.elementToBeClickable(gen));
	        System.out.println("Selection is not done correctly");
	        return true;
	    } catch (Exception e) {
	    	
	    	return false;
	    }
	}
	// to select the gender

	public void clickGender() {
	    WebElement gen = driver.findElement(By.xpath("//p[text()=' Female ']"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", gen);
	}

	//to clear and add email 	
	public void email(String email)//to locate email
	{
		WebElement mailid = driver.findElement(By.xpath("//input[@name='email_id']"));
		if (!mailid.getAttribute("value").isEmpty()) {
	        // Clear the existing value
			mailid.clear();
			System.out.println("Email is cleared and entered new value");
	    }
		mailid.sendKeys(email);
	}
	// to clear and add phone number
	public void phone(String phone)// locate phone number
	{
		WebElement ph = driver.findElement(By.xpath("//input[@placeholder='Phone Number']"));
		if (!ph.getAttribute("value").isEmpty()) {
	        // Clear the existing value
			ph.clear();
			System.out.println("Phone no is cleared and entered new value");
	    }
			ph.sendKeys(phone);
			}
	// to clear and the high school details
			
	public void qualification1(String quali1) {// locate qualification field for high school
		WebElement highschool1= driver.findElement(By.xpath("//select[@name=\"edu_title\"]"));
		Select board1= new Select(highschool1);// here Select is used for select the value from the drop down menu
		board1.selectByVisibleText(quali1);// selectbyvisibletext is used for value is selected by the text visible to the user
	}
	//to clear and add the percentage 
	public void percentage1(String percent1) {//locate to type the percentage mark of high school
		WebElement per1 = driver.findElement(By.xpath("//input[@id=\"edu_desc\"]"));
		if (! per1.getAttribute("value").isEmpty()) {
	        // Clear the existing value
			 per1.clear();
			System.out.println("Percentage is cleared and entered new value");
	    }
			per1.sendKeys(percent1);
		}
		
		// find the web element  to the percentage mark send key method is used for send the values
		

	public void school1(String sch1) throws InterruptedException {
	    WebElement schoolname1 = driver.findElement(By.xpath("//input[@id=\"edu_school\"]"));
	    scrollIntoView(schoolname1);
	    if (! schoolname1.getAttribute("value").isEmpty()) {
	        // Clear the existing value
	    	schoolname1.clear();
			System.out.println("School name is cleared and entered new value");
	    }
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        wait.until(ExpectedConditions.elementToBeClickable(schoolname1));
	        schoolname1.sendKeys(sch1);
	    } 
	

	public void yop1(String pass1) throws InterruptedException {
		WebElement yearof1 = driver.findElement(By.xpath("//input[@id=\"edu_year\"]"));
		scrollIntoView(yearof1);
		if (! yearof1.getAttribute("value").isEmpty()) {
	        // Clear the existing value
			yearof1.clear();
			System.out.println("Year of pass is cleared and entered new value");
	    }
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        wait.until(ExpectedConditions.elementToBeClickable(yearof1));
	        yearof1.sendKeys(pass1);
	    } 
	public void qualification2(String quali2) {
		WebElement highschool2 = driver.findElement(By.xpath("//p[@formgroupname='higherschools']//select[@formcontrolname='edu_title']"));
		Select board2 = new Select(highschool2);
		board2.selectByVisibleText(quali2);
	}
	public void percentage2(String percent2) throws InterruptedException {
		WebElement per2=driver.findElement(By.xpath(" //p[@formgroupname='higherschools']//input[@formcontrolname=\"edu_desc\"]"));
		scrollIntoView(per2);
		if (! per2.getAttribute("value").isEmpty()) {
	        // Clear the existing value
			per2.clear();
			System.out.println("Pecentage  is cleared and entered new value");
	    }
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        wait.until(ExpectedConditions.elementToBeClickable(per2));
	        per2.sendKeys(percent2);
	    }
	
	      
	public void school2(String sch2) throws InterruptedException {
		WebElement schoolname2 =driver.findElement(By.xpath(" //p[@formgroupname='higherschools']//input[@formcontrolname=\"edu_school\"]"));
		scrollIntoView(schoolname2);
		if (! schoolname2.getAttribute("value").isEmpty()) {
	        // Clear the existing value
			schoolname2.clear();
			System.out.println("School name is cleared and entered new value");
	    }
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        wait.until(ExpectedConditions.elementToBeClickable(schoolname2));
	        schoolname2.sendKeys(sch2);
		} 
	
	public void yop2(String pass2) throws InterruptedException {
		WebElement yearof2 = driver.findElement(By.xpath(" //p[@formgroupname='higherschools']//input[@formcontrolname=\"edu_year\"]"));
		scrollIntoView(yearof2);
		if (!yearof2.getAttribute("value").isEmpty()) {
	        // Clear the existing value
			yearof2.clear();
			System.out.println("Year of pass is cleared and entered new value");
	    }
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        wait.until(ExpectedConditions.elementToBeClickable(yearof2));
	        yearof2.sendKeys(pass2);
		} 
	//to add the graduation qualification
	
	public void qualification3(String quali3) {
		WebElement  graduation =driver.findElement(By.xpath("  //p[@formgroupname=\"graduations\"]//select[@formcontrolname=\"edu_title\"]"));
		Select board3 = new Select(graduation);
		board3.selectByVisibleText(quali3);
	}
//add the stream
	public void stream(String streamsele) {
		WebElement  graduationstream =driver.findElement(By.xpath("//p[@formgroupname=\"graduations\"]//select[@formcontrolname=\"edu_stream\"]"));
		Select str = new Select(graduationstream);
		str.selectByVisibleText(streamsele);
	}
	// to add the percentage of graduation
	public void percentage3(String percent3) {
		WebElement per3=driver.findElement(By.xpath(" //p[@formgroupname=\"graduations\"]//input[@formcontrolname=\"edu_desc\"]"));
		if (!per3.getAttribute("value").isEmpty()) {
	        // Clear the existing value
			per3.clear();
			System.out.println("Percentage is cleared and entered new value");
	    }
		per3.sendKeys(percent3);
		} 
	//to add institute name of graduation
	public void school3(String sch3) {
		WebElement schoolname3 =driver.findElement(By.xpath("  //p[@formgroupname=\"graduations\"]//input[@formcontrolname=\"edu_inst\"]"));
		if (!schoolname3.getAttribute("value").isEmpty()) {
	        // Clear the existing value
			schoolname3.clear();
			System.out.println("institude name is cleared and entered new value");
	    }
		schoolname3.sendKeys(sch3);
		} 
	// to add year of pass of graduation
	public void yop3(String pass3) {
		WebElement yearof3 = driver.findElement(By.xpath(" //p[@formgroupname=\"graduations\"]//input[@formcontrolname=\"edu_year\"]"));
		if (!yearof3.getAttribute("value").isEmpty()) {
	        // Clear the existing value
			yearof3.clear();
			System.out.println("Year of passing is cleared and entered new value");
	    }
		yearof3.sendKeys(pass3);
		} 
	//to click on the project to add title and description
	public void project() {
		WebElement add = driver.findElement(By.xpath("//table[@formarrayname=\"projects\"]//button[contains(@class, 'btn-primary')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", add);
		
}
	//to add the project title
	public void projectname(String pronam) throws InterruptedException {
		WebElement title = driver.findElement(By.xpath("//table[@formarrayname='projects']//input[contains(@formcontrolname, 'title')]"));
		scrollIntoView(title);
		if (!title.getAttribute("value").isEmpty()) {
	        // Clear the existing value
			title.clear();
			System.out.println("Project name is cleared and entered new value");
	    }
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        wait.until(ExpectedConditions.elementToBeClickable(title));
	        title.sendKeys(pronam);
	    } 
	//to add the project description
	public void projectdescrption(String pd) {
		WebElement descrip = driver.findElement(By.xpath("//table[@formarrayname='projects']//input[contains(@formcontrolname, 'desc')]"));
	     descrip.sendKeys(pd);
	}
	//to click on the remove button of project 
	public void projectremove() {
		WebElement remove= driver.findElement(By.xpath("//table[@formarrayname='projects']//button[text()=\"Remove\"]"));
	remove.click();
	}
	//to click on the skill add button
     public void skills () throws InterruptedException {
    	 WebElement addskil= driver.findElement(By.xpath("//table[@formarrayname='skills']//button[contains(@class, 'btn btn-primary')]"));
    	 scrollIntoView(addskil);
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	        wait.until(ExpectedConditions.elementToBeClickable(addskil));
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("arguments[0].click();",addskil);
	
}
     //to add the skills
     public void skilltitle(String skill) {
    	 WebElement titleskill =driver.findElement(By.xpath("//table[@formarrayname='skills']//input[@formcontrolname=\"skills\"]"));
    	 titleskill.sendKeys(skill);
    	 
     }
     //to click the skill remove button
     public void skillremove() {
    	 WebElement move = driver.findElement(By.xpath("//table[@formarrayname='skills']//button[@class=\"btn btn-remove\"]"));
    	 move.click();
    	 }
     //click  on the language field
     public void language() {
    	 WebElement lan = driver.findElement(By.xpath("//table[@formarrayname='languages']//button[@type='button']"));
    	 lan.click();
     }
     // to  add language
     public void langadd(String lang) {
    	 WebElement addlang = driver.findElement(By.xpath("//table[@formarrayname='languages']//input[@formcontrolname=\"languages\"]"));
        addlang.sendKeys(lang);
        
     }
     //to click on the remove button of language
     public void langremove () {
    	WebElement removelang = driver.findElement(By.xpath("//table[@formarrayname='languages']//button[@class=\"btn btn-remove\"]"));
         removelang.click();
     }
   //locate the yourself field
     public void yourself(String your) {
    	 WebElement desyou = driver.findElement(By.xpath("//textarea[@id=\"yourself\"]"));
    	 if (desyou.getAttribute("value").isEmpty()) {
    	 desyou.sendKeys(your);
    	 } else {
 	        System.out.println("The field is already filled");
 	    }
     }
     //locate the check box 
     public void checkbox() {
    	 WebElement box= driver.findElement(By.xpath("//input[@type='checkbox']"));
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("arguments[0].click();", box);
     }
     // locate the update button
     public void update() {
    	 WebElement submit= driver.findElement(By.xpath("//button[@type='submit']"));
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("arguments[0].click();",submit);
     }
     //to check whether the update button work if any mandatory field set blank
     public boolean isUpdateSuccessful() throws InterruptedException {
         
         try {
             WebElement successfulupdate = driver.findElement(By.xpath("//button[@type='submit']"));
             
             JavascriptExecutor js = (JavascriptExecutor) driver;
             js.executeScript("arguments[0].click();",successfulupdate);
             System.out.println("Update unsuccessful. Skill field is blank.");
             return true;  // The element is found, indicating a successful update
         } catch (org.openqa.selenium.NoSuchElementException e) {
        	 
             return false; // The element is not found, indicating an unsuccessful update
             
         }
     }
     // image upload
     public void image(String upload) {
    	 WebElement imageload= driver.findElement(By.xpath("//input[@name='image']"));
    	imageload.sendKeys(upload);
     }
  // to locate pop up message 
     public void  popup()
     {
         WebElement popupmsg=driver.findElement(By.xpath("//button[@type='submit']"));
         popupmsg.click();
         driver.switchTo().alert().accept();
     }
     //used to scroll the webpage to find the element
     public void scrollIntoView(WebElement element) throws InterruptedException
  	{
  		((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
  		Thread.sleep(500);
  	}
   //to click logout menu
     public void logout() throws InterruptedException//to click logout menu

     {
    	 WebElement log =driver.findElement(By.xpath("//a[@class=\"logout btn\"]"));
    	 scrollIntoView(log);
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
		    wait.until(ExpectedConditions.elementToBeClickable(log));
		    JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", log);
            
     }
     
	 	}
 
     




