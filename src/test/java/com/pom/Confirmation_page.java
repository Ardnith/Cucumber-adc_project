package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmation_page {

	
	@FindBy(id="logout")
	private WebElement logoutbtn;
	
	public static  WebDriver driver;
	
	public Confirmation_page(WebDriver driver5) {
		this.driver = driver5;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}

	
	
}
