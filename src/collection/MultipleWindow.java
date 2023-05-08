package collection;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();;
		driver.findElement(By.xpath("(//label[contains(text(),'FLIGHTS')])[2]")).click();
		driver.findElement(By.xpath("(//label[contains(text(),'HOTELS')])[2]")).click();
		driver.findElement(By.xpath("(//label[normalize-space()='RAIL DRISHTI'])[1]")).click();
		ArrayList<String>brw = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(brw);
		driver.switchTo().window(brw.get(3));
		driver.findElement(By.name("Itc")).click();
		driver.close();
		driver.switchTo().window(brw.get(2));
		String expected = "IRCTC Hotels";
		String actual = driver.getTitle();
		if(expected.equalsIgnoreCase(actual))
		{
			System.out.println("Title is Matching::"+expected+"  "+actual);
		}
		else
		{
			System.out.println("Title is Not Matching::"+expected+"  "+actual);
		}
		driver.close();
		

	}

}
