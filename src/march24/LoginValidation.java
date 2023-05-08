package march24;

import java.io.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginValidation {

	public static void main(String[] args)throws Throwable {
		FileReader fr = new FileReader("E://Logindata.txt");
		BufferedReader br = new BufferedReader(fr);
		String str = "";
		while((str=br.readLine())!=null)
		{
			String login[] = str.split(";");
			WebDriver driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("http://orangehrm.qedgetech.com/");
			driver.findElement(By.cssSelector("#txtUsername")).sendKeys(login[0]);
			driver.findElement(By.cssSelector("#txtPassword")).sendKeys(login[1]);
			driver.findElement(By.cssSelector("#btnLogin")).click();
			String expected = "dashboard";
			String actual = driver.getCurrentUrl();
			if(actual.contains(expected))
			{
				System.out.println("Login Success::"+expected+"   "+actual);
			}
			else
			{
				String message = driver.findElement(By.cssSelector("#spanMessage")).getText();
				System.out.println("Login Fail::"+expected+"   "+actual);
			}
			driver.close();
			
		}
		
				}
		

	}


