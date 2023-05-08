package march10;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import Apputil.BrowsersHealpers;

public class LocationOfElement extends BrowsersHealpers
{
 
	public static void main(String[] args)throws Throwable {
		BrowsersHealpers.ChromeHelper("http://primusbank.qedgetech.com/");
		WebElement username = driver.findElement(By.name("txtuId"));
		Point p = username.getLocation();
		System.out.println(p.getX()+"  "+p.getY());
		driver.close();
		}
        }
