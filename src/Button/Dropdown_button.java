package Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dropdown");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement list = driver.findElement(By.id("dropdown"));
		Select s = new Select(list);
		s.selectByIndex(2);
	//	Thread.sleep(2000);
      //  s.selectByValue("1");
	//	Thread.sleep(2000);
	//	s.selectByVisibleText("Option 2");
		
		
	}

}
