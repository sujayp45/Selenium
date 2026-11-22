package Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     
		WebDriver driver = new ChromeDriver();
		driver.get("https://qa-automation-practice.netlify.app/radiobuttons.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("radio-button1")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("radio-button2")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("radio-button3")).click();
		
	}

}
