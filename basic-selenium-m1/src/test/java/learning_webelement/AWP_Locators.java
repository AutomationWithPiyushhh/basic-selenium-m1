package learning_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AWP_Locators {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://automationwithpiyush.vercel.app/locatorsSignin.html");

		WebElement un = driver.findElement(By.id("email"));

		un.sendKeys("admin");
		Thread.sleep(1000);
		un.clear();
		Thread.sleep(1000);
		un.sendKeys("manager");

		Thread.sleep(1000);

		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("1234567890");
		Thread.sleep(1000);

		WebElement check = driver.findElement(By.cssSelector("input[type='checkbox']"));
		check.click();
		Thread.sleep(1000);

		WebElement loginBtn = driver.findElement(By.xpath("//button[contains(@id, 'u_0_5_')]"));

//		getters of login button
		String tagOfLogin = loginBtn.getTagName();
		String idOfLogin = loginBtn.getAttribute("id");
		String cssValue = loginBtn.getCssValue("text-transform");
		String textOfLogin = loginBtn.getText();

		Dimension dimOfLogin = loginBtn.getSize();

		Point ptOfLogin = loginBtn.getLocation();

		Rectangle rectLogin = loginBtn.getRect();
		System.out.println(rectLogin.getWidth() + " " + 
							rectLogin.getHeight()+ " " + 
							rectLogin.getDimension() + " " + 
							rectLogin.getX()+ " " + 
							rectLogin.getY() + " " + 
							rectLogin.getPoint());

		System.out.println("tag : " + tagOfLogin);
		System.out.println("id : " + idOfLogin);
		System.out.println("textTransform : " + cssValue);
		System.out.println("text : " + textOfLogin);
		System.out.println("dim : " + dimOfLogin);
		System.out.println("pt : " + ptOfLogin);
		System.out.println("rect : " + rectLogin); // object address

		if (loginBtn.isDisplayed() && loginBtn.isEnabled() && check.isSelected()) {
			Thread.sleep(1000);
			loginBtn.submit();
		} else {
			System.out.println("could not login....");
		}

		Thread.sleep(3000);
		driver.quit();
	}
}
