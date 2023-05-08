package march22;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement>rows = table.findElements(By.tagName("tr"));
		System.out.println("No of Rows are::"+rows.size());
		for(int i=1;i<rows.size();i++)
		{
			List<WebElement>cols = rows.get(i).findElements(By.tagName("td"));
			System.out.println("Row No."+i+"  "+"Column size::"+"   "+cols.size());
		}
	}
}
