package com.digitalresumebuilder.test;

import org.testng.annotations.Test;

import com.digitalresumebuilder.pages.CreateProfile;
import com.digitalresumebuilder.pages.Template;


public class TestClassProfile extends TestBaseProfile {
	CreateProfile obj=null;
	Template temp=null;
	@Test
	public void verifycreateprofile1() 
	{
		
		obj=new CreateProfile(driver);
		obj.setFullname("keerthana p");
		obj.setDOB("02/01/2000");
		obj.setgender();
		obj.HschoolQulfcan();
		obj.Hschoolpercentage("90%");
		obj.Hschoolname("peralassery");
		obj.Hschoolyearofpass("2015");
		obj.HighersecondaryQulfcan();
		obj.Highersecondary("70%");
		obj.Highersecondaryname("kuthuparamba");
		obj.Highersecondaryyearofpass("2017");
		obj.GraduationCourse();
		obj.GraduationStream();
		obj.GraduationPercentage("76%");
		obj.GInstitutionName("chinamaya");
		obj.Graduationyearofpass("2020");
		obj.PGCourse();
		obj.PGStream();
		obj.PGPercentage("67%");
		obj.PGInstitutionName("palayad");
		obj.PGyearofpass("2022");
		
		
	}
		
		
	@Test
	public void veryfyfullname()
		{

		obj=new CreateProfile(driver);
		obj.setFullname("12345");
		obj.CreateProfile1();
		
		}
	//Enter numeric values
	public void verifyfullnmae1()
	{
		
		obj=new CreateProfile(driver);
		obj.setFullname("12345");
		obj.setDOB("02/01/2000");
		obj.setgender();
		obj.HschoolQulfcan();
		obj.Hschoolpercentage("90%");
		obj.Hschoolname("peralassery");
		obj.Hschoolyearofpass("2015");
		obj.HighersecondaryQulfcan();
		obj.Highersecondary("70%");
		obj.Highersecondaryname("kuthuparamba");
		obj.Highersecondaryyearofpass("2017");
		obj.GraduationCourse();
		obj.GraduationStream();
		obj.GraduationPercentage("76%");
		obj.GInstitutionName("chinamaya");
		obj.Graduationyearofpass("2020");
		obj.PGCourse();
		obj.PGStream();
		obj.PGPercentage("67%");
		obj.PGInstitutionName("palayad");
		obj.PGyearofpass("2022");
		obj.AddProjects();
		obj.ProjectTittle("digital resume builder");
		obj.Projectdes("A web app where users can add their details and download their resume");
		obj.ProjectRemove();
		obj.AdditnalQualifctn();
		obj.Coursetype();
		obj.CName("software testing");
		obj.CPercentage("80%");
		obj.CourseRemove();
		obj.AddExp();
		obj.JobTitle("Teacher");
		obj.Expfrom("2022");
		obj.ExpTO("2023");
		obj.ExpRemove();
		obj.AddSkillbutton();
		obj.Addskill("performance testing tools  JMeter");
		obj.skillRemove();
		obj.Addlangbutton();
		obj.Laguage("englisg,malayalam");
		obj.LanguageRemove();
		obj.Addplang();
		obj.PLaguageName("java");
		obj.PLaguageper("70%");
		obj.PlangRemove();
		obj.Achievementsbutton();
		obj.Achievements("Defect Reduction");
		obj.AchievementsRemove();
		obj.Describe("Versatile problem solver with a passion for continuous learning and innovation.");
	    String imageLocation = "C:\\Users\\sravy\\Downloads\\mmm.jpg";
		obj.chooseImage(imageLocation);
		obj.Acccheckbox();
		obj.CreateProfile1();
	}
	//Verify that a user can create a web link for their resume
			@Test
			public void verifyweblink1()
			{
				temp=new Template(driver);
				temp.TemplateLink();
				temp.TemplateSelect();
				temp.Weblink();
			}
		
			@Test
			public void verifywebdownload()
			{
				
				
				temp=new Template(driver);
				temp.TemplateLink();
				temp.TemplateSelect();
			    temp.Download();
				
			}
				
				

				
			
			
				
			}
			
			

			
		
		
			
		






