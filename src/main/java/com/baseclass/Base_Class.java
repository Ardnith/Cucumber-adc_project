package com.baseclass;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;

//BrowerLunch
	public static WebDriver getbrowser(String browsername) {
		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Lenovo\\eclipse-workspace\\Project\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browsername.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\Lenovo\\eclipse-workspace\\Project\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}

//URL
	public static void geturl(String url) {
		driver.get(url);
	}

//close
	public static void close() {
		driver.close();
	}

//Quit
	public static void quit() {
		driver.quit();
	}

//Title
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println("title");
	}

// Current Url
	public static void getcurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

//Navigate to 
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

//Navigate back
	public static void back() {
		driver.navigate().back();
	}

//navigate forward
	public static void forward() {
		driver.navigate().forward();
	}

//Refresh
	public static void refresh() {
		driver.navigate().refresh();
	}
//Screenshot

	public static void screenshot(String filname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Project\\Screenshot\\picture1.jpg");
		FileUtils.copyFile(src, dest);
	}

// Scroll page

	public static void scrollpage(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arugments[0].scrollIntoview();", element);
	}

//Alert 

	public static void alert(String options) {
		Alert alert = driver.switchTo().alert();
		if (options.equalsIgnoreCase("accept")) {
			alert.accept();
		} else if (options.equalsIgnoreCase("dismiss")) {
			alert.dismiss();
		} else if (options.equalsIgnoreCase("gettext")) {
			String text = alert.getText();
			System.out.println(text);
		}
	}

//Actions
	public static void actions(WebElement element, String options) {

		Actions act = new Actions(driver);
		if (options.equalsIgnoreCase("click")) {
			act.click(element).build().perform();
		} else if (options.equalsIgnoreCase("rc")) {
			act.contextClick(element).build().perform();
		} else if (options.equalsIgnoreCase("move")) {
			act.moveToElement(element).build().perform();
		} else if (options.equalsIgnoreCase("dc")) {
			act.doubleClick(element).build().perform();
		}
	}

//Robot 
	public static void robot(String options) throws AWTException {

		Robot r = new Robot();
		if (options.equalsIgnoreCase("down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		} else if (options.equalsIgnoreCase("up")) {
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
		} else if (options.equalsIgnoreCase("enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	// Dropdown

	public static void dropdown(WebElement element, String options, String SC ) {

		Select s = new Select(element);
	
//		boolean multiple = s.isMultiple();
//		System.out.println(multiple);

			if (options.equalsIgnoreCase("value")) {
			s.selectByValue(SC);
		} else if (options.equalsIgnoreCase("text")) {
			s.selectByVisibleText(SC);
		} else if (options.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(SC);
			s.selectByIndex(parseInt);
		}
	}

	
	public static void frame(WebElement element) {
		driver.switchTo().frame(element);
		
	}
	
//Click
	public static void click(WebElement element) {
		element.click();
	}

//Sendkey
	public static void sendkeys(WebElement element, String input) {
		element.sendKeys(input);

	}

}
