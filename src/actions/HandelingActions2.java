package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandelingActions2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.ESCAPE).perform();
		ac.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Fashion')]"))).perform();
		ac.moveToElement(driver.findElement(By.linkText("All"))).perform();
		ac.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Electronics')]"))).perform();
		ac.moveToElement(driver.findElement(By.xpath(""))).perform();
		ac.moveToElement(driver.findElement(By.xpath(""))).perform();
		ac.moveToElement(driver.findElement(By.xpath(""))).perform();
	}

}
