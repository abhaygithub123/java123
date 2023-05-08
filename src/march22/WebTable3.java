package march22;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement>rows = table.findElements(By.tagName("tr"));
		System.out.println("No of rows are::"+rows.size());
		for(WebElement eachrow :rows)
		{
			List<WebElement>cols = eachrow.findElements(By.tagName("tr"));
			for(WebElement eachcell:cols)
			{
				String columndata = eachcell.getText();
				System.out.println(columndata+"\n");
			}
			System.out.println();
			System.out.println("===================================");
		}
		driver.close();
	}

}
