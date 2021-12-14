package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckbox {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		//select specific checkbox
//		driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		//Select certain checkboxes
		List<WebElement> days = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id, 'day')]"));
//		
//		for(WebElement day : days) {
//			if(day.getAttribute("id").equals("monday") || day.getAttribute("id").toLowerCase().equals("sunday")) {
//				day.click();
//			}
//		}
		
		
		//select the last two checkboxes
		int totalCheckboxes = days.size();
		for(int i = totalCheckboxes-2; i < totalCheckboxes; i++)  {
			days.get(i).click();
		}
	}
}
