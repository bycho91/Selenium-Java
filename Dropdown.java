package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	public static void main(String[] args) {
		/*
		 * Select methods
		 * selectByVisibleText()
		 * selectByValue()
		 * selectByIndex()
		 * */
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		WebElement dropdownCountryElement = driver.findElement(By.id("input-country"));
		
		Select drpCountry = new Select(dropdownCountryElement);
		
//		drpCountry.selectByVisibleText("Korea, Republic of");
//		drpCountry.selectByValue("2");
//		drpCountry.selectByIndex(2);
		
		List<WebElement> allCountries = drpCountry.getOptions();
		
//		allCountries.forEach(country -> {
//			System.out.println(country.getText());
//		});
		
		for(WebElement country : allCountries) {
			if(country.getText().contains("Korea")) {
				country.click();
				break;
			}
		}
		
		
	}
}
