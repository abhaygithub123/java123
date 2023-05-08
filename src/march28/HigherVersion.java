package march28;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HigherVersion {

	public static void main(String[] args)throws Throwable {
		FileInputStream fi = new FileInputStream("F://Dummy.xlsx");
		// get workbook
		Workbook wb = WorkbookFactory.create(fi);
		Sheet ws = wb.getSheet("Login");
		int rc = ws.getLastRowNum();
		for(int i =1;i<=rc;i++)
		{
			String username = ws.getRow(i).getCell(0).getStringCellValue();
			String password = ws.getRow(i).getCell(1).getStringCellValue();
			System.out.println(username+"  "+password);
			ws.getRow(i).createCell(2).setCellValue("Pass");
		}
		fi.close();
		FileOutputStream fo = new FileOutputStream("F://HigherResults.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();

	}

}
