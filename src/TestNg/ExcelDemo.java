package TestNg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelDemo {
	String uname;

	public void getData() throws IOException {
		FileInputStream fs = new FileInputStream("TestData\\LoginData.xls");
		HSSFWorkbook wb = new HSSFWorkbook(fs);
		HSSFSheet sheet = wb.getSheet("Login");
		
		//To pick all the rows from Excel
		
		System.out.println("Total Rows are:"+sheet.getLastRowNum());
		HSSFRow row = sheet.getRow(2);
		HSSFCell cell = row.getCell(1);
		uname = cell.getStringCellValue();
		System.out.println("User name is:" + uname);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelDemo oo = new ExcelDemo();
		oo.getData();
	}

}
