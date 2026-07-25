package learning_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AWP_MouseActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://automationwithpiyush.vercel.app/actions.html");

		Actions act = new Actions(driver);
//		hover
		WebElement hoverEle = driver.findElement(By.xpath("//button[contains(text(), 'Hover')]"));
		act.moveToElement(hoverEle).perform();

//		left click
		WebElement lc = driver.findElement(By.id("click-icon"));
//		act.moveToElement(lc).perform();
//		act.click().perform();

//		act.moveToElement(lc).click().build().perform();

		act.click(lc).perform();

//		double click
		WebElement dc = driver.findElement(By.id("db-icon"));
		act.doubleClick(dc).perform();

//		right click
		WebElement rc = driver.findElement(By.id("right-click-area"));
		act.contextClick(rc).perform();

		Thread.sleep(3000);
		driver.quit();
	}
}
