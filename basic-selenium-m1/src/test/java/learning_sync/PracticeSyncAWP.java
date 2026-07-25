package learning_sync;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeSyncAWP {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://automationwithpiyush.vercel.app/synchronization.html");

//		click on start process
		driver.findElement(By.xpath("//button[contains(text(), 'START')]")).click();
//		click on stop process		
		driver.findElement(By.xpath("//button[contains(text(), 'STOP')]")).click();

		
//		click on unlock display button
		driver.findElement(By.id("trigger-display")).click();
//		clear and write something in system monitor
		WebElement sysMon = driver.findElement(By.id("target-display"));
//		Thread.sleep(5000);
//		explicit wait		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
//		wait.until(ExpectedConditions.elementToBeClickable(sysMon));

//		fluent wait
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(15));
		wait.pollingEvery(Duration.ofSeconds(1));
		
		wait.until(ExpectedConditions.elementToBeClickable(sysMon));
		
		wait.ignoring(NoSuchElementException.class);
		wait.ignoring(ElementNotInteractableException.class);
		wait.ignoring(ElementClickInterceptedException.class);

//		TimeoutException: 
//		Expected condition failed: waiting for element to be clickable, but the element was not enabled.

		sysMon.clear(); // InvalidElementStateException:
//		invalid element state: Element is not currently interactable and may not be manipulated

		sysMon.sendKeys("admin"); // ElementNotInteractableException:
//		element not interactable

		Thread.sleep(3000);
		driver.quit();
	}
}
