package march19;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JavaScript4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location = 'http://orangehrm.qedgetech.com/'");
		js.executeScript("document.querySelector('#txtUsername').value = 'Admin'");
		js.executeScript("document.querySelector('#txtPassword').value = 'Qedge123!@#'");
		js.executeScript("document.querySelector('#btnLogin').click()");
		String expected = "dashboard";
		String actual = js.executeScript("return document.URL").toString();
		if(actual.contains(expected))
		{
			System.out.println("Login Success::"+expected+"   "+actual);
		}
		else
		{
			String errormessage = js.executeScript("return document.querySelector('#spanMessage').innerHTML").toString();
			System.out.println(errormessage+"   "+expected+"  "+actual);
		}
	}

}
/* 	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://nichethyself.com/tourism/home.html");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Customized tours')]")).click();
		ArrayList<String>brw=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(brw.get(1));
		Select dropdown = new Select(driver.findElement(By.id("days")));
		dropdown.selectByVisibleText("Home Stay");
		driver.findElement(By.xpath("//label[contains(text(),'England')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Contact us!')]")).click();
        ArrayList<String>brw1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(brw1.get(2));		
	    driver.findElement(By.xpath("(//span[@class='glyphicon glyphicon-search'])[1]")).click();      
		driver.switchTo().alert().sendKeys("London");
		driver.switchTo().alert().accept();
		driver.switchTo().window(brw.get(1));
		driver.findElement(By.xpath("//input[@name='countries']//following-sibling::button[contains(text(),'Submit')]")).click();
	    driver.close();*/
