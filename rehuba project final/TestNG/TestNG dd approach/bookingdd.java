package Rehuba.Rehubaproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;


import org.testng.annotations.Test;
public class bookingdd {
	WebDriver driver;
	
  @Test(dataProvider="getData")
  public void booking(String fname,String lname,String mbl,String mail)
  {
	  driver.findElement(By.id("fname")).sendKeys(fname);
	  driver.findElement(By.id("lname")).sendKeys(lname);
	  driver.findElement(By.className("phone")).sendKeys(mbl);
	  driver.findElement(By.className("email")).sendKeys(mail);
	  driver.findElement(By.id("sub")).click();

  }


  
  @BeforeMethod
  public void beforeMethod() {
	  String path1 = "D:\\sw\\chrome driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
	    driver = new ChromeDriver();
		driver.get("file:///C:/Users/itctesting07/Desktop/PROJECT/loginpage.html");
		System.out.println("Fill the Rehuba Airlines Booking form");
		//drv.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/itctesting07/Desktop/PROJECT/bookingusha.html");
		Select dp1=new Select(driver.findElement(By.id("input-group")));
		dp1.selectByIndex(2);
		Select dp2=new Select(driver.findElement(By.id("input-group1")));
		dp2.selectByIndex(3);
		Select dp3=new Select(driver.findElement(By.id("input-group2")));
		dp3.selectByIndex(2);
		Select dp4=new Select(driver.findElement(By.id("input-group3")));
		dp4.selectByIndex(3);
		Select dp5=new Select(driver.findElement(By.id("adult")));
		dp5.selectByIndex(3);
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
		
  }


  @DataProvider
  public String[][] getData() throws Exception {
  File src=new File("D:\\sample\\Bookingpage1.xlsx");
  FileInputStream fis=new FileInputStream(src);
  XSSFWorkbook wb=new XSSFWorkbook(fis);
  XSSFSheet sheet=wb.getSheet("Sheet1");
  int Rows=sheet.getPhysicalNumberOfRows();
  int cols=sheet.getRow(0).getLastCellNum();

  String[][] data=new String[Rows-1][cols];
  for(int i=0;i<Rows-1;i++)
  {
  for(int j=0;j<cols;j++)
  {
  DataFormatter df=new DataFormatter();
  data[i][j]= df.formatCellValue(sheet.getRow(i+1).getCell(j));

  }
  System.out.println();
  }
  wb.close();
  fis.close();
  return data;

  }
 
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Automation of booking page is started");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Automation of booking page execution is completed");
	  driver.quit();

  }

}
