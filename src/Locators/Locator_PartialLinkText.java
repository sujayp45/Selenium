package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_PartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.partialLinkText("Forgotten")).click();
		Thread.sleep(5000);

		System.out.println("Navigated to forgot Password page");
		System.out.println("Page Title: " + driver.getTitle());
		driver.close();
	}

}
