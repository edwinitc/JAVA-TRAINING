package Rehuba.Rehubaproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class mainpage {
	WebDriver Driver;
  @Test
  public void testmain() throws InterruptedException {
		Driver.get("file:///C:/Users/itctesting07/Desktop/PROJECT/mainpage.html");  
	    Driver.findElement(By.linkText("ABOUT US")).click();
		Thread.sleep(1500);
		Driver.findElement(By.id("click1")).click();
		Driver.findElement(By.linkText("BOOKING")).click();
		Thread.sleep(1500);
		Driver.findElement(By.id("click2")).click();
		Driver.findElement(By.linkText("CONTACT")).click();
		Thread.sleep(1500);
		Driver.findElement(By.id("click")).click();
		Driver.findElement(By.linkText("LOGOUT"));
		Thread.sleep(1500);
		
  }
  @BeforeMethod
  public void beforeMethod() {
	  String path1 = "D:\\sw\\chrome driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
	    Driver = new ChromeDriver();
		Driver.get("file:///C:/Users/itctesting07/Desktop/PROJECT/mainpage.html");  
  }

  @AfterMethod
  public void afterMethod() {
	  Driver.close();
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("execution started");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("execution concluded");
  }

}
