package march28;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CellData {

	public static void main(String[] args)throws Throwable {
		// read path of excel file
		FileInputStream fi = new FileInputStream("F://Dummy.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheetAt(0);
		XSSFRow row = ws.getRow(0);
		int rc = ws.getLastRowNum();
		int cc = row.getLastCellNum();
		System.out.println(rc+"  "+cc);
		for(int i=1;i<rc;i++){
		String username = ws.getRow(0).getCell(1).getStringCellValue();
		String password = ws.getRow(1).getCell(1).getStringCellValue();
		System.out.println(username+"  "+password);
		}
		
	}
}

