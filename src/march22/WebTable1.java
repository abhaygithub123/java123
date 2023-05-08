package march22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		String tabletext1 = driver.findElement(By.xpath("(//table[@id='customers']/tbody/tr[6]/td[1])")).getText();
		String tabletext2 = driver.findElement(By.xpath("(//table[@id='customers']/tbody/tr[6]/td[2])")).getText();
		String tabletext3 = driver.findElement(By.xpath("(//table[@id='customers']/tbody/tr[6]/td[3])")).getText();
		System.out.println(tabletext1+"\n"+tabletext2+"\n"+tabletext3);
		driver.close();
	}

}
