package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_Command {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		Thread.sleep(1000);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("soldier");
		Thread.sleep(1000);
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("325ffn");
		Thread.sleep(1000); 
		
		WebElement button = driver.findElement(By.id("loginbutton"));
		button.click();
		Thread.sleep(2000);
		
		driver.close();
	}
	
	}
