package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusOfWebElement {
	
	
	public static void main(String[] args) {
//		Methods:
//		isDisplayed()
//		isEnabled()
//		isSelected()
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://zero.webappsecurity.com/index.html");
		
		WebElement signinButton = driver.findElement(By.id("signin_button"));
		
		
		Boolean displayed = signinButton.isDisplayed();
		Boolean enabled = signinButton.isEnabled();
		Boolean selected = signinButton.isSelected();
		
		System.out.println("Selected: " + selected);
		
		driver.quit();
		
	}
}
