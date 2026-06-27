package initial_days;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirstLineOfCode {
	public static void main(String[] args) {
//		homogeneous type of object creation
//		ChromeDriver driver1 = new ChromeDriver();
//		EdgeDriver driver2 = new EdgeDriver();
//		FirefoxDriver driver3 = new FirefoxDriver();
	
//		after upcasting
//		WebDriver driver1 = new ChromeDriver();
//		WebDriver driver2 = new EdgeDriver();
//		WebDriver driver3 = new FirefoxDriver();

//		after polymorphism
		WebDriver driver = new ChromeDriver();
		/*
		 * WD is a type
		 * driver is a ref var
		 * new is keyword which will create random memory space in heap area
		 * CD() will do 3 jobs
		 * 	1> start the server
		 *  2> launch the empty chrome browser
		 *  3> load, reg. and reinitialize the non static member
		 */
//			      driver = new EdgeDriver();
//				  driver = new FirefoxDriver();
	}
}
