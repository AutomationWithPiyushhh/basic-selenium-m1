package learning_window_handling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AWP_Multi_window {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://automationwithpiyush.vercel.app/");

//		Step 1> Get the home address
		String PID = driver.getWindowHandle();

//		Step 2> Perform the task which will open the new window/s or tab/s
		driver.findElement(By.cssSelector("button[onclick='openSocialChannels()']")).click();

//		Step 3> Get the session ids of all children windows
		Set<String> CIDs = driver.getWindowHandles();

//		Step 4> switch to each and every window
		for (String i : CIDs) {
			driver.switchTo().window(i);
			System.out.println(driver.getTitle());
			
//			step 5> check for the condition and break the loop
			if (driver.getTitle().contains("LinkedIn")) {
				break;
			}
		}

//		step 6> perform the task in the child window 
		Thread.sleep(2000);
		driver.close();

//		Step 7> get back home
		driver.switchTo().window(PID);

		Thread.sleep(3000);
		driver.quit();
	}
}
