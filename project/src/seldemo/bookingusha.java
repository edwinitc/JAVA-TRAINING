package seldemo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;


public class bookingusha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver drv=new ChromeDriver();
		//drv.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Wait w=new FluentWait(drv).withTimeout(40,TimeUnit.SECONDS);
		drv.get("file:///D:/bookingusha.html");
		Select dp1=new Select(drv.findElement(By.id("input-group")));
		dp1.selectByIndex(2);
		Select dp2=new Select(drv.findElement(By.id("input-group1")));
		dp2.selectByIndex(3);
		Select dp3=new Select(drv.findElement(By.id("input-group2")));
		dp3.selectByIndex(2);
		Select dp4=new Select(drv.findElement(By.id("input-group3")));
		dp4.selectByIndex(3);
		Select dp5=new Select(drv.findElement(By.id("adult")));
		dp5.selectByIndex(10);
		
		WebElement radioBoxSelect=drv.findElement(By.id("radio1"));
		Boolean isSelect=radioBoxSelect.isSelected();
		if (isSelect==false)
		{
			radioBoxSelect.click();
		}
		
		String cellvalue=drv.findElement(By.id("Arrival")).getText();
		WebElement arrival=drv.findElement(By.xpath("//input[@id=\"Arrival\"]"));
		arrival.sendKeys("12022022");
		WebElement departure=drv.findElement(By.xpath("//input[@id=\"Departure\"]"));
		departure.sendKeys("27022022");
		WebElement dob1=drv.findElement(By.xpath("//input[@id=\"dob\"]"));
		dob1.sendKeys("19091999");
		
		drv.findElement(By.id("fname")).sendKeys("Usharani");
		drv.findElement(By.id("lname")).sendKeys("Kavadi");
		drv.findElement(By.className("phone")).sendKeys("9160201736");
		drv.findElement(By.className("email")).sendKeys("usha@gmail.com");
		drv.findElement(By.id("sub")).click();
		
		//drv.findElement(By.id("check")).click();
	}

}
