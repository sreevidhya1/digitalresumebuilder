package com.digitalresumebuilder.test;


import java.time.Duration;



import org.testng.annotations.Test;


import com.digitalresumebuilder.pages.EditPage;
import com.digitalresumebuilder.pages.LoginPage1;
import com.digitalresumebuilder.pages.MyProfile;

import dev.failsafe.internal.util.Assert;

public class TestEdit extends TestBase{
	EditPage obj=null;
	LoginPage1 log = null;
	MyProfile profile=null;
	@Test// positive test case all the credentials are given
	public void editprofile() throws InterruptedException {
		
		obj= new EditPage(driver);
		
		obj.clickprofile();
	obj.clickedit();
		Thread.sleep(500);
		obj.name("sreevidhya");
        obj.dob(15, 12, 1992);
        
       
        Assert.state(obj.isGenderClickable(), "it is not clickable");
        obj.email("abugduw@gmail.com");
		obj.phone("1234567890");
		
		obj.qualification1("Board of Public Examination");
		obj.percentage1("78%");
		obj.school1("nsbhwbiuwe");
		obj.yop1("2010");

		obj.qualification2("Board of Public Examination");
		obj.percentage2("80%");
		obj.school2("hasysfdsgsv");
		obj.yop2("2011");
		Thread.sleep(50);
		obj.qualification3("BTECH");
		obj.stream("Electronics");
		obj.percentage3("64%");
		obj.school3("cusat");
		obj.yop3("2015");
		Thread.sleep(50);
		obj.project();
		
		obj.projectname("digital");
		obj.projectdescrption("vshsdwvd ashvuwys hasvuy ashvsqh");
		obj.skills();
		obj.skilltitle("hsshdcsvdc");
		obj.language();
		obj.langadd("english");
		obj.yourself("my name vidhya complete btech dregree");
		obj.image("C:\\Users\\abhi8\\Pictures\\Screenshots\\average.png");
		obj.checkbox();
		obj.update();
		obj.popup();
		obj.logout();
		
		}

 @Test// negative test case making the skill field blank
	public void testcase2() throws InterruptedException {//check the blank space is accepting
    	obj = new EditPage(driver);
    	obj.clickprofile();
		obj.clickedit();
		obj.skills();
		obj.skilltitle("   ");
		obj.checkbox();
		Assert.state(obj.isUpdateSuccessful(), "Update should fail when the skill field is blank.");
		obj.home();
		obj.logout();
		
   }
	
	@Test// check the leap year is accepting
	 public void testcase3() throws InterruptedException {
		obj = new EditPage(driver);
		
		obj.clickprofile();
		obj.clickedit();
		obj.dob(29, 02, 2000);
		obj.clickGender();
		obj.qualification1("Board of Public Examination");
		obj.percentage1("78%");
		obj.school1("nsbhwbiuwe");
		obj.yop1("2010");
		obj.qualification2("CBSC");
		obj.percentage2("80%");
		obj.school2("hasysfdsgsv");
		obj.yop2("2011");
		obj.qualification3("BTECH");
		obj.stream("Electronics");
		obj.percentage3("64%");
		obj.school3("cusat");
		obj.yop3("2015");
		obj.project();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		obj.projectname("digital");
		obj.projectdescrption("vshsdwvd ashvuwys hasvuy ashvsqh");
		obj.skills();
		obj.skilltitle("hsshdcsvdc");
		obj.language();
		obj.langadd("english");
		obj.yourself("my name veidhya complete btech dregree");
		obj.image("C:\\Users\\abhi8\\Pictures\\Screenshots\\average.png");
		obj.checkbox();
		obj.update();
		obj.popup();
		obj.logout();
	}

}
	


	 
	


