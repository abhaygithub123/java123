package march30;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Demo {
	WebDriver driver;
	 @BeforeTest
	  public void setup()throws Throwable {
		 driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.get("http://primusbank.qedgetech.com/");
		 Thread.sleep(3000);
		 Reporter.log("Running precondition",true);
	  }
  @Test
  public void pbanking()throws Throwable {
	  driver.findElement(By.xpath("//a[contains(@href,'personal')]")).clear();
	  Reporter.log("Executing pbanking test case",true);
	  Thread.sleep(3000);
  }
  @Test
  public void cbanking()throws Throwable {
	  driver.findElement(By.xpath("//tbody/tr[1]/td[4]/a[1]/img[1]")).clear();
	  Reporter.log("Executing pbanking test case",true);
	  Thread.sleep(3000);
  }
  @Test
  public void ibanking()throws Throwable {
	  driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]/img[1]")).clear();
	  Reporter.log("Executing pbanking test case",true);
	  Thread.sleep(3000);
  }
 
 

  @AfterTest
  public void afterTest() {
	  driver.close();
	  Reporter.log("Running precondition",true);
  }

}
