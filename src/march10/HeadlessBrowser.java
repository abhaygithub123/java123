package march10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessBrowser {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://google.com");
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
