package march29;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Arithmatic {

	public static void main(String[] args)throws Throwable {
		// read path of excel file
		FileInputStream fi = new FileInputStream("F://Calculation.xlsx");
		//  get wb from excel
		Workbook wb = WorkbookFactory.create(fi);
		//  get sheet from wb
		Sheet ws = wb.getSheet("finance");
		int rc = ws.getLastRowNum();
		System.out.println("No of Rows are::"+rc);
		for(int i = 1;i<=rc;i++)
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("https://www.calculator.net/percent-calculator.html");
			if(wb.getSheet("finance").getRow(i).getCell(0).getCellType()==Cell.CELL_TYPE_NUMERIC)
			{
				int celldata1 = (int)wb.getSheet("finance").getRow(i).getCell(0).getNumericCellValue();
				String percentage = String.valueOf(celldata1);
				if(wb.getSheet("finance").getRow(i).getCell(1).getCellType()==Cell.CELL_TYPE_NUMERIC)
				{
					int celldata2 = (int)wb.getSheet("finance").getRow(i).getCell(1).getNumericCellValue();
					String amount = String.valueOf(celldata2);
					driver.findElement(By.name("cpar1")).sendKeys(percentage);
					driver.findElement(By.name("cpar2")).sendKeys(percentage);
					driver.findElement(By.name("(//input[@value='Calculate'])[1]")).click();
					String message = driver.findElement(By.xpath("(//p[@class='verybigtext'])[1]")).getText();
					ws.getRow(i).createCell(2).setCellValue(message);

				}
			}
			driver.close();	
		}
		fi.close();
		FileOutputStream fo = new FileOutputStream("F://CalculationResults.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();
	}

}
