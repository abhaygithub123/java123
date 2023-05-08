package march11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateTitle {

	public static void main(String[] args)throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	//	driver.get("https://google.com");
		driver.get("https://yahoo.com");
		Thread.sleep(3000);
		String expectedtitle = "google";
		String actualtitle = driver.getTitle();
		if(expectedtitle.equalsIgnoreCase(actualtitle))
		{
			System.out.println("Title is Matching::"+expectedtitle+"   "+actualtitle);
		}
		else
		{
			System.out.println("Title is Not Matching::"+expectedtitle+"   "+actualtitle);
		}
		driver.close();
	}

}
