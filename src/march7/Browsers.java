package march7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {

	public static void main(String[] args) {
	// creating instance object for browser class
		System.setProperty("webdriver.chrome.driver","E:\\Testing driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","E:\\Testing driver\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		
	}

}
