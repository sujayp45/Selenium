package Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download_uplode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		WebDriver driver = new ChromeDriver();
		driver.get(" ");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("downloadButton")).click();
		driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\admin\\Desktop\\websites for automation .txt");
	}

}
