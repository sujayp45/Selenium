package New;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver =new ChromeDriver(); //EdgeDriver,FirefoxDriver
		driver.get("https://www.facebook.com");
		String title=driver.getTitle();
		System.out.println("Page Title is : "+title);
		System.out.println("URL is: "+driver.getCurrentUrl());
		Thread.sleep(500);
		//System.out.println("Page source is "+driver.getPageSource());
		driver.close();
        
	}

}