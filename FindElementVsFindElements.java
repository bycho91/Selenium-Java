package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class FindElementVsFindElements {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.nopcommerce.com");
		
		WebElement firstLi = driver.findElement(By.cssSelector(".top-menu>li"));
		
		List<WebElement> allLis = driver.findElements(By.cssSelector(".top-menu>li"));
		
		System.out.println(firstLi.getText());
		allLis.forEach(li -> {
			System.out.println(li.getText());
		});
		
		
		driver.quit();
	}
}
