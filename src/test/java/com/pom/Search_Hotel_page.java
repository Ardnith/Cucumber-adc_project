package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel_page {

	public static WebDriver driver;
	
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotelname;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement rooms;
	
	@FindBy(id="datepick_in")
	private WebElement checkin;
	
	@FindBy(id="datepick_out")
	private WebElement checkout;
	
	@FindBy(id="adult_room")
	private WebElement adult;
	
	@FindBy(id="child_room")
	private WebElement Child;
	
	@FindBy(id="Submit")
	private WebElement searchbtn;

	public Search_Hotel_page(WebDriver driver2) {
		this.driver=driver2;
	PageFactory.initElements(driver, this);	
		
	}
	
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotelname() {
		return hotelname;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return Child;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}
	
	
}
