package webs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class contact {
	public static void main(String[] args) throws InterruptedException {
		String path1 = "D:\\sw\\chrome driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver Driver = new ChromeDriver();
		Driver.get("file:///C:/Users/itctesting07/Desktop/PROJECT/mainpage.html");
	    Driver.findElement(By.linkText("CONTACT")).click();
	    Thread.sleep(1200);
	    Driver.close();
	    

}
}
