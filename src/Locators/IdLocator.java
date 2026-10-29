package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("soldier");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("325ffn");
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
