package seldemo;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class loginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver drive=new ChromeDriver();
		drive.get("file:///D:/loginpage.html");
		drive.findElement(By.className("username")).sendKeys("Usharani55");
		drive.findElement(By.id("password")).sendKeys("Rani12345");
		//drive.findElement(By.className("btn btn-warning text-white")).click();
		//drive.close();
	}

}
