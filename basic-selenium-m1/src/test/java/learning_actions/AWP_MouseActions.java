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

//		click & hold and release 
//		WebElement ch = driver.findElement(By.id("hold-icon"));
//		act.moveToElement(ch).clickAndHold().build().perform();
//
//		Thread.sleep(3000);
//
//		act.release().perform();

//		drag & drop
//		WebElement source1 = driver.findElement(By.id("prod-laptop"));
//		WebElement source2 = driver.findElement(By.id("prod-phone"));
//		WebElement source3 = driver.findElement(By.id("prod-watch"));
//		WebElement source4 = driver.findElement(By.id("prod-headphones"));
//
//		WebElement destination = driver.findElement(By.id("cart-zone"));
//
//		act.dragAndDrop(source1, destination).perform();
//		Thread.sleep(1000);
//		act.dragAndDrop(source2, destination).perform();
//		Thread.sleep(1000);
//
//		act.dragAndDropBy(source3, 200, 0).perform();
//		Thread.sleep(1000);
//		act.dragAndDropBy(source4, 200, 0).perform();

//		scrolling

		WebElement slider = driver.findElement(By.id("pulse-slider"));

		act.scrollToElement(slider).perform();
		
		Thread.sleep(2000);
		
		int sliderWidth = slider.getSize().getWidth();

//		act.moveToElement(slider)
//			.moveByOffset(sliderWidth/4, 0)
//			.click()
//			.build().perform();

		act.moveToElement(slider, sliderWidth/4, 0)
			.click()
			.build().perform();
		
		act.scrollToElement(slider).perform();
		act.scrollByAmount(0, -100).perform();
		
		
		
		Thread.sleep(3000);
		act.scrollByAmount(0, -100).perform();
		Thread.sleep(3000);
		act.scrollByAmount(0, -100).perform();
		Thread.sleep(3000);

		Thread.sleep(3000);
		driver.quit();
	}
}
