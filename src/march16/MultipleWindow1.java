package march16;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://gmail.com");
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		Set<String> allwins = driver.getWindowHandles();
		System.out.println(allwins);
		for(String each : allwins)
		{
			if(!parent.equals(each))
			{
				String pagetitle = driver.switchTo().window(each).getTitle();
				System.out.println(pagetitle);
				driver.close();
			}
				
		}
		driver.switchTo().window(parent);
		driver.findElement(By.name("identifier")).sendKeys("abhaybhatnate30@gmail.com");
		driver.close();

	}

}
