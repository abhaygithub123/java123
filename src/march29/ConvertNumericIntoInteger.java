package march29;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ConvertNumericIntoInteger {

	public static void main(String[] args)throws Throwable {
		FileInputStream fi = new FileInputStream("F://Dummy1.xlsx");
		// get workbook
		Workbook wb = WorkbookFactory.create(fi);
		Sheet ws = wb.getSheet("Login");
		int rc = ws.getLastRowNum();
		for(int i =1;i<=rc;i++)
		{
			String username = ws.getRow(i).getCell(0).getStringCellValue();
			if(wb.getSheet("Login").getRow(i).getCell(1).getCellType()==Cell.CELL_TYPE_NUMERIC);
			{
			int celldata =(int)ws.getRow(i).getCell(1).getNumericCellValue();
			// convert integer type into string
			String password = String.valueOf(celldata);
			System.out.println(username+"  "+password);
			ws.getRow(i).createCell(2).setCellValue("Pass");
		}
		fi.close();
		FileOutputStream fo = new FileOutputStream("F://Results1.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();
	}

	}
}

