package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDEx2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/ajax.html");
		Thread.sleep(1000);
		driver.findElement(By.id("yes")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("buttoncheck")).click();
		Thread.sleep(1000);
		driver.close();
	}

}
