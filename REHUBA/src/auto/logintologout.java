package auto;

	import java.util.concurrent.TimeUnit;
    import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.*;
	import org.openqa.selenium.interactions.Actions;
	public class logintologout {
		public static void main(String[] args) {
			String path1 = "D:\\sw\\chrome driver\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path1);
			WebDriver Driver = new ChromeDriver();
			Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Driver.get("file:///C:/Users/itctesting07/Desktop/PROJECT/loginpage.html");
			Driver.findElement(By.className("username")).sendKeys("Edwinvic08");
			Driver.findElement(By.id("password")).sendKeys("edwin089");
			Driver.findElement(By.id("login")).click();
			Driver.switchTo().alert();
			Alert alert = Driver.switchTo().alert();
			alert.accept();
			Driver.navigate().to("file:///C:/Users/itctesting07/Desktop/PROJECT/MAINPAGE.html");
			Actions action = new Actions(Driver);
			WebElement movement = Driver.findElement(By.id("logout"));
			action.moveToElement(movement);
			action.click();
			action.perform();
			Driver.navigate().to("file:///C:/Users/itctesting07/Desktop/PROJECT/loginpage.html");
			Driver.close();
			
		}
		

	}


