package collection;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		List<WebElement>links = driver.findElements(By.tagName("a"));
		System.out.println("No.of links are::"+links.size());
		for(WebElement each:links)
		{
			String linkname = each.getText();
			String linkurls = each.getAttribute("href");
			System.out.println(linkname+"\n"+linkurls);
			
		}
		
	}

}
