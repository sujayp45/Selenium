package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Namelocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/facebook.html");
		Thread.sleep(1000);

		driver.findElement(By.name("email")).sendKeys("sujay");
		Thread.sleep(1000);

		driver.findElement(By.name("pass")).sendKeys("aman");
		Thread.sleep(1000);

		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(1000);

		driver.close();
	}

}
