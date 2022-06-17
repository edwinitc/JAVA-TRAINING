 package selefri;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
public class king {
    public static void main(String[] args) {
    	//to do Auto-generated method stub
    	String path1="D:\\sw\\chrome driver\\chromedriver.exe";
    	System.setProperty("webdriver.chrome.driver",path1);
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://adactinhotelapp.com/");
    	driver.findElement(By.id("username")).sendKeys("edwinvictor");
    	driver.findElement(By.id("password")).sendKeys("eddie123@");
    	driver.findElement(By.id("login")).click();
    	Select dropDown = new Select(driver.findElement(By.id("location")));
    	dropDown.selectByIndex(3);
    	driver.close(); 
    }
}
