package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class march11 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/");
		WebElement username = driver.findElement(By.name("txtUsername"));
		username.clear();
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.clear();
		password.sendKeys("Qedge123!@#");
		driver.findElement(By.name("Submit")).click();
		String expected = "dashboard";
		String actual = driver.getCurrentUrl();
		if(actual.contains(expected))
		{
			System.out.println("Login Success::"+expected+"   "+actual);
		}
		else
		{
			String errormessage = driver.findElement(By.id("spanMessage")).getText();
			System.out.println("errormessage"+"   "+expected+"   "+actual);
		}
		driver.quit();

	}

}
