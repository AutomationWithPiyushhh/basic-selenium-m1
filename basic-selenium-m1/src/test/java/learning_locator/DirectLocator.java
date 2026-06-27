package learning_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://automationwithpiyush.vercel.app/locatorsSignin.html");
		
//		write something to username
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("admin");
		
		Thread.sleep(1000);
		
//		write something to password
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("123456789");

		Thread.sleep(1000);
		
//		click on register link
		WebElement regLink = driver.findElement(By.linkText("Register"));
		regLink.click();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
