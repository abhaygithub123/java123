package collection;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountingItems {

	public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().deleteAllCookies();
	 driver.manage().window().maximize();
	 driver.get("https://www.amazon.in/");
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
	 List<WebElement>Olist = dropdown.getOptions();
	 System.out.println("NO.of items are::"+Olist.size());
	 for(WebElement each:Olist)
	 {
		 String eachitemname = each.getText();
		 System.out.println(eachitemname);
		 each.click();
	 }
	 driver.close();

	}
}
