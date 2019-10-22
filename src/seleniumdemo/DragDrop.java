
package seleniumdemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

 
public class DragDrop {
 
 public static void main(String[] agrs) throws InterruptedException{
 
	 String path;
	 path=System.getProperty("user.dir")+"\\Browser\\chromedriver.exe";
	 System.out.println(path);
	 System.setProperty("webdriver.chrome.driver",path);

 WebDriver driver = new ChromeDriver();
 driver.get("https://jqueryui.com");
 driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[1]/a")).click();

 Actions act=new Actions(driver);
 driver.switchTo().frame(0);
 act.clickAndHold(driver.findElement(By.id("draggable")))
 .moveToElement(driver.findElement(By.id("droppable")))
 .release().build().perform();
 }

 }

