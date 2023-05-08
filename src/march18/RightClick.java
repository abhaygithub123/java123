package march18;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("Gmail"))).click().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		ArrayList<String> brw = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(brw.get(1));
		driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
		driver.switchTo().window(brw.get(0));
		driver.close();
		driver.findElement(By.linkText("Images")).click();
		driver.close();

	}

	
}
