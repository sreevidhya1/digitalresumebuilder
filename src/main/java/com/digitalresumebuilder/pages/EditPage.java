package com.digitalresumebuilder.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class EditPage {
	WebDriver driver;
	public EditPage(WebDriver driver)
{

		this.driver=driver;
	}
	public void clickprofile()
	{
		WebElement myprofile = driver.findElement(By.linkText("My Profile"));
		myprofile.click();
	}
	public void home() {
		WebElement clickhome = driver.findElement(By.xpath("//a[@routerlinkactive=\"active\"]"));
		clickhome.click();
	}
	
	public void clickedit()
{
		WebElement editprofile= driver.findElement(By.xpath("//a[@routerlink=\"/editform\"]"));
		editprofile.click();
}
	public void name(String name)
{
         WebElement fullname = driver.findElement(By.xpath("//input[@id=\"name\"]"));
         if (fullname.getAttribute("value").isEmpty()) {
             fullname.sendKeys(name);
         } else {
             System.out.println("Name field already filled: " );
         }
        
}
	public void dob(int dd, int mm, int yyyy) {
	WebElement date=  driver.findElement(By.id("date"));
	 // Convert integers to strings before sending keys
    String day = Integer.toString(dd);//it is used to convert the integer value to the string value
    // because in the sendkey method the string value can be pass not the integer
    String month = Integer.toString(mm);
    String year = Integer.toString(yyyy);
    
if (date.getAttribute("value").isEmpty()){
	date.sendKeys(day + "/" + month + "/" + year);
}
else {
	System.out.println("field already filled");
}
    // Concatenate the strings and send them as keys
    date.sendKeys(day + "/" + month + "/" + year);
	}
	public void gender() 
	{
		WebElement gen = driver.findElement(By.xpath(" //input[@formcontrolname='gender' and @value='Female'] "));
		if (!gen.isSelected()) {
          gen.click();
		}
		}
	public void email(String email)
	{
		WebElement mailid = driver.findElement(By.xpath("//input[@name='email_id']"));
		if(mailid.getAttribute("value").isEmpty()) {
		mailid.sendKeys(email);
		}
		else {
			System.out.println("field already filled");
		}
	}
	public void phone(String phone)
	{
		WebElement ph = driver.findElement(By.xpath("//input[@placeholder='Phone Number']"));
		if(ph.getAttribute("value").isEmpty()) {
		ph.sendKeys(phone);
		}
		else {
			System.out.println("field already filled");
		}
	}
	public void qualification1(String quali1) {
		WebElement highschool1= driver.findElement(By.xpath("//select[@name=\"edu_title\"]"));
		Select board1= new Select(highschool1);// here Select is used for select the value from the drop down menu
		board1.selectByVisibleText(quali1);// selectbyvisibletext is used for value is selected by the text visible to the user
	}
	public void percentage1(String percent1) {
		WebElement per1 = driver.findElement(By.xpath("//input[@id=\"edu_desc\"]"));
		per1.sendKeys(percent1);// find the web element  to the percentage mark send key method is used for send the values
		
	}
	public void school1(String sch1) {
		 WebElement schoolname1 =driver.findElement(By.xpath("//input[@id=\"edu_school\"]"));
		 schoolname1.sendKeys(sch1);
	}
	public void yop1(String pass1) {
		WebElement yearof1 = driver.findElement(By.xpath("//input[@id=\"edu_year\"]"));
		yearof1.sendKeys(pass1);
	}
	public void qualification2(String quali2) {
		WebElement  highschool2 =driver.findElement(By.xpath(" \"//p[@formgroupname='higherschools']//select[@formcontrolname='edu_title']/option[@value='Board of Public Examination']\""));
		Select board2 = new Select(highschool2);
		board2.selectByVisibleText(quali2);
	}
	public void percentage2(String percent2) {
		WebElement per2=driver.findElement(By.xpath(" //p[@formgroupname='higherschools']//input[@formcontrolname=\"edu_desc\"]"));
	      per2.sendKeys(percent2);
	}
	public void school2(String sch2) {
		WebElement schoolname2 =driver.findElement(By.xpath(" //p[@formgroupname='higherschools']//input[@formcontrolname=\"edu_school\"]"));
		 schoolname2.sendKeys(sch2);
	}
	public void yop2(String pass2) {
		WebElement yearof2 = driver.findElement(By.xpath(" //p[@formgroupname='higherschools']//input[@formcontrolname=\"edu_year\"]"));
		yearof2.sendKeys(pass2);
	}
	
	public void qualification3(String quali3) {
		WebElement  graduation =driver.findElement(By.xpath("  //p[@formgroupname=\"graduations\"]//select[@formcontrolname=\"edu_title\"]"));
		Select board3 = new Select(graduation);
		board3.selectByVisibleText(quali3);
	}
	public void stream(String streamsele) {
		WebElement  graduationstream =driver.findElement(By.xpath("//p[@formgroupname=\"graduations\"]//select[@formcontrolname=\"edu_stream\"]"));
		Select str = new Select(graduationstream);
		str.selectByVisibleText(streamsele);
	}
	public void percentage3(String percent3) {
		WebElement per3=driver.findElement(By.xpath(" //p[@formgroupname=\"graduations\"]//input[@formcontrolname=\"edu_desc\"]"));
	      per3.sendKeys(percent3);
}
	public void school3(String sch3) {
		WebElement schoolname3 =driver.findElement(By.xpath("  //p[@formgroupname=\"graduations\"]//input[@formcontrolname=\"edu_inst\"]"));
		 schoolname3.sendKeys(sch3);
	}
	public void yop3(String pass3) {
		WebElement yearof3 = driver.findElement(By.xpath(" //p[@formgroupname=\"graduations\"]//input[@formcontrolname=\"edu_year\"]"));
		yearof3.sendKeys(pass3);
}
	public void project() {
		WebElement add = driver.findElement(By.xpath("//table[@formarrayname=\"projects\"]//button[contains(@class, 'btn-primary')]"));
		add.click();
		
}
	public void projectname(String pronam) {
		WebElement title = driver.findElement(By.xpath("//table[@formarrayname='projects']//input[contains(@formcontrolname, 'title')]"));
		title.sendKeys(pronam);
		
	}
	public void projectdescrption(String pd) {
		WebElement descrip = driver.findElement(By.xpath("//table[@formarrayname='projects']//input[contains(@formcontrolname, 'desc')]"));
	     descrip.sendKeys(pd);
	}
	public void projectremove() {
		WebElement remove= driver.findElement(By.xpath("//table[@formarrayname='projects']//button[text()=\"Remove\"]"));
	remove.click();
	}
     public void skills () {
    	 WebElement addskil= driver.findElement(By.xpath("//table[@formarrayname='skills']//button[contains(@class, 'btn btn-primary')]"));
    	 addskil.click();
	
}
     public void skilltitle(String skill) {
    	 WebElement titleskill =driver.findElement(By.xpath("//table[@formarrayname='skills']//input[@formcontrolname=\"skills\"]"));
    	 titleskill.sendKeys(skill);
    	 
     }
     public void skillremove() {
    	 WebElement move = driver.findElement(By.xpath("//table[@formarrayname='skills']//button[@class=\"btn btn-remove\"]"));
    	 move.click();
    	 }
     public void language() {
    	 WebElement lan = driver.findElement(By.xpath("//table[@formarrayname='languages']//button[@type='button']"));
    	 lan.click();
     }
     public void langadd(String lang) {
    	 WebElement addlang = driver.findElement(By.xpath("//table[@formarrayname='languages']//input[@formcontrolname=\"languages\"]"));
        addlang.sendKeys(lang);
        
     }
     public void langremove () {
    	WebElement removelang = driver.findElement(By.xpath("//table[@formarrayname='languages']//button[@class=\"btn btn-remove\"]"));
         removelang.click();
     }
     public void yourself(String your) {
    	 WebElement desyou = driver.findElement(By.xpath("//textarea[@id=\"yourself\"]"));
    	 desyou.sendKeys(your);
     }
     public void checkbox() {
    	 WebElement box= driver.findElement(By.xpath("//input[@type='checkbox']"));
    	 box.click();
     }
     public void update() {
    	 WebElement submit= driver.findElement(By.xpath("//button[@type='submit']"));
    	 submit.click();
     }
     public void image(String upload) {
    	 WebElement imageload= driver.findElement(By.xpath("//input[@name='image']"));
    	imageload.sendKeys(upload);
     }
     public void  popup()
     {
         WebElement popupmsg=driver.findElement(By.xpath("//button[@type='submit']"));
         popupmsg.click();
         driver.switchTo().alert().accept();
     }
     }




