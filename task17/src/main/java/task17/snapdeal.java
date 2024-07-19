package task17;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class snapdeal {
	
	public static void main(String args[]) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.snapdeal.com");
		
		driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/span[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[2]/span[2]/a")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().frame("loginIframe");
		
		driver.findElement(By.id("userName")).sendKeys("psuryavamsi88@gmail.com");
		
		Thread.sleep(10000);
		
		driver.findElement(By.id("checkUser")).click();
		
		Thread.sleep(20000);
		
		
		driver.findElement(By.id("loginUsingOtp")).click();
		
		driver.switchTo().defaultContent();

		driver.close();
	
		
		
		
	}

}
