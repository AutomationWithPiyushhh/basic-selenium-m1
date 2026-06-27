package learning_webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWebdriver {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();

//		pass fqp
		driver.get("https://www.facebook.com/");

//		Get the title of the current page.
		String title = driver.getTitle();
		System.out.println(title);

//		Get a string representing the current URL that the browser is looking at.
		String url = driver.getCurrentUrl();
		System.out.println(url);

//		Get the source code of the webpage
//		String sourceCode = driver.getPageSource();
//		System.out.println(sourceCode);

//		driver.close();
//		it will close the current window, it will not stop the server
//		driver.quit();
//		it will close all the windows, it will stop the server

//		returns options <I> :
//		An interface for managing stuff you would do in a browser menu

//		ctrl + shift + o => auto import
//		Window win = driver.manage().window();

//		win.maximize();
//		Thread.sleep(1000);
//		win.minimize();
//		Thread.sleep(1000);
//		win.fullscreen();

//		get size of window
		Options opt = driver.manage();
//		Window win = driver.manage().window();
		Window win = opt.window();

//		driver.manage().window().maximize();
//		win.maximize();
//		win.minimize();
		win.fullscreen();

//		Get the size of window
		Dimension dim = win.getSize();
		System.out.println(dim); // (1386, 736)
		int width = dim.getWidth();
		System.out.println(width); // 1386
		int height = dim.getHeight();
		System.out.println(height); // 736

//		get the location of window
		Point pt = win.getPosition();
		System.out.println(pt); // (150, 100)
		int x = pt.getX();
		System.out.println(x); // 150
		int y = pt.getY();
		System.out.println(y); // 100

//		set the size of window
		win.setSize(new Dimension(500, 400));

//		set the location of window
		win.setPosition(new Point(150, 200));

		Thread.sleep(3000);
		driver.quit();
//		driver.getTitle();  //NoSuchSessionException
	}
}