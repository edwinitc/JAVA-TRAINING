package auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class allprocess {
	public static void main(String[] args) throws InterruptedException {
		String path1 = "D:\\sw\\chrome driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver Driver = new ChromeDriver();
		Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Driver.get("file:///C:/Users/itctesting07/Desktop/PROJECT/loginpage.html");
		Thread.sleep(2500);
		Actions action = new Actions(Driver);
		WebElement movement = Driver.findElement(By.id("register"));
		action.moveToElement(movement);
		Thread.sleep(2500);
		action.click();
		Driver.navigate().to("file:///C:/Users/itctesting07/Desktop/PROJECT/REGISTERATION.html");
		Thread.sleep(2500);
		Driver.findElement(By.id("fname")).sendKeys("Edwin");
		Thread.sleep(2500);
		Driver.findElement(By.id("lname")).sendKeys("Victor");
		Thread.sleep(2500);
		WebElement radiobox = Driver.findElement(By.id("male"));
		Boolean isSelect=radiobox.isSelected();
		if(isSelect==false)
		{
			radiobox.click();
		}
		Thread.sleep(2500);
		Driver.findElement(By.id("mob")).sendKeys("1276879911");
		Driver.findElement(By.id("email")).sendKeys("edwin66@gmail.com");
		Driver.findElement(By.id("aadhar")).sendKeys("445422647879");
		Driver.findElement(By.id("username")).sendKeys("Edwinvic");
		Driver.findElement(By.id("password")).sendKeys("Edwinnn448");
		Driver.findElement(By.id("confirm-password")).sendKeys("Edwinnn448");
		WebElement chckbox = Driver.findElement(By.id("checkbox"));
		Boolean isselect =chckbox.isSelected();
		if(isselect==false)
		{
			chckbox.click();
		}
		Thread.sleep(2500);
		Driver.findElement(By.id("register")).click();
		Alert alert = Driver.switchTo().alert();
		alert.accept();
		Driver.navigate().to("file:///C:/Users/itctesting07/Desktop/PROJECT/loginpage.html");
		Thread.sleep(2500);
		Driver.findElement(By.className("username")).sendKeys("Edwinvic");
		Driver.findElement(By.id("password")).sendKeys("Edwinnn448");
		Thread.sleep(2500);
		Driver.findElement(By.id("login")).click();
		Driver.switchTo().alert();
		Alert alerts = Driver.switchTo().alert();
		alerts.accept();
		Driver.navigate().to("file:///C:/Users/itctesting07/Desktop/PROJECT/MAINPAGE.html");
		Thread.sleep(2500);
		Actions action1 = new Actions(Driver);
		WebElement movements = Driver.findElement(By.id("booking"));
		action1.moveToElement(movements);
		Thread.sleep(2500);
		action1.click();
		Driver.navigate().to("file:///C:/Users/itctesting07/Desktop/PROJECT/BOOKINGUSHA.html");
		Select action2 = new Select(Driver.findElement(By.id("input-group")));
		action2.selectByIndex(2);
		Select action3 = new Select(Driver.findElement(By.id("input-group1")));
		action3.selectByIndex(3);
		Select action4 = new Select(Driver.findElement(By.id("input-group2")));
		action4.selectByIndex(2);
		Select action5 = new Select(Driver.findElement(By.id("input-group3")));
		action5.selectByIndex(3);
		Select action6 = new Select(Driver.findElement(By.id("adult")));
		action6.selectByIndex(2);
		
		WebElement radioboxs = Driver.findElement(By.id("radio1"));
		Boolean isSelects=radioboxs.isSelected();
		if(isSelects==false)
		{
			radioboxs.click();
		}
		
		String cells = Driver.findElement(By.id("Arrival")).getText();
		WebElement arrival = Driver.findElement(By.xpath("//input[@id=\"Arrival\"]"));
		arrival.sendKeys("13072022");
		WebElement dep = Driver.findElement(By.xpath("//input[@id=\"Departure\"]"));
		dep.sendKeys("12072022");
		
		Driver.findElement(By.id("fname")).sendKeys("edwin");
		Driver.findElement(By.id("lname")).sendKeys("victor");
		WebElement dob = Driver.findElement(By.xpath("//input[@id=\"dob\"]"));
		dob.sendKeys("27022001");
		Driver.findElement(By.className("phone")).sendKeys("9020105663");
		Driver.findElement(By.className("email")).sendKeys("edwinviicc22@gmail.com");
		Thread.sleep(2500);
		Driver.findElement(By.id("sub")).click();
		Driver.navigate().to("file:///C:/Users/itctesting07/Desktop/PROJECT/last.html");
		Thread.sleep(2500);
		Driver.close();

}
}