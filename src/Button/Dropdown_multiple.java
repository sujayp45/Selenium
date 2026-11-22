package Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_multiple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.letskodeit.com/practice");
		WebElement list = driver.findElement(By.id("multiple-select-example"));
		 Select s = new Select(list);
		 s.selectByValue("apple");
		 Thread.sleep(1000);
		 s.selectByIndex(2);
		 Thread.sleep(2000);
		 s.deselectByIndex(2);
		 
		 
	}

}
