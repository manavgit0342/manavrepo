package seleniumdemo;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingDemo {




public static void main(String[] args)
{
	String path;
path=System.getProperty("user.dir")+"\\Browser\\chromedriver.exe";
System.out.println(path);
System.setProperty("webdriver.chrome.driver",path);

WebDriver driver=new ChromeDriver();

driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");

// driver.findElement(By.linkText("Good PopUp #3")).click();

Set<String> handler=driver.getWindowHandles();
Iterator<String> it=handler.iterator();

String parentid=it.next();
System.out.println("Parent Window Id"+parentid);

String childid=it.next();
System.out.println("Child Window Id"+childid);

//now  we need to switch to open child window with title and close

driver.switchTo().window(childid);
String childTitle=driver.getTitle();
System.out.println("Child Window is:"+childTitle);
driver.close();


driver.switchTo().window(parentid);

driver.close();



}

}
