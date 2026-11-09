package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_Command {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		Thread.sleep(1000);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("soldier");
		Thread.sleep(1000);
		
		driver.close();
		
	}

}
