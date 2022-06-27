package seldemo;
import org.openqa.selenium.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Register {

	public static void main(String[] args) {
		String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver=new ChromeDriver();
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
		//driver.findElement(By.id("check")).click();
		WebElement checkBoxSelect=driver.findElement(By.id("check"));
		Boolean isSelect=checkBoxSelect.isSelected();
		if (isSelect==false)
		{
			checkBoxSelect.click();
		}
		driver.findElement(By.id("Reg")).click();
		driver.switchTo().alert();
		Alert alert=driver.switchTo().alert();
		//alert.ok();
		//driver.close();
	}

}
