package TestNg;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class HomeTest extends BeforeandAfterSuite{
	String expTitle ="facebook";
	@BeforeTest
	public void acc()
	{
		System.out.println("Home page Before Test");
	}
	@AfterTest
	public void acc1()
	{
		System.out.println("Home Page After TEST");
	}
@Test
public void HomePage()
{
	System.out.println("Home Page Check Title");
}
@Test
public void CheckImages()
{
	System.out.println("Home Page Check Images");
}
	@BeforeTest
	public void Before_Test()
	{
		System.out.println("Before Test");
	}

	@AfterTest
	public void After_Test()
	{
		System.out.println("After Test");
	}
	@BeforeClass
	public void Before_Class()
	{
		System.out.println("Before Class");
	}

	@AfterClass
	public void After_Class()
	{
		System.out.println("After Class");
	}
	@BeforeMethod
	public void Before_Method()
	{
		System.out.println("Before Method");
	}

	@AfterMethod

	public void After_Method()
	{
		System.out.println(" After Method");
	}


	@Test
public void CheckTitle()
{

	String title=driver.getTitle();
	if(expTitle.equals(title))
	{
		System.out.println("You are on correct Page");
	}
	else
	{
		System.out.println("You are not on Correct page");
	}
}
	@Test
	public void LoginTest()
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin");
		driver.findElement(By.id("loginbutton")).click();
		driver.navigate().back();
	}
	@Test
	public void CheckImages1()
	{
		//By tag name
		List<WebElement> al=driver.findElements(By.tagName("img"));

		System.out.println(al.size());
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i).getAttribute("src"));
			//System.out.println(al.get(i).getText());
		}
	}
	}