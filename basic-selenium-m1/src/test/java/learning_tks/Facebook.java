package learning_tks;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Facebook {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://facebook.com/");
		
		Thread.sleep(3000);
//		driver.getScreenshotAs()
		
		TakesScreenshot tks = (TakesScreenshot) driver;
//		this tks is nothing but, driver only
//		just with additional features of TakesScreenshot interface
		
//		we can just access only one method through tks,
//		bcz its type has only one method
		 
		File source = tks.getScreenshotAs(OutputType.FILE);
//		tks.getScreenshotAs(OutputType.BASE64);
//		tks.getScreenshotAs(OutputType.BYTES);
		
//		file handling
		
//		we can't create object of non-java file like:
//		dummy d = new dummy();
	
//		File 
//		FileInputStream
//		FileReader
//		FileWriter
//		FileOutputStream
	
//		create java representation object of the physical file
//		File f = new File("C:\\Users\\User\\git\\m1basic\\basic-selenium-m1\\errorShots\\dummy.png");
//		. means project level
		File destination = new File("./errorShots/dummy.png");
		
//		" string
//		\ escape character
//		\ parent to child
		
		FileHandler.copy(source, destination);
		
		Thread.sleep(3000);
		driver.quit();
	}
}
