package march22;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable4 {

	public static void main(String[] args) {
		String countryname = "Canada";
		boolean countryexist = false;
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement>rows = table.findElements(By.tagName("tr"));
		System.out.println("No of rows are::"+rows.size());
		for(WebElement eachrow : rows)
		{
			List<WebElement>cols = eachrow.findElements(By.tagName("td"));
			for(WebElement eachcell :cols)
			{
				String actualdata = eachcell.getText();
				System.out.println(actualdata+"\n");
				if(actualdata.equalsIgnoreCase(countryname))
				{
					countryexist =true;
					break;
				}
			}
			System.out.println();
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		}	
	}

}
