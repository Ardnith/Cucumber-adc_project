package com.stepDefinition;

import com.baseclass.Base_Class;
import com.pageobjectmanager.PageObjct_manager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AAHotel_booking extends Base_Class {

	PageObjct_manager pom = new PageObjct_manager(driver);

	@Given("user launches the application")
	public void user_launches_the_application() {
		geturl("https://adactinhotelapp.com/index.php");
	}

	@When("user enter the username in the username field")
	public void user_enter_the_username_in_the_username_field() {
		sendkeys(pom.getLoginpage().getUsername(), "AravindC");
	}

	@When("user enter the password in the password field")
	public void user_enter_the_password_in_the_password_field() {
		sendkeys(pom.getLoginpage().getPassword(), "Test@12345");
	}

	@Then("user clicks ths login button and navigates to search hotel page")
	public void user_clicks_ths_login_button_and_navigates_to_search_hotel_page() {
		click(pom.getLoginpage().getLoginbtn());
	}

	@When("user select the location from the dropdown")
	public void user_select_the_location_from_the_dropdown() {
		dropdown(pom.getSerachhotel().getLocation(), "index", "2");
	}

	@When("user select the hotel from the dropdown")
	public void user_select_the_hotel_from_the_dropdown() {
		dropdown(pom.getSerachhotel().getHotelname(), "index", "3");
	}

	@When("user select the roomtype from the dropdown")
	public void user_select_the_roomtype_from_the_dropdown() {
		dropdown(pom.getSerachhotel().getRoomtype(), "index", "2");
	}

	@When("user select the number of room  from the dropdown")
	public void user_select_the_number_of_room_from_the_dropdown() {
		dropdown(pom.getSerachhotel().getRooms(), "index", "2");
	}

	@When("user enter the checkin date in the check in field")
	public void user_enter_the_checkin_date_in_the_check_in_field() {
		sendkeys(pom.getSerachhotel().getCheckin(), "05/08/2022");
	}

	@When("user enter the checkout date in the check out field")
	public void user_enter_the_checkout_date_in_the_check_out_field() {
		sendkeys(pom.getSerachhotel().getCheckout(), "06/08/2022");
	}

	@When("user select the Number of adults per room from the dropdown")
	public void user_select_the_number_of_adults_per_room_from_the_dropdown() {
		dropdown(pom.getSerachhotel().getAdult(), "index", "2");
	}

	@When("user select the Number of children per room from the dropdown")
	public void user_select_the_number_of_children_per_room_from_the_dropdown() {
		dropdown(pom.getSerachhotel().getChild(), "index", "1");
	}

	@Then("user clicks the search button and navigates to select hotel page")
	public void user_clicks_the_search_button_and_navigates_to_select_hotel_page() {
		click(pom.getSerachhotel().getSearchbtn());
	}

	@When("user click the radio button")
	public void user_click_the_radio_button() {
		click(pom.getSelecthotel().getRadiobtn());
	}

	@Then("user clicks the continue button and navigates to book a hotel page")
	public void user_clicks_the_continue_button_and_navigates_to_book_a_hotel_page() {
		click(pom.getSelecthotel().getCntuebtn());
	}

	@When("user enter the first name in the first name field")
	public void user_enter_the_first_name_in_the_first_name_field() {
		sendkeys(pom.getBookHotel().getFname(), "Aravind");
	}

	@Given("user enter the last name in the last name field")
	public void user_enter_the_last_name_in_the_last_name_field() {
		sendkeys(pom.getBookHotel().getLname(), "Nithin");
	}

	@Given("user enter the address in the billing addres field")
	public void user_enter_the_address_in_the_billing_addres_field() {
		sendkeys(pom.getBookHotel().getBillingadrs(), "A block , syndey, Australia");
	}

	@Given("user enter the credit card number in the credit card no field")
	public void user_enter_the_credit_card_number_in_the_credit_card_no_field() {
		sendkeys(pom.getBookHotel().getCrdnum(), "1234567899876543");
	}

	@Given("user select the cardtype from the dropdown")
	public void user_select_the_cardtype_from_the_dropdown() {
		dropdown(pom.getBookHotel().getCrdtype(), "index", "3");
	}

	@Given("user select the expiry month from the dropdown")
	public void user_select_the_expiry_month_from_the_dropdown() {
		dropdown(pom.getBookHotel().getCrdexpm(), "index", "5");
	}

	@Given("user select the expiry year from the dropdown")
	public void user_select_the_expiry_year_from_the_dropdown() {
		dropdown(pom.getBookHotel().getCrdexpyr(), "index", "11");
	}

	@Given("user enter the CVV number in the cvv number field")
	public void user_enter_the_cvv_number_in_the_cvv_number_field() {
		sendkeys(pom.getBookHotel().getCvv(), "456");
	}

	@Then("user clicks the book now button and navigates to booking Confirmation page")
	public void user_clicks_the_book_now_button_and_navigates_to_booking_confirmation_page() {
		click(pom.getBookHotel().getBookbtn());
	}

	@Then("user clicks the logout button")
	public void user_clicks_the_logout_button() throws InterruptedException {
		Thread.sleep(20000);
		click(pom.getconfirmationpage().getLogoutbtn());
	}

}
