package march10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VakidationMethods {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		Thread.sleep(2000);
		// print Title and Length of title
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		// print Url and Length of Url
		String strUrl = driver.getCurrentUrl();
		System.out.println(strUrl);
		System.out.println(strUrl.length());




	}

}
