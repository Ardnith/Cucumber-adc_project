package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_hotel {

	@FindBy(id = "radiobutton_0")
	private WebElement radiobtn;

	@FindBy(id = "continue")
	private WebElement cntuebtn;

	public static WebDriver driver;

	public Select_hotel(WebDriver driver3) {
		this.driver = driver3;
		PageFactory.initElements(driver, this);

	}

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getCntuebtn() {
		return cntuebtn;
	}






}
