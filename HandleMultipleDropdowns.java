package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleDropdowns {
	
	static WebDriver driver;
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://orangehrm.com/orangehrm-30-day-trial/");
		
		//Approach 1
		
//		Select numEmpsDrp = new Select(driver.findElement(By.name("NoOfEmployees")));
//		
//		Select industryDrp = new Select(driver.findElement(By.name("Industry")));
//		
//		Select countryDrp = new Select(driver.findElement(By.name("Country")));
		
		
		
		//Approach 2
		WebElement numEmps = driver.findElement(By.name("NoOfEmployees"));
		selectOptionFromDropdown(numEmps, "16 - 21");
		WebElement industry = driver.findElement(By.name("Industry"));
		WebElement country = driver.findElement(By.name("Country"));
	
		
	}
	
	public static void selectOptionFromDropdown(WebElement ele, String value) {
		Select drp = new Select(ele);
		
		List<WebElement> allOptions = drp.getOptions();
		
		for(WebElement option : allOptions) {
			if (option.getText().equals(value)) {
				option.click();
				break;
			}
		}
	}
}
