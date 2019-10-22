package DataDriven;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_DrivenTest 
{
	@Test(dataProvider="empdata")
	public void PostNewEmployee(String Email,String password)
	{
		
		System.out.println("email is:"+Email);
		System.out.println("pass is:"+password);
	}

	@DataProvider(name="empdata")
	public Object[][] readData() {
		//Read data from xls Sheet
		//get the access Excel Sheet
		String sheetpath = System.getProperty("user.dir")+"\\src\\DataDriven\\empdata.xls";
		Xls_Reader xlr = new Xls_Reader(sheetpath ); 
		
		//Count Row
		int rowCount = xlr.getRowCount("Sheet1");//3
		System.out.println(rowCount);
		//Count Col
		int colCount = xlr.getColumnCount("Sheet1");//2
		Object[][] arr = new Object[rowCount-1][colCount];//2 2
		
		int ci=0;
		for(int i=2; i<=rowCount;i++,ci++) {
			//i=2
			int cj=0;
			for(int j=0;j<colCount;j++,cj++) {
				//j=0
				arr[ci][cj] = xlr.getCellData("Sheet1", j, i);//admin..admin
				//System.out.println(arr[ci][cj]);
			}
		}
		return arr;
		
	}
}
