package com.digitalresumebuilder.pages;


	

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;

	public class CreateProfile
	{
		
		
			WebDriver driver;
			
		    public CreateProfile(WebDriver driver)
		    {
		   	 this.driver=driver;
		    }
		    //my profile link
		    public void MyProfileLink()
			{
				WebElement prolink=driver.findElement(By.linkText("MY PROFILE"));
				prolink.click();
			}
		    //crate a profile now
		    public void CreateProfileNow()
			{
				WebElement profilecreate=driver.findElement(By.xpath("//button[@class='btn-get-started animate__animated animate__fadeInUp scrollto'"));
				profilecreate.click();
				
			}
		    
				public void setFullname(String fullname)
				{
					WebElement uname=driver.findElement(By.id("name"));
					uname.sendKeys(fullname);
				}
			
				public void setDOB(String dob)
				{
					WebElement udob=driver.findElement(By.id("date"));
					udob.sendKeys(dob);
				}
				public void setgender()
				{
					WebElement gender_radio_button = driver.findElement(By.id ("gender"));
						    gender_radio_button.click();

				}
				//High school
				public void HschoolQulfcan()
				{
					Select select = new Select(driver.findElement(By.xpath("(//select[@formcontrolname='edu_title'])[1]")));
					select.selectByVisibleText("CBSC");

				}
				public void Hschoolpercentage(String percentage)
				{
					WebElement uhper=driver.findElement(By.xpath("(//input[@placeholder='Percentage Scored'])[1]"));
					uhper.sendKeys(String.valueOf(percentage));
					
				}
				public void Hschoolname(String highschool)
				{
					WebElement uhname=driver.findElement(By.xpath("(//input[@placeholder='School Name'])[1]"));
					uhname.sendKeys(highschool);

				}
				public void Hschoolyearofpass(String yearofpass)
				{
					WebElement uhyear=driver.findElement(By.xpath("(//input[@placeholder='Year of Pass'])[1]"));
					uhyear.sendKeys(yearofpass);

				}
				//Higher secondary
				
				public void HighersecondaryQulfcan()
				{
					Select select = new Select(driver.findElement(By.xpath("(//select[@formcontrolname='edu_title'])[2]")));
					select.selectByVisibleText("CBSC");

				}
				public void Highersecondary(String percentage)
				{
					WebElement higherper=driver.findElement(By.xpath("(//input[@placeholder='Percentage Scored'])[2]"));
					higherper.sendKeys(String.valueOf(percentage));
					
				}
				public void Highersecondaryname(String higherschool)
				{
					WebElement highername=driver.findElement(By.xpath("(//input[@formcontrolname='edu_school'])[1]"));
					highername.sendKeys(higherschool);

				}
				public void Highersecondaryyearofpass(String yearofpass)
				{
					WebElement higheryear=driver.findElement(By.xpath("(//input[@placeholder='Year of Pass'])[2]"));
					higheryear.sendKeys(yearofpass);

				}
				//Graduation
				public void GraduationCourse()
				{
					Select select = new Select(driver.findElement(By.xpath("(//select[@formcontrolname='edu_title'])[3]")));
					select.selectByVisibleText("BCA");

				}
				public void GraduationStream()
				{
					Select select = new Select(driver.findElement(By.xpath("(//select[@formcontrolname='edu_stream'])[1]")));
					select.selectByVisibleText("IT/CS");

				}
				public void GraduationPercentage(String percentage)
				{
					WebElement Gper=driver.findElement(By.xpath("(//input[@placeholder='Percentage Scored'])[3]"));
					Gper.sendKeys(String.valueOf(percentage));
					
				}
				public void GInstitutionName(String ginstitute)
				{
					WebElement ginstitutename=driver.findElement(By.xpath("(//input[@placeholder='Institution Name'])[1]"));
					ginstitutename.sendKeys(ginstitute);
				}
				public void Graduationyearofpass(String yearofpass)
				{
					WebElement Gyear=driver.findElement(By.xpath("(//input[@placeholder='Year of Pass'])[3]"));
					Gyear.sendKeys(yearofpass);

				}
				//post Graduation
				public void PGCourse()
				{
					Select select = new Select(driver.findElement(By.xpath("(//select[@formcontrolname='edu_title'])[4]")));
					select.selectByVisibleText("MCA");

				}
				public void PGStream()
				{
					Select select = new Select(driver.findElement(By.xpath("(//select[@formcontrolname='edu_stream'])[2]")));
					select.selectByVisibleText("IT/CS");

				}
				public void PGPercentage(String percentage)
				{
					WebElement pgper=driver.findElement(By.xpath("(//input[@class='form-control'])[14]"));
					pgper.sendKeys(percentage);
					
				}
				public void PGInstitutionName(String ginstitute)
				{
					WebElement pginstitutename=driver.findElement(By.xpath("(//input[@placeholder='Institution Name'])[2]"));
					pginstitutename.sendKeys(ginstitute);
				}
				public void PGyearofpass(String yearofpass)
				{
					WebElement PGyear=driver.findElement(By.xpath("(//input[@placeholder='Year of Pass'])[4]"));
					PGyear.sendKeys(yearofpass);

				}
				//Add your projects
			
				public void AddProjects()
				{
				WebElement addproject=driver.findElement(By.xpath("//table[@formarrayname='projects']//button[contains(@class, 'btn-primary')]"));
				addproject.click();
				}
				public void ProjectTittle(String PTittle)
				{
					WebElement ptittle=driver.findElement(By.xpath("//input[@formcontrolname='title']"));
					ptittle.sendKeys(PTittle);
				}
				
				public void Projectdes(String Pdes)
				{
					WebElement pdes=driver.findElement(By.xpath("//input[@formcontrolname='desc']"));
					pdes.sendKeys(Pdes);
				}
				//Remove Project
				public void ProjectRemove()
				{
					WebElement premove=driver.findElement(By.xpath("//button[@class='btn btn-remove']"));
					premove.click();
					
				}
				//Add additional Qualifications
				public void AdditnalQualifctn()
				{
				WebElement addqu=driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[2]"));
				addqu.click();
				}
				//course type
				public void Coursetype()
				{
					Select select = new Select(driver.findElement(By.xpath("//select[@formcontrolname='edu_type']")));
					select.selectByVisibleText("Short-term Course");

				}
				//course name
				public void CName(String coursename)
				{
					WebElement cname=driver.findElement(By.xpath("//input[@formcontrolname='course_name']"));
					cname.sendKeys(coursename);
				}
				
				//percentage scored
				public void CPercentage(String percentage)
				{
					WebElement cper=driver.findElement(By.xpath("//input[@formcontrolname='percentage']"));
					cper.sendKeys(percentage);
				}
				//remove course
				public void CourseRemove()
				{
					WebElement cremove=driver.findElement(By.xpath("(//button[@class='btn btn-remove'])[2]"));
					cremove.click();
					
				}
				//Job experience
				public void AddExp()
				{
				WebElement addexp=driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[3]"));
				addexp.click();
				}
				//job title
				public void JobTitle(String jobtitle)
				{
					WebElement cname=driver.findElement(By.xpath("(//input[@formcontrolname='job_title'])[1]"));
					cname.sendKeys(jobtitle);
				}
				//from
				public void Expfrom(String expfrom)
				{
					WebElement from=driver.findElement(By.xpath("((//input[@formcontrolname='exp_from'])[1]"));
					from.sendKeys(expfrom);
				}
				//TO
				public void ExpTO(String expto)
				{
					WebElement from=driver.findElement(By.xpath("(//input[@formcontrolname='exp_to'])[1]"));
					from.sendKeys(expto);
				}
				//remove experience
				public void ExpRemove()
				{
					WebElement expremove=driver.findElement(By.xpath("(//button[@class='btn btn-remove'])[3]"));
					expremove.click();
					
				}
				//skills
				public void AddSkillbutton()
				{
				WebElement addskill=driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[4]]"));
				addskill.click();
				}
				//add skill
				public void Addskill(String addskill)
				{
					WebElement skill=driver.findElement(By.xpath("(//input[@formcontrolname='skills'])[1]"));
					skill.sendKeys(addskill);
				}
				//remove skill
				public void skillRemove()
				{
					WebElement skillremove=driver.findElement(By.xpath("(//button[@class='btn btn-remove'])[4]"));
					skillremove.click();
				}
				//language add button
				public void Addlangbutton()
				{
				WebElement addlang=driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[5]"));
				addlang.click();
				}
				//Languages Known
				public void Laguage(String language)
				{
					WebElement lang=driver.findElement(By.xpath("(//input[@formcontrolname='languages'])[1]"));
					lang.sendKeys(language);
				}
				//language remove
				public void LanguageRemove()
				{
					WebElement langremove=driver.findElement(By.xpath("(//button[@class='btn btn-remove'])[1]"));
					langremove.click();
				}
				//Programming Languages known:
				public void Addplang()
				{
				WebElement addplang=driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[6]"));
				addplang.click();
				}
				//Language name
				public void PLaguageName(String planguage)
				{
					WebElement Plang=driver.findElement(By.xpath("(//input[@formcontrolname='progs'])[1]"));
					Plang.sendKeys(planguage);
				}
				//Your progress in percentage
				public void PLaguageper(String planguageper)
				{
					WebElement Plangper=driver.findElement(By.xpath("(//input[@formcontrolname='prog_perc'])[1]"));
					Plangper.sendKeys(String.valueOf(planguageper));
				}
				//Remove Programming Languages known:
				public void PlangRemove()
				{
					WebElement plangremove=driver.findElement(By.xpath("(//button[@class='btn btn-remove'])[2]"));
					plangremove.click();
				}
				//Your achievements add button:
				public void Achievementsbutton()
				{
				WebElement ach=driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[7]"));
				ach.click();
				}
				// your achievements
				public void Achievements(String achievements)
				{
					WebElement ach=driver.findElement(By.xpath("//input[@formcontrolname='achievements']"));
					ach.sendKeys(achievements);
				}
				
				//Your achievements remove button:
				public void AchievementsRemove()
				{
					WebElement achremove=driver.findElement(By.xpath("(//button[@class='btn btn-remove'])[3]"));
					achremove.click();
				}
				//Describe yourself in two or three lines:
				public void Describe(String describe)
				{
					WebElement des=driver.findElement(By.id("yourself"));
					des.sendKeys(describe);
					
				}
				
	//choose image
				
				public void chooseImage(String imageLocation)
				{
		            
					WebElement image=driver.findElement(By.xpath("//input[@type='file']"));
					image.click();
				}

				
					// accept check box
					public void Acccheckbox() 
					{
			            
						WebElement acccheck=driver.findElement(By.xpath("//input[@type='checkbox']"));
						acccheck.click();
				}
				//create profile
				public void CreateProfile1()
				{
					WebElement createprofile=driver.findElement(By.xpath("//form[@class='ng-pristine ng-invalid ng-touched']"));
					createprofile.click();
					driver.switchTo().alert().accept();
				}

				 
					
				}
				


				








