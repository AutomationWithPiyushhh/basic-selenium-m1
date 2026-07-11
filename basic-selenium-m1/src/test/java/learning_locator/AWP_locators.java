package learning_locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AWP_locators {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://automationwithpiyush.vercel.app/locators.html");
		
		WebElement un = driver.findElement(By.id("user_login_field"));
		un.sendKeys("admin");
		
		WebElement pwd = driver.findElement(By.name("security_passphrase"));
		pwd.sendKeys("1234567890");
		
		WebElement resetLink = driver.findElement(By.linkText("Reset Password"));
		resetLink.click();
		
		WebElement logoutLink = driver.findElement(By.partialLinkText("Logout"));
		logoutLink.click();
		
		WebElement submit = driver.findElement(By.className("primary_action"));
		submit.click();
		
//		findElements() 
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int numOfLinks = links.size();
		System.out.println(numOfLinks);
		
		for (WebElement i : links) {
			Thread.sleep(2000);
			i.click();
		}
		
//		cssSelector
		
		driver.findElement(By.cssSelector("#employee-id-input")).sendKeys("TYP2887");

		driver.findElement(By.cssSelector(".verify-status-btn")).click();
		
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
