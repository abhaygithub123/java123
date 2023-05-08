package march16;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.name("//button[contains(text(),'OK')]")).click();
		driver.findElement(By.xpath("(//label[contains(text(),'FLIGHTS')])[2]")).click();
		driver.findElement(By.xpath("(//label[contains(text(),'HOTELS')])[2]")).click();
		driver.findElement(By.xpath("(//label[normalize-space()='RAIL DRISHTI'])[1]")).click();
		ArrayList<String> brw = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(brw);
		driver.switchTo().window(brw.get(3));
		driver.findElement(By.name("ltc")).click();
		driver.close();
		driver.switchTo().window(brw.get(2));
		String expectedtitle = "IRCTC Hotels";
		String actualtitle = driver.getTitle();
		if(expectedtitle.equalsIgnoreCase(actualtitle))
		{
			System.out.println("Title is Matching::"+expectedtitle+"   "+actualtitle);
		}
		else
		{
			System.out.println("Title is Not Matching::"+expectedtitle+"   "+actualtitle);
		}
		driver.close();
		driver.switchTo().window(brw.get(0));
		driver.findElement(By.xpath("//label[contains(text(),'Divyaang Concession')]")).click();
		String visibletext = driver.findElement(By.xpath("//span[contains(text(),'Specially abled availing the concession need to ca')]")).getText();
		System.out.println(visibletext);
		driver.findElement(By.xpath("//span[contains(text(),'OK')]")).click();
		driver.close();



	}

}
