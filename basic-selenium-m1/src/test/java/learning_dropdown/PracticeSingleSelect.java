package learning_dropdown;

import java.time.Duration;
import java.util.List;

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

////		step 1> create webelement for dd
//		WebElement countryDD = driver.findElement(By.id("single-select"));
//
////		step 2> create object of select class
//		Select sel = new Select(countryDD);
//
////		step 3> peform task using sel ref variable
//		sel.selectByIndex(1);
//		Thread.sleep(1000);
////		sel.deselectByIndex(1); UnsupportedOperationException: 
////		You may only deselect options of a multi-select
//
//		System.out.println(sel.isMultiple());

//		step 1> create webelement for dd
//		<select id="multi-select" name="skills" multiple="" size="6">
		WebElement subjectDD = driver.findElement(By.id("multi-select"));

//		step 2> create object of select class
		Select selSubject = new Select(subjectDD);

		System.out.println(selSubject.isMultiple());

//		step 3> peform task using sel ref variable

//		get all the options
		List<WebElement> options = selSubject.getOptions();

		for (WebElement i : options) {
//			System.out.println(i.getText());
		}

		selSubject.selectByIndex(0);
		Thread.sleep(1000);
		selSubject.selectByValue("selenium");
		Thread.sleep(1000);
		selSubject.selectByIndex(3);

		Thread.sleep(1000);

//		selSubject.deselectAll(); 

//		get all the selected options
		List<WebElement> selectedOptions = selSubject.getAllSelectedOptions();

		for (WebElement i : selectedOptions) {
			System.out.println(i.getText());
		}

//		get the first selected option
		WebElement firstSelectedOption = selSubject.getFirstSelectedOption();

		System.out.println(firstSelectedOption.getText());

		Thread.sleep(3000);
		driver.quit();
	}
}
