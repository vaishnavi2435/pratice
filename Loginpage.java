package com.TestnNG.POM.Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	

	//encapsulation=private data+public method 
	WebDriver driver;
	
	public Loginpage(WebDriver driver) //driver is come form Baseclass
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//locator 
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;

	@FindBy(xpath="//button[@type='submit']")
	WebElement lgnbtn;
	
	//action
	public void doLogin(String em,String psw)
	{
		username.sendKeys(em);
		password.sendKeys(psw);
		lgnbtn.click();
	}
	
	public String geturl()
	{
		return driver.getCurrentUrl();
	}
	public String getTittle()
	{
		return driver.getTitle();
	}
}
