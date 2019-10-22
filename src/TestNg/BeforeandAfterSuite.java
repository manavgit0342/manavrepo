package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BeforeandAfterSuite {
	String path;
	public static WebDriver driver;
@BeforeSuite
public void launch()
{
	path=System.getProperty("user.dir")+"\\browser\\chromedriver.exe";
	System.out.println(path);
	System.setProperty("webdriver.chrome.driver",path);
	driver =new ChromeDriver();

driver.navigate().to("http://www.facebook.com");
}
@AfterSuite
public void close()
{
	driver.close();
}
}
