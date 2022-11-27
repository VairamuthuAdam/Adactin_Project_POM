package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Adactin_POM {

	public static WebDriver adriver;
	
	public Adactin_POM(WebDriver mydriver) {
		
		this.adriver = mydriver;
		
		PageFactory.initElements(adriver, this);
	}
	
	private Adactin_loginPOM login;
	private Adactin_SearchPOM search;
	private Adactin_SelectPOM select;
	private Adactin_DetailsPOM detail;

	public Adactin_loginPOM Login() {
		
		login = new Adactin_loginPOM(adriver);
		
		return login;
	}
	public Adactin_SearchPOM Search() {
		
		search = new Adactin_SearchPOM(adriver);
		
		return search;
	}
	public Adactin_SelectPOM Select() {
		
		select = new Adactin_SelectPOM(adriver);
		
		return select;
	}
	public Adactin_DetailsPOM Detail() {
		
		detail =  new  Adactin_DetailsPOM(adriver);
		
		return detail;
	}
	
	
	
	
}
