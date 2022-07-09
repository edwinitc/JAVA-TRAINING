package Rehuba.Rehubaproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logindd {
	WebDriver driver;
 
  @BeforeMethod
  public void beforeMethod()  {
	        String path1 = "D:\\sw\\chrome driver\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path1);
		    driver = new ChromeDriver();
			driver.get("file:///C:/Users/itctesting07/Desktop/PROJECT/loginpage.html");
  }
  @Test(dataProvider = "getData")
  public void test(String username, String password) {
	  driver.findElement(By.className("username")).sendKeys(username);
	  driver.findElement(By.id("password")).sendKeys(password);
	  driver.findElement(By.id("login")).click();
  
  }
  
  
  
  @DataProvider
  public String[][] getData() throws Exception {
  File src=new File("D:\\sample\\login valid.xlsx");
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

 
  
  

 @AfterMethod
  public void aftermethod() {
	 driver.close();
 }
 
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Automation of login page started");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("automation of login page execution is finished");
  }

}
