package com.digitalresumebuilder.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateProfile {
	WebDriver driver;

	public CreateProfile(WebDriver driver) {

		this.driver = driver;
	}

	public void clickprofile() throws InterruptedException {
		WebElement myprofile = driver.findElement(By.xpath("//li/a[@routerlink=\"/profilehome\"]"));
		scrollIntoView(myprofile);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(myprofile));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", myprofile);

	}

	// crate a profile now
	public void CreateProfileNow() throws InterruptedException {

		WebElement profilecreate = driver.findElement(By.xpath("//button[contains(text(), 'Create a Profile Now')]"));
		// scrollIntoView(profilecreate);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(profilecreate));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", profilecreate);

		//profilecreate.click();

	}

	public void name(String fullname) throws InterruptedException {
		WebElement fullname1 = driver.findElement(By.xpath("//input[@id='name']"));
		scrollIntoView(fullname1);
		if (fullname1.getAttribute("value").isEmpty()) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			wait.until(ExpectedConditions.elementToBeClickable(fullname1));
			fullname1.sendKeys(fullname);
		} else {

			System.out.println("Name field already filled: ");
		}

	}

	public void dob(int dd, int mm, int yyyy) {
		WebElement date = driver.findElement(By.xpath("//input[@id='date']"));
		// Convert integers to strings before sending keys
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(date));
		String day = Integer.toString(dd);
		// it is used to convert the integer value to the string value
		// because in the sendkey method the string value can be pass not the integer
		String month = Integer.toString(mm);
		String year = Integer.toString(yyyy);

		if (date.getAttribute("value").isEmpty()) {
			date.sendKeys(day + "/" + month + "/" + year);
		} else {
			System.out.println("field already filled");
		}
		// Concatenate the strings and send them as keys
		date.sendKeys(day + "/" + month + "/" + year);
	}

	/*
	 * public boolean isGenderClickable() { WebElement gen =
	 * driver.findElement(By.xpath("//input[@id='gender' and @value='female']"));
	 * try { WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	 * wait.until(ExpectedConditions.elementToBeClickable(gen)); return true; }
	 * catch (Exception e) { return false; } }
	 */

	public void clickGender() {
		WebElement gen = driver.findElement(By.xpath("//input[@id='gender' and @value='female']"));
		boolean isSelected=gen.isSelected();
		if(isSelected==false)
		{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", gen);
		System.out.println("isSelected "+isSelected);
		
		}
		
		
	}

	public void email(String email)// to locate email
	{
		WebElement mailid = driver.findElement(By.xpath("//input[@name='email_id']"));
		if (mailid.getAttribute("value").isEmpty()) {
			mailid.sendKeys(email);
		} else {
			System.out.println("field already filled");
		}
	}

	public void phone(String phone)// locate phone number
	{
		WebElement ph = driver.findElement(By.xpath("//input[@placeholder='Phone Number']"));
		if (ph.getAttribute("value").isEmpty()) {
			ph.sendKeys(phone);
		} else {
			System.out.println("field already filled");
		}
	}

	public void qualification1(String quali1) {// locate qualification field for high school
		WebElement highschool1 = driver.findElement(By.xpath("(//select[@formcontrolname='edu_title'])[1]"));
		Select board1 = new Select(highschool1);// here Select is used for select the value from the drop down menu
		board1.selectByVisibleText(quali1);// selectbyvisibletext is used for value is selected by the text visible to
											// the user
	}

	public void percentage1(String percent1) {// locate to type the percentage mark of high school
		WebElement per1 = driver.findElement(By.xpath("(//input[@placeholder='Percentage Scored'])[1]"));
		if (per1.getAttribute("value").isEmpty()) {
			per1.sendKeys(percent1);
		} else {
			System.out.println("field already filled");
		}
		// find the web element to the percentage mark send key method is used for send
		// the values

	}

	public void school1(String sch1) throws InterruptedException {
		WebElement schoolname1 = driver.findElement(By.xpath("(//input[@placeholder='School Name'])[1]"));
		scrollIntoView(schoolname1);
		if (schoolname1.getAttribute("value").isEmpty()) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.elementToBeClickable(schoolname1));
			schoolname1.sendKeys(sch1);
		} else {
			System.out.println("The field is already filled");
		}
	}

	public void yop1(String pass1) throws InterruptedException {
		WebElement yearof1 = driver.findElement(By.xpath("(//input[@placeholder='Year of Pass'])[1]"));
		scrollIntoView(yearof1);
		if (yearof1.getAttribute("value").isEmpty()) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.elementToBeClickable(yearof1));
			yearof1.sendKeys(pass1);
		} else {
			System.out.println("The field is already filled");
		}
	}

	public void qualification2(String quali2) {
		WebElement highschool2 = driver.findElement(By.xpath("(//select[@formcontrolname='edu_title'])[2]"));
		Select board2 = new Select(highschool2);
		board2.selectByVisibleText(quali2);
	}

	public void percentage2(String percent2) throws InterruptedException {
		WebElement per2 = driver.findElement(By.xpath("(//input[@placeholder='Percentage Scored'])[2]"));
		scrollIntoView(per2);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(per2));

	}

	public void school2(String sch2) throws InterruptedException {
		WebElement schoolname2 = driver
				.findElement(By.xpath(" //p[@formgroupname='higherschools']//input[@formcontrolname='edu_school']"));
		scrollIntoView(schoolname2);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(schoolname2));
		schoolname2.sendKeys(sch2);

	}

	public void yop2(String pass2) throws InterruptedException {
		WebElement yearof2 = driver
				.findElement(By.xpath(" //p[@formgroupname='higherschools']//input[@formcontrolname='edu_year']"));
		scrollIntoView(yearof2);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(yearof2));
		yearof2.sendKeys(pass2);

	}

	public void qualification3(String quali3) {
		WebElement graduation = driver
				.findElement(By.xpath("  //p[@formgroupname='graduations']//select[@formcontrolname='edu_title']"));
		Select board3 = new Select(graduation);
		board3.selectByVisibleText(quali3);
	}

	public void stream(String streamsele) {
		WebElement graduationstream = driver
				.findElement(By.xpath("//p[@formgroupname='graduations']//select[@formcontrolname='edu_stream']"));
		Select str = new Select(graduationstream);
		str.selectByVisibleText(streamsele);
	}

	public void percentage3(String percent3) {
		WebElement per3 = driver
				.findElement(By.xpath(" //p[@formgroupname='graduations']//input[@formcontrolname='edu_desc']"));
		per3.sendKeys(percent3);
	}

	public void school3(String sch3) {
		WebElement schoolname3 = driver
				.findElement(By.xpath("  //p[@formgroupname='graduations']//input[@formcontrolname='edu_inst']"));
		schoolname3.sendKeys(sch3);
	}

	public void yop3(String pass3) {
		WebElement yearof3 = driver
				.findElement(By.xpath(" //p[@formgroupname='graduations']//input[@formcontrolname='edu_year']"));
		yearof3.sendKeys(pass3);
	}
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
	public void PGPercentage(String percentage) throws InterruptedException
	{
		WebElement pgper=driver.findElement(By.xpath("//input[@formcontrolname='edu_desc']"));
		scrollIntoView(pgper);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(pgper));
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

	public void project() {
		WebElement add = driver
				.findElement(By.xpath("//table[@formarrayname='projects']//button[contains(@class, 'btn-primary')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", add);

	}

	public void projectname(String pronam) throws InterruptedException {
		WebElement title = driver.findElement(
				By.xpath("//table[@formarrayname='projects']//input[contains(@formcontrolname, 'title')]"));
		scrollIntoView(title);
		if (title.getAttribute("value").isEmpty()) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.elementToBeClickable(title));
			title.sendKeys(pronam);
		} else {
			System.out.println("The field is already filled");
		}

	}

	public void projectdescrption(String pd) {
		WebElement descrip = driver
				.findElement(By.xpath("//table[@formarrayname='projects']//input[contains(@formcontrolname, 'desc')]"));
		descrip.sendKeys(pd);
	}

	public void projectremove() {
		WebElement remove = driver.findElement(By.xpath("//table[@formarrayname='projects']//button[text()='Remove']"));
		remove.click();
	}

	public void skills() {
		WebElement addskil = driver
				.findElement(By.xpath("//table[@formarrayname='skills']//button[contains(@class, 'btn btn-primary')]"));
		addskil.click();

	}

	public void skilltitle(String skill) {
		WebElement titleskill = driver
				.findElement(By.xpath("//table[@formarrayname='skills']//input[@formcontrolname='skills']"));
		titleskill.sendKeys(skill);

	}

	public void skillremove() {
		WebElement move = driver
				.findElement(By.xpath("//table[@formarrayname='skills']//button[@class='btn btn-remove']"));
		move.click();
	}

	public void language() {
		WebElement lan = driver.findElement(By.xpath("//table[@formarrayname='languages']//button[@type='button']"));
		lan.click();
	}

	public void langadd(String lang) {
		WebElement addlang = driver
				.findElement(By.xpath("//table[@formarrayname='languages']//input[@formcontrolname='languages']"));
		addlang.sendKeys(lang);

	}

	public void langremove() {
		WebElement removelang = driver
				.findElement(By.xpath("//table[@formarrayname='languages']//button[@class='btn btn-remove']"));
		removelang.click();
	}

	public void yourself(String your) {
		WebElement desyou = driver.findElement(By.xpath("//textarea[@id='yourself']"));
		desyou.sendKeys(your);
	}

	public void image(String upload) {
		WebElement imageload = driver.findElement(By.xpath("//input[@name='image']"));
		imageload.sendKeys(upload);
	}

	public void checkbox() {
		WebElement box = driver.findElement(By.xpath("//input[@type='checkbox']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", box);
	}

	public void createprofile1() {
		WebElement submit = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", submit);
		driver.switchTo().alert().accept();
	}

	public void popup()// to locate pop up message
	{
		WebElement popupmsg = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		popupmsg.click();
		driver.switchTo().alert().accept();
	}

	public void scrollIntoView(WebElement element) throws InterruptedException {
		((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500);
	}

}
