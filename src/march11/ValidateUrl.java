package march11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUrl {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	//	driver.get("https://www.google.co.in/");
    	driver.get("http://primusbank.qedgetech.com/");
		String expected = "https://";
		String actual = driver.getCurrentUrl();
		if(actual.startsWith(expected))
		{
			System.out.println("Url is Secured::"+expected+"   "+actual);
		}
		else
		{
			System.out.println("Url is Not Secured::"+expected+"   "+actual);
		}
		driver.close();
	}

}
