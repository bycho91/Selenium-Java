package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		//getWindowHandle()
//		String windowId = driver.getWindowHandle();
//		System.out.println(windowId);
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		
		//getWindowHandles()
		Set<String> windowIDs = driver.getWindowHandles(); //return IDs of multiple browser windows
		
		//Iterator method
		
//		Iterator<String> it = windowIDs.iterator();
//		
//		String parentWindowId = it.next();
//		String childWindowId = it.next();
//		
//		System.out.println("Parent Window ID: " + parentWindowId);
//		System.out.println("Child Window ID: " + childWindowId);
		
		//List/ArrayList method
		List<String> windowIdList = new ArrayList<>(windowIDs); //converting the set to List type
		String parentId = windowIdList.get(0);
		String childId = windowIdList.get(1);
		
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());

		
	}

}
