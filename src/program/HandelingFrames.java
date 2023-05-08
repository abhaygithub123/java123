package program;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandelingFrames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		Actions ac = new Actions(driver);
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("No of frames are::"+frames.size());
		driver.switchTo().frame(0);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dst = driver.findElement(By.id("droppable"));
		ac.clickAndHold(src).moveToElement(dst).release().perform();
		if(dst.getText().contains("Dropped!"))
		{
			System.out.println("Drag and Drop Success");
		}
		else
		{
			System.out.println("Drag and Drop Fail");
		}
		driver.switchTo().defaultContent();
		ac.moveToElement(driver.findElement(By.linkText("Button"))).click().perform();
		driver.close();

	}

}
