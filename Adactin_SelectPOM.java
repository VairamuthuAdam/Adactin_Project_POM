package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_SelectPOM {

	public static WebDriver adriver;
	
	public Adactin_SelectPOM(WebDriver mydriver) {
		
		this.adriver = mydriver;
		
		PageFactory.initElements(adriver, this);
	}
	
	@FindBy(id="radiobutton_4")
	private WebElement Selecthotel;
	
	@FindBy(id="continue")
	private WebElement Continue;

	public WebElement Selecthotel() {
		return Selecthotel;
	}

	public WebElement ContinueButton() {
		return Continue;
	}
	
	
}
