package com.digitalresumebuilder.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUp 
{
	WebDriver driver ;
	private WebElement username,phno,mail,passw,cpassw,reg;
	public SignUp(WebDriver driver) 
	{
		this.driver=driver;
		
	}
	public void scrollIntoView(WebElement element) throws InterruptedException
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500);
	}
	
	
		public void signupclick() throws InterruptedException 
		{
			
	        WebElement clicksignup = driver.findElement(By.xpath("//a[@routerlink='login']"));
	        scrollToTop();
	        clicksignup.click();
	}
	
	
	public void setUsername(String setUser) throws InterruptedException {
		

		username=driver.findElement(By.xpath("//input[@type='text' and @formcontrolname='username']"));
		scrollIntoView((username));
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
	private void scrollToTop() throws InterruptedException
    {
        ((JavascriptExecutor) driver).executeScript("javascript:window.scrollBy(0,250)","");
        Thread.sleep(500);
        ((JavascriptExecutor) driver).executeScript("javascript:window.scrollTo(0,0)","");
        Thread.sleep(500);
    }
	private void scrollToBottom() throws InterruptedException
    {
        ((JavascriptExecutor) driver).executeScript("javascript:window.scrollBy(0,250)","");
        Thread.sleep(500);
        ((JavascriptExecutor) driver).executeScript("javascript:window.scrollTo(0,0)","");
        Thread.sleep(500);
    }
	
	
}
