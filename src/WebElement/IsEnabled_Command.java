package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_Command {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(1000);

		WebElement element = driver.findElement(By.id("enabled-example-input"));
		element.sendKeys("pc");
		System.out.println("display status: " + element.isEnabled());
		driver.findElement(By.id("disabled-button")).click();
		Thread.sleep(1000);

		System.out.println("display status: " + element.isEnabled());
		driver.findElement(By.id("enabled-button")).click();
		Thread.sleep(1000);

		element.sendKeys("pc");
		System.out.println("display status: " + element.isEnabled());
		driver.close();

	}

}
