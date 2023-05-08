package march9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("abhay");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("Test@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		Thread.sleep(2000);
		driver.close();
	    }
        }
