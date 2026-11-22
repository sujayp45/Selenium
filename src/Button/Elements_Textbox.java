package Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements_Textbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      
      driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
      driver.findElement(By.id("fullname")).sendKeys("skp");
      Thread.sleep(1000);
      driver.findElement(By.id("email")).sendKeys("hfhheg@gmail.com");
      Thread.sleep(1000);
      driver.findElement(By.id("address")).sendKeys("hglkjgl hsfhkhkahf ghfjbjkfh");
      Thread.sleep(1000);
      driver.findElement(By.id("password")).sendKeys("dhf366");
      Thread.sleep(1000);
      driver.findElement(By.xpath("//input[@type='submit']")).click();
      
	}

}
