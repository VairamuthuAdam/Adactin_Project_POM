package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_DetailsPOM {

	public static WebDriver adriver;
	
	public Adactin_DetailsPOM(WebDriver mydriver) {
		
		this.adriver = mydriver;
		
		PageFactory.initElements(adriver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement firstname;
	
	@FindBy(id="last_name")
	private WebElement lastname;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement CreditCardNo;
	
	@FindBy(id="cc_type")
	private WebElement CreditCardtype;
	
	@FindBy(id="cc_exp_month")
	private WebElement CreditCardmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement CreditCardyear;
	
	@FindBy(id="cc_cvv")
	private WebElement CreditCardCVV;
	
	@FindBy(id="book_now")
	private WebElement book;
	
	@FindBy(id="order_no")
	private WebElement Confirmation;

	
	
	public WebElement Firstname() {
		return firstname;
	}

	public WebElement Lastname() {
		return lastname;
	}

	public WebElement Address() {
		return address;
	}

	public WebElement CreditCardNo() {
		return CreditCardNo;
	}

	public WebElement CreditCardtype() {
		return CreditCardtype;
	}

	public WebElement CreditCardmonth() {
		return CreditCardmonth;
	}

	public WebElement CreditCardyear() {
		return CreditCardyear;
	}

	public WebElement CreditCardCVV() {
		return CreditCardCVV;
	}

	public WebElement BookNow() {
		return book;
	}

	public WebElement Confirmation() {
		return Confirmation;
	}
	
	
	
	
}
