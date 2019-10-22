import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;



public class Exceldemo {
String uname;
public void excel() throws IOException{

FileInputStream fs=new FileInputStream("D:\\neha\\selenium\\testdata\\Login.xls");
HSSFWorkbook wb=new HSSFWorkbook(fs);
HSSFSheet sheet=wb.getSheet("Sheet1");
System.out.println(sheet.getLastRowNum());
HSSFRow row=sheet.getRow(2);
HSSFCell cell=row.getCell(1);
uname= cell.getStringCellValue();
System.out.println(uname);
}
public static void main(String[] args) throws IOException 
{
// TODO Auto-generated method stub
Exceldemo ex=new Exceldemo();
ex.excel();
}
}