package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgdemo {
	String msg = "Welcome Admin";
	String path;
@Test 
public void launch()
{
	


	path=System.getProperty("user.dir")+"\\browser\\chromedriver.exe";
	System.out.println(path);
	System.setProperty("webdriver.chrome.driver",path);
	WebDriver drive =new ChromeDriver();
    drive.get("https://opensource-demo.orangehrmlive.com/");
    drive.findElement(By.id("txtUsername")).sendKeys("Admin");
	drive.findElement(By.id("txtPassword")).sendKeys("admin123");
	drive.findElement(By.id("btnLogin")).click();
	
}
@Test
public void launch1()
{
	path=System.getProperty("user.dir")+"\\browser\\chromedriver.exe";
	System.out.println(path);
	System.setProperty("webdriver.chrome.driver",path);
	WebDriver drive =new ChromeDriver();
    drive.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
    drive.findElement(By.xpath("//*[@id=\"forgotPasswordLink\"]/a")).click();
    drive.findElement(By.id("securityAuthentication_userName")).sendKeys("Admin");
    drive.findElement(By.id("btnSearchValues")).click();
	
}
@Test
public void launch2()
{
	path=System.getProperty("user.dir")+"\\browser\\chromedriver.exe";
	System.out.println(path);
	System.setProperty("webdriver.chrome.driver",path);
	WebDriver drive =new ChromeDriver();
    drive.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
    drive.findElement(By.id("txtUsername")).sendKeys("Admin");
	drive.findElement(By.id("txtPassword")).sendKeys("admin123");
	drive.findElement(By.id("btnLogin")).click();
	drive.findElement(By.className("panelTrigger"));
	  if (msg.contains("Welcome Admin")) 
	  {
          System.out.println("You are on correct page");
      } else {
          System.out.println("Not landing on correct page");
      }
}
}