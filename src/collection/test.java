package collection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://nichethyself.com/tourism/home.html");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Customized tours")).click();
		Select hotel = new Select(driver.findElement(By.id("days")));
		hotel.selectByIndex(2);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.xpath("//div[@class='container'][2]")).click();
		driver.switchTo().alert().sendKeys("London");
		
			
	}

}
