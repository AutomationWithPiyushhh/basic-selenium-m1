package learning_dropdown;

import java.net.http.WebSocket;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeSingleSelect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://automationwithpiyush.vercel.app/dropdown.html");

//		step 1> create webelement for dd
		WebElement countryDD = driver.findElement(By.id("single-select"));

//		step 2> create object of select class
		Select sel = new Select(countryDD);

//		step 3> peform task using sel ref variable
		sel.selectByIndex(1);
		Thread.sleep(1000);
//		sel.deselectByIndex(1); UnsupportedOperationException: 
//		You may only deselect options of a multi-select

		System.out.println(sel.isMultiple());
		
//		step 1> create webelement for dd
		WebElement subjectDD = driver.findElement(By.id("multi-select"));

//		step 2> create object of select class
		Select selSubject = new Select(subjectDD);

		System.out.println(selSubject.isMultiple());
		
//		step 3> peform task using sel ref variable
		selSubject.selectByIndex(0);
		Thread.sleep(1000);
		selSubject.selectByIndex(1); 
		Thread.sleep(1000);
		selSubject.selectByIndex(3); 
		Thread.sleep(1000);
		selSubject.deselectByIndex(3); 
		
		Thread.sleep(3000);
		driver.quit();
	}
}
