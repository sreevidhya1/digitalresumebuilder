package com.digitalresumebuilder.test;

import java.time.Duration;


import org.testng.annotations.Test;

import com.digitalresumebuilder.pages.EditPage;

public class TestEdit extends TestBase{
	EditPage obj=null;
	@Test
	public void editprofile() {
		obj = new EditPage(driver);
		obj.name("sreevidhya");
            obj.dob(15, 12, 1992);
		obj.email("abugduw@gmail.com");
		obj.phone("1234567890");
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
		}
       
	@Test
	public void testcase2() {
		
		obj.clickedit();
		obj.skilltitle("   ");
		obj.checkbox();
		obj.update();
	}
	@Test
	 public void testcase3() {
		obj.clickedit();
		obj.dob(29, 02, 2000);
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
	}
	
}

