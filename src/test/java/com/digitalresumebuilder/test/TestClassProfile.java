package com.digitalresumebuilder.test;

import java.time.Duration;

import org.testng.annotations.Test;

import com.digitalresumebuilder.pages.CreateProfile;
import com.digitalresumebuilder.pages.LoginPage2;
import com.digitalresumebuilder.pages.Template;

public class TestClassProfile extends TestBaseProfile {
	LoginPage2 log = null;
	CreateProfile obj = null;
	Template temp = null;

	@Test(priority=-1)
	
	public void verifyMyprofile() throws InterruptedException {
		obj = new CreateProfile(driver);
		obj.clickprofile();

	}

	@Test(priority=0)
	public void verifycreateprofilenow() throws InterruptedException {
		obj = new CreateProfile(driver);
		obj.CreateProfileNow();
	}

	@Test(priority=1)
	public void verifycreate() throws InterruptedException {
		obj = new CreateProfile(driver);
		//obj.name("sravyap");
		obj.dob(15, 12, 1990);
		//obj.email("abugduw@gmail.com");
		//obj.phone("1234567890");
		obj.clickGender();
		obj.qualification1("Board of Public Examination");
		obj.percentage1("78%");
		obj.school1("Peralasseri");
		obj.yop1("2010");
		obj.qualification2("CBSC");
		obj.percentage2("80%");
		obj.school2("Kuthuparamba");
		obj.yop2("2011");
		obj.qualification3("BTECH");
		obj.stream("Electronics");
		obj.percentage3("64%");
		obj.school3("Chinmaya");
		obj.yop3("2015");
		obj.project();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		obj.projectname("digital");
		obj.projectdescrption("digital resume builder");
		obj.skills();
		obj.skilltitle("tester");
		obj.language();
		obj.langadd("english");
		obj.yourself("my name sravya complete Btech dregree");
		obj.image("C:\\Users\\sravy\\Downloads\\mmm.JPG");
		obj.checkbox();
		obj.createprofile1();
	}

	@Test(priority=2)
	public void verifytemplate() throws InterruptedException {
		temp = new Template(driver);
		temp.TemplateLink();
		temp.TemplateSelect();
		temp.Download();
		//temp.Weblink();
	}
	@Test(priority=3)
	public void verifyweblink() throws InterruptedException
	{
		temp = new Template(driver);
	    temp.Weblink();
	}
	
}


 
 
 

 
 
 
