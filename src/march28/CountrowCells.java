package march28;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CountrowCells {

	public static void main(String[] args)throws Throwable {
		// read path of excel file
		FileInputStream fi = new FileInputStream("F://Dummy.xlsx");
		// get wb from file
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		// get sheet from wb
		XSSFSheet ws = wb.getSheet("Login");
		// get first row from login sheet
		XSSFRow row = ws.getRow(0);
		// count no of rows in loginsheet
		int rc = ws.getLastRowNum();
		// count no of cells in row
		int cc = row.getLastCellNum();
		System.out.println("No of rows are::"+rc+"\n"+"No of Cells are::"+cc);
		fi.close();
		wb.close();
	}

}
