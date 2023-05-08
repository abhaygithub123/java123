package march17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandelingActions1 {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		Actions ac = new Actions(driver);
		driver.findElement(By.name("q")).sendKeys("selenium openings");
		Thread.sleep(2000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		ac.sendKeys(Keys.ENTER).perform();
		
		

	}

}
