package seldemo;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("usharanikavadi123");
		driver.findElement(By.id("password")).sendKeys("Usha@123");
		driver.findElement(By.id("login")).click();
		Select dropDown=new Select(driver.findElement(By.id("location")));
		dropDown.selectByIndex(3);
		driver.get("file:///C:/Users/itctesting10/Desktop/Airlines/Booking%20form3.html");
		Select d1=new Select(driver.findElement(By.id("input-group")));
		d1.selectByIndex(4);
		//Select d1=new Select(driver.findElement(By.id("input-group")));
		//d1.selectByIndex(4);
		driver.get("file:///D:/Register.html");
		Select d2=new Select(driver.findElement(By.id("input-group")));
		d1.selectByIndex(4);
		
		driver.close();
		
		

	}

}
