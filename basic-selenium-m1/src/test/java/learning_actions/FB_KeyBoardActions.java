package learning_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FB_KeyBoardActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");
		
		Actions act = new Actions(driver);

		Thread.sleep(3000);
				
//		keyboard => sendKeys()
		act.sendKeys("admin").perform();	
		
		act.sendKeys(Keys.TAB).perform();
		
		act.sendKeys("1234567890").perform();	

//		press control
		act.keyDown(Keys.CONTROL).perform();
		
//		type a
		act.sendKeys("a");
		
//		release control
		act.keyUp(Keys.CONTROL).perform();
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
