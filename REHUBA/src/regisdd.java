package Rehuba.Rehubaproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
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

public class regisdd {
	WebDriver driver;
  @Test(dataProvider = "getData")
  public void registeration(String fname,String lname,String mbl,String mail,String Aadhar,String user,String pass,String conpass)
  {
  driver.findElement(By.id("fname")).sendKeys(fname);
  driver.findElement(By.id("lname")).sendKeys(lname);
  WebElement radio=driver.findElement(By.id("male"));
  radio.click();
  driver.findElement(By.id("mob")).sendKeys(mbl);
  driver.findElement(By.id("email")).sendKeys(mail);
  driver.findElement(By.id("aadhar")).sendKeys(Aadhar);
  Select dropDown=new Select(driver.findElement(By.id("country")));
  dropDown.selectByIndex(4);
  driver.findElement(By.id("username")).sendKeys(user);
  driver.findElement(By.id("password")).sendKeys(pass);
  driver.findElement(By.id("confirm-password")).sendKeys(conpass);
  WebElement checkBoxSelect=driver.findElement(By.id("checkbox"));
  Boolean isSelect=checkBoxSelect.isSelected();
  if (isSelect==false)
  {
  checkBoxSelect.click();
  }
  //Alert alert=driver.switchTo().alert();
  //alert.accept();
  driver.findElement(By.id("register")).click();
    }
  public void f(Integer n, String s) {
  }
  @BeforeMethod
  public void beforeMethod() {
  			String path1 = "D:\\sw\\chrome driver\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path1);
		    driver = new ChromeDriver();
			driver.get("file:///C:/Users/itctesting07/Desktop/PROJECT/REGISTERATION.html");
			
			
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }


  @DataProvider
  public String[][] getData() throws Exception {
  File src=new File("D:\\sample\\RegData.xlsx");
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

  }

