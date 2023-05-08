package march21;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]")).click();
		driver.findElement(By.xpath("//form[@name='reg']//following::input[2]")).sendKeys("testdata");
		driver.findElement(By.xpath("//form[@name='reg']//following::input[3]")).sendKeys("selenium");
		driver.findElement(By.xpath("//form[@name='reg']//following::input[4]")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//form[@name='reg']//following::input[5]")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//form[@name='reg']//following::input[6]")).sendKeys("123456");
		new Select(driver.findElement(By.xpath("//form[@name='reg']//following::select[1]"))).selectByIndex(30);
		new Select(driver.findElement(By.xpath("//form[@name='reg']//following::select[2]"))).selectByVisibleText("Jun");
		new Select(driver.findElement(By.xpath("//form[@name='reg']//following::select[3]"))).selectByVisibleText("1975");
		driver.findElement(By.xpath("//form[@name='reg']//following::input[10]")).click();
		driver.findElement(By.xpath("//form[@name='reg']//following::button[1]")).click();
	}

}
