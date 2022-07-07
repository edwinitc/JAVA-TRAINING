package auto;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.interactions.Actions;

public class autobooking {
	public static void main(String[] args) throws InterruptedException {
		String path1 = "D:\\sw\\chrome driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver Driver = new ChromeDriver();
		Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Driver.get("file:///C:/Users/itctesting07/Desktop/PROJECT/loginpage.html");
		Driver.findElement(By.className("username")).sendKeys("Edwinvic08");
		Driver.findElement(By.id("password")).sendKeys("Edwin089");
		Driver.findElement(By.id("login")).click();
		Driver.switchTo().alert();
		Alert alert = Driver.switchTo().alert();
		alert.accept();
		Driver.navigate().to("file:///C:/Users/itctesting07/Desktop/PROJECT/MAINPAGE.html");
		Actions action = new Actions(Driver);
		WebElement movement = Driver.findElement(By.id("booking"));
		action.moveToElement(movement);
		action.click();
		action.perform();
		Select action1 = new Select(Driver.findElement(By.id("input-group")));
		action1.selectByIndex(2);
		Select action2 = new Select(Driver.findElement(By.id("input-group1")));
		action2.selectByIndex(3);
		Select action3 = new Select(Driver.findElement(By.id("input-group2")));
		action3.selectByIndex(2);
		Select action4 = new Select(Driver.findElement(By.id("input-group3")));
		action4.selectByIndex(3);
		Select action5 = new Select(Driver.findElement(By.id("adult")));
		action5.selectByIndex(2);
		
		WebElement radiobox = Driver.findElement(By.id("radio1"));
		Boolean isSelect=radiobox.isSelected();
		if(isSelect==false)
		{
			radiobox.click();
		}
		
		String cells = Driver.findElement(By.id("Arrival")).getText();
		WebElement arrival = Driver.findElement(By.xpath("//input[@id=\"Arrival\"]"));
		arrival.sendKeys("13072022");
		WebElement dep = Driver.findElement(By.xpath("//input[@id=\"Departure\"]"));
		dep.sendKeys("12072022");
		Driver.findElement(By.id("fname")).sendKeys("edwin");
		Driver.findElement(By.id("lname")).sendKeys("victor");
		WebElement dob = Driver.findElement(By.xpath("//input[@id=\"dob\"]"));
		dob.sendKeys("27012001");
		Driver.findElement(By.className("email")).sendKeys("edwinviicc22@gmail.com");
		Driver.findElement(By.className("phone")).sendKeys("9020105663");
		Driver.findElement(By.id("sub")).click();
		Thread.sleep(2500);
		Driver.close();



	
		}
}
