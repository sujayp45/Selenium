package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Xpath1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("soldier");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("546541");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@id='loginbutton']")).click();
		Thread.sleep(1000);
		driver.close();
		
		
	}

}
