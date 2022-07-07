package auto;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
public class loginpage {
	public static void main(String[] args) {
		String path1 = "D:\\sw\\chrome driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver Driver = new ChromeDriver();
		Driver.get("file:///C:/Users/itctesting07/Desktop/PROJECT/loginpage.html");
		Driver.findElement(By.className("username")).sendKeys("Edwinvic08");
		Driver.findElement(By.id("password")).sendKeys("edwin089");
		Driver.findElement(By.id("login")).click();
		Driver.switchTo().alert();
		Alert alert = Driver.switchTo().alert();
		alert.accept();
		Driver.navigate().to("file:///C:/Users/itctesting07/Desktop/PROJECT/MAINPAGE.html");
		Driver.close();
	}
	

}
