package learning_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("C:/Users/User/git/m1basic/basic-selenium-m1/src/test/resources/html/popups.html");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("phone")).sendKeys("123456789");
		driver.findElement(By.id("m")).click();
		driver.findElement(By.id("t&c")).click();
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\User\\OneDrive\\Desktop\\Selenium Advance IMP.pdf");
		
		Thread.sleep(7000);
		driver.quit();
	}
}
