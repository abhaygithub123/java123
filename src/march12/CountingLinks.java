package march12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://yahoo.com");
	//	driver.get("https://rediff.com");
		List<WebElement>links = driver.findElements(By.tagName("a"));
		System.out.println("No of links are::"+links.size());
		for(WebElement each : links)
		{	
		  String linkname = each.getText();
		  String linkUrls = each.getAttribute("href");
		  System.out.println(linkname+"\n"+linkUrls);
	    }
		
		driver.quit();
	}

}
