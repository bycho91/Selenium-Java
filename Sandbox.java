package test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sandbox {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		
		Set<String> windowIds = driver.getWindowHandles();
		
		List<String> windowIdList = new ArrayList<>(windowIds);
		
		String parentId = windowIdList.get(0);
		String childId = windowIdList.get(1);
		
		Thread.sleep(2000);
		
		driver.switchTo().window(parentId);
		System.out.println("Parent ID: " + parentId);
		System.out.println("Child ID: " + childId);
	
		
	}
}
