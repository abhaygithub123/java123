package listbox;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountingListBoxItem {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		Select daylistbox = new Select(driver.findElement(By.id("day")));
		daylistbox.selectByIndex(25);
		Select monthlistbox = new Select(driver.findElement(By.id("month")));
		monthlistbox.selectByVisibleText("Jun");
		Select yearlistbox = new Select(driver.findElement(By.id("year")));
		yearlistbox.selectByVisibleText("1975");
		driver.quit();

	}

}
