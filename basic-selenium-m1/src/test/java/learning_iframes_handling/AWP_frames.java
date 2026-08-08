package learning_iframes_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AWP_frames {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://automationwithpiyush.vercel.app/frames.html");

		driver.switchTo().frame(3);
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);

		driver.findElement(By.id("secret_code")).sendKeys("12345678");

		driver.switchTo().defaultContent();

		WebElement frameA = driver.findElement(By.xpath("//span[text()='Outer Frame A']/following-sibling::iframe"));

//		driver.switchTo().frame(0);
//		driver.switchTo().frame("frame_a");
		driver.switchTo().frame(frameA);

//		write something in patients name
		WebElement patient = driver.findElement(By.id("name_input"));
		patient.sendKeys("Kallu kaliya");

		driver.switchTo().parentFrame();

		driver.switchTo().frame(1);

//		click on critical checkbox
		WebElement checkbox = driver.findElement(By.id("critical_check"));
		checkbox.click();

		driver.switchTo().parentFrame();

		Thread.sleep(3000);
		driver.quit();
	}
}
