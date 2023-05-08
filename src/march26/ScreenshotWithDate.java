package march26;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotWithDate {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		// create java time stamp
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("YYYY_MM_DD HH_MM_SS");
		String datef = df.format(date);
		// take screenshot and store
		File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// copy screen shot in local system
		FileUtils.copyFile(screen, new File("F://Screens/"+datef+"  "+"homepage.png"));
		driver.close();

	}

}
