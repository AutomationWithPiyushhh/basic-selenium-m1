package learning_popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
	public static void main(String[] args) throws InterruptedException, AWTException {

//		avoid notification popup => will not visible on the screen itself
//		change the browser setting and make it disable of notification popups
//
		ChromeOptions setting = new ChromeOptions();
		setting.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(setting);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.easemytrip.com/");

		Thread.sleep(7000);

//		handle it using robot class
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		robot.keyRelease(KeyEvent.VK_ESCAPE);

		Thread.sleep(3000);
		driver.quit();
	}
}
