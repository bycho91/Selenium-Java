package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextVsGetAttributeValue {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		WebElement email = driver.findElement(By.id("Email"));
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.id("Password"));
		WebElement loginBtn = driver.findElement(By.className("login-button"));
//		
//		email.clear();
//		email.sendKeys("admin123@gmail.com");
//		password.clear();
//		password.sendKeys("password");
//		
//		loginBtn.click();
		
		System.out.println(email.getAttribute("value"));
		System.out.println(email.getText());
		
		
		WebElement h1 = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[1]/strong"));
		System.out.println(h1.getText());
		
		
	}
}
