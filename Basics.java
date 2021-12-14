package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Basics {
	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ben Cho\\Desktop\\Selenium\\Software\\chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.navigate().to("https://www.espn.com");
//		
//		driver.get("https://www.google.com");
		
		//USING WEBDRIVERMANAGER
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver2 = new EdgeDriver();
		
		driver.get("http://zero.webappsecurity.com/index.html");
		
		String pageTitle = driver.getTitle();
		String pageUrl = driver.getCurrentUrl();
		
		System.out.println(pageTitle);
		System.out.printf("Page Url: %s", pageUrl);
		
		driver.quit();
	}
}
