package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_hotel_page {

	
	@FindBy(id="first_name")
	private WebElement fname;
	
	@FindBy(id="last_name")
	private WebElement lname;
	
	@FindBy(id="address")
	private WebElement billingadrs;
	
	@FindBy(id="cc_num")
	private WebElement crdnum;
	
	@FindBy(id="cc_type")
	private WebElement crdtype;
	
	@FindBy(id="cc_exp_month")
	private WebElement crdexpm;
	
	@FindBy(id="cc_exp_year")
	private WebElement crdexpyr;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement bookbtn;

	@FindBy(id="logout")
	private WebElement logoutbtn;
	
	
	public static WebDriver driver;
	
	public Book_hotel_page(WebDriver driver4) {
		this.driver = driver4;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getBillingadrs() {
		return billingadrs;
	}

	public WebElement getCrdnum() {
		return crdnum;
	}

	public WebElement getCrdtype() {
		return crdtype;
	}

	public WebElement getCrdexpm() {
		return crdexpm;
	}

	public WebElement getCrdexpyr() {
		return crdexpyr;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBookbtn() {
		return bookbtn;
	}
	
	
}
