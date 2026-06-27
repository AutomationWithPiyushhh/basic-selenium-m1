package learning_webdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeNavigation {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		Thread.sleep(3000);
		
		Navigation nav = driver.navigate();

		nav.to("https://www.facebook.com/");

//		URL url = new URL("https://www.facebook.com/");
//		nav.to(url);

		Thread.sleep(2000);
		nav.back();

		Thread.sleep(2000);
		nav.forward();

		Thread.sleep(2000);
		nav.refresh();

		Thread.sleep(3000);
		driver.quit();

	}
}
