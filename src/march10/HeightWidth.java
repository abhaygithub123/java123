package march10;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import Apputil1.BrowsersHelpers1;

public class HeightWidth extends BrowsersHelpers1 {

	public static void main(String[] args) throws Throwable {
		BrowsersHelpers1.ChromeHelper("https://facebook.com");
		// store textbox into webelement
		WebElement emailTextbox = driver.findElement(By.name("email"));
		Dimension dim = emailTextbox.getSize();
		System.out.println(dim.getHeight()+"   "+dim.getWidth());
		WebElement creataccount = driver.findElement(By.linkText("Create New Account"));
		Dimension dim1 = creataccount.getSize();
		System.out.println(dim1.getHeight()+"   "+dim.getWidth());
		driver.close();
}
	}
