package learning_popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://automationwithpiyush.vercel.app/popups.html");

//		Thread.sleep(4000);

		Alert ale = driver.switchTo().alert();

		String text = ale.getText();
		System.out.println(text);

		ale.sendKeys("Dingi");

		ale.accept();

		Thread.sleep(3000);
		driver.quit();
	}
}
