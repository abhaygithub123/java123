package march12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Select daylistbox = new Select(driver.findElement(By.id("day")));
		daylistbox.selectByIndex(25);
		Select monthlistbox = new Select(driver.findElement(By.id("month")));
		monthlistbox.selectByVisibleText("Apr");
		Select yearlistbox = new Select(driver.findElement(By.id("year")));
		yearlistbox.selectByVisibleText("1975");
		boolean  value = yearlistbox.isMultiple();
		System.out.println(value);
        driver.close();

	}
}
