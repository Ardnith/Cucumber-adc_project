package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.pom.Book_hotel_page;
import com.pom.Confirmation_page;
import com.pom.Login_page;
import com.pom.Search_Hotel_page;
import com.pom.Select_hotel;

public class PageObjct_manager {

	public static WebDriver driver;
	
	
	public PageObjct_manager(WebDriver driverA){
	this.driver=driverA;
	
	}
	
	public Login_page getLoginpage() {
	Login_page lp = new Login_page(driver);
	return lp;
	}
	
	public Search_Hotel_page getSerachhotel() {
	Search_Hotel_page sh = new Search_Hotel_page(driver);
	   return sh;
	}
	
	public Select_hotel getSelecthotel() {
		Select_hotel seh = new Select_hotel(driver);
       return seh;	
	}
	
	public Book_hotel_page getBookHotel() {
		Book_hotel_page bh = new Book_hotel_page(driver);
		return bh;
	}

	public Confirmation_page getconfirmationpage() {
	Confirmation_page cp = new Confirmation_page(driver);
return cp;
}

}
