package learning_tks;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FacebookLogin {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://facebook.com/");
		
		Thread.sleep(3000);
		
		WebElement loginBtn = driver.findElement(By.xpath("//span[text()='Log in']"));
		File source = loginBtn.getScreenshotAs(OutputType.FILE);
		File dest = new File("./errorShots/login.png");
		FileHandler.copy(source, dest);
		
		Thread.sleep(3000);
		driver.quit();
	}
}
