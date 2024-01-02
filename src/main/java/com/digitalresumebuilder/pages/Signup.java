package com.digitalresumebuilder.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signup 
{
	WebDriver driver ;
	private WebElement username,phno,mail,passw,cpassw,reg;
	public Signup(WebDriver driver) 
	{
		this.driver=driver;
		
	}
	private void scrollIntoView(WebElement element) throws InterruptedException
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500);
	}
	
	public void OrSignupClick() throws InterruptedException
	{
	 WebElement	signup=driver.findElement(By.xpath("//a[@href='/signup']"));
	 scrollIntoView((signup));
	 signup.click();
	}
	public void setUsername(String setUser) {
		username=driver.findElement(By.xpath("//input[@type='text' and @formcontrolname='username']"));
		username.sendKeys(setUser);
	}
	public void setPhno(String setPh) {
		phno=driver.findElement(By.xpath("//input[@type='text' and @formcontrolname='phone']"));
		phno.sendKeys(String.valueOf(setPh));
	}
	public void setMail(String setMails) {
		mail=driver.findElement(By.xpath("//input[@type='text' and @formcontrolname='email_id']"));
		mail.sendKeys(setMails);
	}
	public void setPass(String setPassw) {
		passw=driver.findElement(By.xpath("//input[@type='password' and @formcontrolname='pass1']"));
		passw.sendKeys(setPassw);
	}
	public void setCpass(String setCpassw) {
		cpassw=driver.findElement(By.xpath("//input[@type='password' and @formcontrolname='pass2']"));
		cpassw.sendKeys(setCpassw);
	}
	public void Registerclick() {
	reg=driver.findElement(By.xpath("/html/body/app-root/app-signup/div/div/form/button/span"));
	reg.click();
	}
	public String invaliddata1() throws InterruptedException
	{
		WebElement uname= driver.findElement(By.xpath("//div[text()='Username is required']"));
		scrollIntoView(uname);
		String umsg = uname.getText();
		//Thread.sleep(1000);
		return umsg;
	}
	public String invaliddata2() throws InterruptedException
	{
		String pmsg = driver.findElement(By.xpath("//div[text()='phone number is required']")).getText();
		Thread.sleep(1000);
		return pmsg;
	}
	public String invaliddata3() throws InterruptedException
	{
		String emsg = driver.findElement(By.xpath("//div[text()='Email is required']")).getText();
		Thread.sleep(1000);
		return emsg;
	}
	public String invaliddata4() throws InterruptedException
	{
		String passmsg = driver.findElement(By.xpath("//div[text()='Password is required']")) .getText();
		Thread.sleep(1000);
		return passmsg;
	}
	public String invaliddata5() throws InterruptedException
	{
		String cmsg = driver.findElement(By.xpath("//div[text()='Confirm Password is required']")).getText();
		Thread.sleep(1000);
		return cmsg;
	}
}
