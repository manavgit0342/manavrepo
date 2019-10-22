package seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElements{
public static void main (String [] args) throws InterruptedException{
	String path;
	path=System.getProperty("user.dir")+"\\Browser\\chromedriver.exe";
	System.out.println(path);
	System.setProperty("webdriver.chrome.driver",path);

	
	
	// Open browser
WebDriver driver = new ChromeDriver();
// To maximize the window

// Open Application
driver.get("https://www.zoopla.co.uk/");
// Get text of a particular link
String FindElement = driver.findElement(By.xpath("//*[@id=\"forsale_price_max\"]")).getText();
// Print the value of the link
System.out.println(FindElement);
// Click on the link
driver.findElement(By.xpath("//*[@id=\"forsale_price_max\"]")).click();


	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("https://www.zoopla.co.uk");
	 driver.navigate().refresh();
	 //Once you got the select object initialised then you can access all the methods of select class. 
	 //Identify the select HTML element:
	 Thread.sleep(10000);
	 WebElement mySelectElement = driver.findElement(By.name("dropdown"));
	 Select dropdown= new Select(mySelectElement);
	 //To select an option - selectByVisibleText, selectByIndex, selectByValue
	 //selectByVisibleText
	 dropdown.selectByVisibleText("Max price");
	 dropdown.selectByValue("    £10,000");}
}
