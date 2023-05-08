package march26;

import java.io.*;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		// take screenshot and store
		File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// copy screen shot in local system
		FileUtils.copyFile(screen, new File("F://Screens/homepage.png"));
		driver.close();
					
	}

}
