package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_loginPOM {

	public static WebDriver adriver;
	
	public Adactin_loginPOM(WebDriver mydriver) {
		
		this.adriver = mydriver;
		
		PageFactory.initElements(adriver, this);
	}
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement login;

	public WebElement Username() {
		return username;
	}

	public WebElement Password() {
		return password;
	}

	public WebElement Loginbutton() {
		return login;
	}
	
	
	
	
	
	
}
