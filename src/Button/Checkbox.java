package Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.qa-practice.com/elements/checkbox/mult_checkbox");
		driver.manage() .window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("id_checkboxes_0")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("id_checkboxes_1")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("id_checkboxes_2")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("submit-id-submit")).click();
	}

}
