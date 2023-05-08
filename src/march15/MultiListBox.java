package march15;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiListBox {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Select dropdown = new Select(driver.findElement(By.name("birthday_month")));
		boolean value = dropdown.isMultiple();
		for(int i=0;i<10;i++)
		{
			Thread.sleep(3000);
			dropdown.getAllSelectedOptions();
		}
		List<WebElement> Olist = dropdown.getAllSelectedOptions();
		System.out.println("No of items selected::"+Olist.size());
		for(WebElement each : Olist)
		{
			System.out.println(each.getText());
		}
	/*	dropdown.deselectByIndex(5);
		dropdown.deselectByIndex(7);
		dropdown.deselectByIndex(3);
		driver.quit();  */
		
	}

}
