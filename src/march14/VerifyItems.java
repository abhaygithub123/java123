package march14;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyItems {

	public static void main(String[] args) {
	//	String expectitems = "books";
		String expectitems ="hydrabad";
		boolean itemsexist = false;
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement> Olist = dropdown.getOptions();
		System.out.println("No of Items are::"+Olist.size());
		for(WebElement each : Olist)
		{
			String actualitems = each.getText();
			System.out.println(actualitems);
			if(actualitems.equalsIgnoreCase(expectitems))
			{
				itemsexist = true;
				break;
			}
		}
		if(itemsexist)
		{
			System.out.println("Item found in ListBox::"+expectitems);
		}
		else
		{
			System.out.println("Item Not found in ListBox::"+expectitems);
		}
	}

}
