package learning_jse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		driver.get("https://www.zomato.com/");

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("window.location='https://www.zomato.com/';");

//		jse.executeScript("window.scrollTo(0 , 1000)"); // absolute
//		jse.executeScript("window.scrollBy(0 , 5000)"); // relative
		
		WebElement blinkit = driver.findElement(By.xpath("//div[text()='blinkit']"));

		jse.executeScript("arguments[0].scrollIntoView(true)", blinkit); // top
		
		jse.executeScript("arguments[0].scrollIntoView(false)", blinkit); // bottom
		
		Thread.sleep(5000);
		
		jse.executeScript("window.location='https://automationwithpiyush.vercel.app/locatorsSignin.html';");

		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement checkbox = driver.findElement(By.id("terms_checkbox"));
		WebElement signin = driver.findElement(By.cssSelector("button[type='submit']"));

		Thread.sleep(2000);
		jse.executeScript("arguments[0].value = arguments[1] ;", username, "admin");

		Thread.sleep(2000);
		jse.executeScript("arguments[0].value = '123456789' ;", password);

		Thread.sleep(2000);
		jse.executeScript("arguments[0].click();", checkbox);

		Thread.sleep(2000);
		jse.executeScript("arguments[0].click();", signin);

		
		
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
