package rehubaTestcases;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class testcases {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Execution starts");
	}

	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {
		
		String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		driver=new ChromeDriver();
	}
	@Test
	public void reg()
	{
		System.out.println("Enter valid data to Register in Rehuba Airlines");
		driver.get("file:///D:/Register.html");
		driver.findElement(By.id("ph")).sendKeys("Usharani");
		driver.findElement(By.id("ph1")).sendKeys("Kavadi");
		Select dropDown=new Select(driver.findElement(By.id("opt")));
		dropDown.selectByIndex(2);
		Select d1=new Select(driver.findElement(By.id("opt1")));
		d1.selectByIndex(1);
		driver.findElement(By.id("ph2")).sendKeys("9160201736");
		driver.findElement(By.id("ph3")).sendKeys("usha@gmail.com");
		driver.findElement(By.id("ph4")).sendKeys("911203655272");
		driver.findElement(By.id("ph5")).sendKeys("Usharani12");
		driver.findElement(By.id("pass")).sendKeys("Usha12345");
		driver.findElement(By.id("check")).click();
		driver.findElement(By.id("Reg")).click();
		driver.switchTo().alert();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		//driver.switchTo().alert();
		Alert alert1=driver.switchTo().alert();
		alert1.accept();
		//driver.switchTo().alert();
		Alert alert2=driver.switchTo().alert();
		alert2.accept();
	}
	@Test
	public void login()
	{ 
		System.out.println("login to Rehuba Airlines");
		driver.get("file:///D:/loginpage.html");
		driver.findElement(By.className("username")).sendKeys("Usharani55");
		driver.findElement(By.id("password")).sendKeys("Rani12345");
	}
	@Test
	public void booking()
	{
		System.out.println("Fill the Rehuba Airlines Booking form");
		//drv.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Wait w=new FluentWait(drv).withTimeout(40,TimeUnit.SECONDS);
		driver.get("file:///D:/bookingusha.html");
		Select dp1=new Select(driver.findElement(By.id("input-group")));
		dp1.selectByIndex(2);
		Select dp2=new Select(driver.findElement(By.id("input-group1")));
		dp2.selectByIndex(3);
		Select dp3=new Select(driver.findElement(By.id("input-group2")));
		dp3.selectByIndex(2);
		Select dp4=new Select(driver.findElement(By.id("input-group3")));
		dp4.selectByIndex(3);
		Select dp5=new Select(driver.findElement(By.id("adult")));
		dp5.selectByIndex(10);
		//String cellval=driver.findElement(By.id("Arrival")).getText();
		WebElement arrival=driver.findElement(By.xpath("//input[@id=\"Arrival\"]"));
		arrival.sendKeys("12022022");
		WebElement departure=driver.findElement(By.xpath("//input[@id=\"Departure\"]"));
		departure.sendKeys("27022022");
		WebElement dob1=driver.findElement(By.xpath("//input[@id=\"dob\"]"));
		dob1.sendKeys("19091999");

		WebElement radioBoxSelect=driver.findElement(By.id("radio1"));
		Boolean isSelect=radioBoxSelect.isSelected();
		if (isSelect==false)
		{
			radioBoxSelect.click();
		}

		String cellvalue=driver.findElement(By.id("Arrival")).getText();
        driver.findElement(By.id("fname")).sendKeys("Usharani");
		driver.findElement(By.id("lname")).sendKeys("Kavadi");
		driver.findElement(By.className("phone")).sendKeys("9160201736");
		driver.findElement(By.className("email")).sendKeys("usha@gmail.com");
		driver.findElement(By.id("sub")).click();

		//drv.findElement(By.id("check")).click();
	}

	@AfterMethod
	public void afterMethod() {
		//driver.close();
     }
	@AfterClass
	public void afterClass() {
		System.out.println("Execution is completed");
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] {
			new Object[] { 1, "a" },
			new Object[] { 2, "b" },
		};
	}
	

	

	@BeforeTest
	public void beforeTest() {
		System.out.println("Test with valid data");  }

	@AfterTest
	public void afterTest() {
		System.out.println("After test");

	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}

}
