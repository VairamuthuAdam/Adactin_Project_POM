package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_SearchPOM {

	public static WebDriver adriver;
	
	public Adactin_SearchPOM(WebDriver mydriver) {
		
		this.adriver = mydriver;
		
		PageFactory.initElements(adriver, this);
	}
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement numberofroom;
	
	@FindBy(id="datepick_in")
	private WebElement CheckInDate;
	
	@FindBy(id="datepick_out")
	private WebElement CheckOutDate;
	
	@FindBy(id="adult_room")
	private WebElement adult;
	
	@FindBy(id="child_room")
	private WebElement child;
	
	@FindBy(id="Submit")
	private WebElement Search;

	
	public WebElement selectLocation() {
		return location;
	}

	public WebElement selectHotels() {
		return hotels;
	}

	public WebElement selectRoomtype() {
		return roomtype;
	}

	public WebElement selectNumberofroom() {
		return numberofroom;
	}

	public WebElement CheckInDate() {
		return CheckInDate;
	}

	public WebElement CheckOutDate() {
		return CheckOutDate;
	}

	public WebElement AdultCount() {
		return adult;
	}

	public WebElement ChildCount() {
		return child;
	}

	public WebElement SearchButton() {
		return Search;
	}
	
	
	
	
	
}
