package march25;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PropertyFile {

	public static void main(String[] args)throws Throwable {
		// create object for property class
		Properties config = new Properties();
		//load file
		config.load(new FileInputStream("Repository.properties"));
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(config.getProperty("Url"));
		driver.findElement(By.xpath(config.getProperty("ObjNewAccount"))).click();
		driver.findElement(By.xpath(config.getProperty("Objfname"))).sendKeys(config.getProperty("Fname"));
		driver.findElement(By.xpath(config.getProperty("Objsurname"))).sendKeys(config.getProperty("Sname"));
		driver.findElement(By.xpath(config.getProperty("ObjEmail"))).sendKeys(config.getProperty("Email"));
		driver.findElement(By.xpath(config.getProperty("Objemailreenter"))).sendKeys(config.getProperty("reemail"));
		driver.findElement(By.xpath(config.getProperty("Objpassword"))).sendKeys(config.getProperty("password"));
		new Select(driver.findElement(By.xpath(config.getProperty("Bday")))).selectByVisibleText(config.getProperty("birthday"));
		new Select(driver.findElement(By.xpath(config.getProperty("Bmonth")))).selectByVisibleText(config.getProperty("birthmonth"));
		new Select(driver.findElement(By.xpath(config.getProperty("Byear")))).selectByVisibleText(config.getProperty("birthyear"));
		driver.findElement(By.xpath(config.getProperty("ObjGender"))).click();
		driver.findElement(By.xpath(config.getProperty("ObjsaveBtn"))).click();
		
		
		
		

	}

}
