package collection;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyItems {

	public static void main(String[] args) {
		String expecteditem = "Books";
		boolean itemexist = false;
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement>Olist = dropdown.getOptions();
		for(WebElement each:Olist)
		{
			String actualitem = each.getText();
			
			if(actualitem.equalsIgnoreCase(expecteditem));
			{
				itemexist = true;
				break;
			}
		}
		if(itemexist)
		{
			System.out.println("item found in listbox::"+expecteditem);
		}
		else
		{
			System.out.println("item not found in listbox::"+expecteditem);
		}

	}

}
