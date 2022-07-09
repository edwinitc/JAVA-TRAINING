package auto;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.interactions.Actions;

public class logintoregis {
	public static void main(String[] args) throws InterruptedException {
		String path1 = "D:\\sw\\chrome driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver Driver = new ChromeDriver();
		Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Driver.get("file:///C:/Users/itctesting07/Desktop/PROJECT/loginpage.html");
		Actions action = new Actions(Driver);
		WebElement movement = Driver.findElement(By.id("register"));
		action.moveToElement(movement);
		action.click();
		Driver.navigate().to("file:///C:/Users/itctesting07/Desktop/PROJECT/REGISTERATION.html");
		Driver.findElement(By.id("fname")).sendKeys("Edwin");
		Driver.findElement(By.id("lname")).sendKeys("Victor");
		WebElement radiobox = Driver.findElement(By.id("male"));
		Boolean isSelect=radiobox.isSelected();
		if(isSelect==false)
		{
			radiobox.click();
		}
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
		Driver.findElement(By.id("register")).click();
		Alert alert = Driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2500);
		Driver.close();
		}
}




		