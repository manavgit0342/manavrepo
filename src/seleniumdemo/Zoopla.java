package seleniumdemo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;



public class Zoopla {
	String uname;
		public void add() throws IOException
	{
		FileInputStream fs=new FileInputStream("D:\\neha\\selenium\\testdata\\Login.xls");
        HSSFWorkbook w=new HSSFWorkbook(fs);
        HSSFSheet sheet =w.getSheet("Sheet1");
        System.out.println("total rows are:="+sheet.getLastRowNum());
        HSSFRow row= sheet.getRow(2);
        HSSFCell cell= row.getCell(1);
        uname=cell.getStringCellValue();
        System.out.println("username is:" +uname);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
         Zoopla Z=new Zoopla();
         Z.add();
	}

}
 