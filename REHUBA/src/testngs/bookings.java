package testngs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.Assert;

public class bookings {
	
	WebDriver Driver;
	
 @BeforeClass
     public void bc() {
	 System.out.println("Imported required annotations");
	 System.out.println("execution starts");
 }
 @AfterClass
     public void ac() {
	 System.out.println("execution concluded");
 }
     
	
 @BeforeMethod
	  public void beforeMethods() {
	    String path1 = "D:\\sw\\chrome driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
	    Driver = new ChromeDriver();
		Driver.get("file:///C:/Users/itctesting07/Desktop/PROJECT/loginpage.html");
		
	  }
 @Test
 public void bk13() throws Exception{
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
	Select country = new Select(Driver.findElement(By.id("country")));
	country.selectByIndex(2);
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
	Driver.switchTo().alert();
	Alert alert = Driver.switchTo().alert();
	alert.accept();
	String expectedurl = "file:///C:/Users/itctesting07/Desktop/PROJECT/loginpage.html";
	String newurl = Driver.getCurrentUrl();
	Assert.assertNotEquals(expectedurl, newurl);
	}
 @Test
 public void bk12() throws Exception{
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
	Select country = new Select(Driver.findElement(By.id("country")));
	country.selectByIndex(2);
	Driver.findElement(By.id("username")).sendKeys("Edwinvic");
	Driver.findElement(By.id("password")).sendKeys("Edwinnn448");
	Driver.findElement(By.id("confirm-password")).sendKeys("Edwinnn448");
	WebElement chckbox = Driver.findElement(By.id("checkbox"));
	Boolean isselect =chckbox.isSelected();
	if(isselect==true)
	{
		chckbox.click();
	}
	Driver.findElement(By.id("register")).click();
	}
 @Test
 public void bk11() throws Exception{
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
	Select country = new Select(Driver.findElement(By.id("country")));
	country.selectByIndex(2);
	Driver.findElement(By.id("username")).sendKeys("Edwinvic");
	Driver.findElement(By.id("password")).sendKeys("Edwinnn448");
	Driver.findElement(By.id("confirm-password")).sendKeys("Edwinnn44");
	WebElement chckbox = Driver.findElement(By.id("checkbox"));
	Boolean isselect =chckbox.isSelected();
	if(isselect==false)
	{
		chckbox.click();
	}
	Driver.findElement(By.id("register")).click();
	Driver.switchTo().alert();
	Alert alert = Driver.switchTo().alert();
	alert.accept();
	String expectedurl = "file:///C:/Users/itctesting07/Desktop/PROJECT/loginpage.html";
	String newurl = Driver.getCurrentUrl();
	Assert.assertNotEquals(expectedurl, newurl);
	}
 @Test
 public void bk10() throws Exception{
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
	Select country = new Select(Driver.findElement(By.id("country")));
	country.selectByIndex(2);
	Driver.findElement(By.id("username")).sendKeys("Edwinvic");
	Driver.findElement(By.id("password")).sendKeys("edwinnn448");
	Driver.findElement(By.id("confirm-password")).sendKeys("edwinnn448");
	WebElement chckbox = Driver.findElement(By.id("checkbox"));
	Boolean isselect =chckbox.isSelected();
	if(isselect==false)
	{
		chckbox.click();
	}
	Driver.findElement(By.id("register")).click();
	}
 @Test
 public void bk9() throws Exception{
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
	Select country = new Select(Driver.findElement(By.id("country")));
	country.selectByIndex(2);
	Driver.findElement(By.id("username")).sendKeys("edwinvic");
	Driver.findElement(By.id("password")).sendKeys("Edwinnn448");
	Driver.findElement(By.id("confirm-password")).sendKeys("Edwinnn448");
	WebElement chckbox = Driver.findElement(By.id("checkbox"));
	Boolean isselect =chckbox.isSelected();
	if(isselect==false)
	{
		chckbox.click();
	}
	Driver.findElement(By.id("register")).click();
	}

 @Test
 public void bk8() throws Exception{
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
	Driver.findElement(By.id("aadhar")).sendKeys("44542264787");
	Select country = new Select(Driver.findElement(By.id("country")));
	country.selectByIndex(2);
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
	}
 @Test
 public void bk7() throws Exception{
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
	Driver.findElement(By.id("email")).sendKeys("edwin66gmail.com");
	Driver.findElement(By.id("aadhar")).sendKeys("445422647879");
	Select country = new Select(Driver.findElement(By.id("country")));
	country.selectByIndex(2);
	Driver.findElement(By.id("username")).sendKeys("edwinvic");
	Driver.findElement(By.id("password")).sendKeys("Edwinnn448");
	Driver.findElement(By.id("confirm-password")).sendKeys("Edwinnn448");
	WebElement chckbox = Driver.findElement(By.id("checkbox"));
	Boolean isselect =chckbox.isSelected();
	if(isselect==false)
	{
		chckbox.click();
	}
	Driver.findElement(By.id("register")).click();
	}
 
    @Test
     public void bk6() throws Exception{
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
		Driver.findElement(By.id("mob")).sendKeys("127687991");
		Driver.findElement(By.id("email")).sendKeys("edwin66@gmail.com");
		Driver.findElement(By.id("aadhar")).sendKeys("445422647879");
		Select country = new Select(Driver.findElement(By.id("country")));
		country.selectByIndex(2);
		Driver.findElement(By.id("username")).sendKeys("edwinvic");
		Driver.findElement(By.id("password")).sendKeys("Edwinnn448");
		Driver.findElement(By.id("confirm-password")).sendKeys("Edwinnn448");
		WebElement chckbox = Driver.findElement(By.id("checkbox"));
		Boolean isselect =chckbox.isSelected();
		if(isselect==false)
		{
			chckbox.click();
		}
		Driver.findElement(By.id("register")).click();
		}
    @Test
     public void bk5() throws Exception{
	    Driver.get("file:///C:/Users/itctesting07/Desktop/PROJECT/loginpage.html");
		Actions action = new Actions(Driver);
		WebElement movement = Driver.findElement(By.id("register"));
		action.moveToElement(movement);
		action.click();
		Driver.navigate().to("file:///C:/Users/itctesting07/Desktop/PROJECT/REGISTERATION.html");
		Driver.findElement(By.id("fname")).sendKeys("Edwin");
		Driver.findElement(By.id("lname")).sendKeys("victor");
		WebElement radiobox = Driver.findElement(By.id("male"));
		Boolean isSelect=radiobox.isSelected();
		if(isSelect==false)
		{
			radiobox.click();
		}
		Driver.findElement(By.id("mob")).sendKeys("1276879911");
		Driver.findElement(By.id("email")).sendKeys("edwin66@gmail.com");
		Driver.findElement(By.id("aadhar")).sendKeys("445422647879");
		Select country = new Select(Driver.findElement(By.id("country")));
		country.selectByIndex(2);
		Driver.findElement(By.id("username")).sendKeys("edwinvic");
		Driver.findElement(By.id("password")).sendKeys("Edwinnn448");
		Driver.findElement(By.id("confirm-password")).sendKeys("Edwinnn448");
		WebElement chckbox = Driver.findElement(By.id("checkbox"));
		Boolean isselect =chckbox.isSelected();
		if(isselect==false)
		{
			chckbox.click();
		}
		Driver.findElement(By.id("register")).click();
		}

    @Test
     public void bk3() throws Exception{
	    Driver.findElement(By.className("username")).sendKeys("Edwinvic");
		Driver.findElement(By.id("password")).sendKeys("Edwinnn");
		Thread.sleep(2500);
		Driver.findElement(By.id("login")).click();
		Thread.sleep(1500);
		String expectedurl = "file:///C:/Users/itctesting07/Desktop/PROJECT/loginpage.html";
		String newurl = Driver.getCurrentUrl();
		Assert.assertEquals(newurl,expectedurl);
		Thread.sleep(1500);
	     
  }
  @Test
    public void bk4() throws Exception{
	  Driver.get("file:///C:/Users/itctesting07/Desktop/PROJECT/loginpage.html");
		Actions action = new Actions(Driver);
		WebElement movement = Driver.findElement(By.id("register"));
		action.moveToElement(movement);
		action.click();
		Driver.navigate().to("file:///C:/Users/itctesting07/Desktop/PROJECT/REGISTERATION.html");
		Driver.findElement(By.id("fname")).sendKeys("edwin");
		Driver.findElement(By.id("lname")).sendKeys("victor");
		WebElement radiobox = Driver.findElement(By.id("male"));
		Boolean isSelect=radiobox.isSelected();
		if(isSelect==false)
		{
			radiobox.click();
		}
		Driver.findElement(By.id("mob")).sendKeys("1276879911");
		Driver.findElement(By.id("email")).sendKeys("edwin66@gmail.com");
		Driver.findElement(By.id("aadhar")).sendKeys("445422647879");
		Select country = new Select(Driver.findElement(By.id("country")));
		country.selectByIndex(2);
		Driver.findElement(By.id("username")).sendKeys("edwinvic");
		Driver.findElement(By.id("password")).sendKeys("Edwinnn448");
		Driver.findElement(By.id("confirm-password")).sendKeys("Edwinnn448");
		WebElement chckbox = Driver.findElement(By.id("checkbox"));
		Boolean isselect =chckbox.isSelected();
		if(isselect==false)
		{
			chckbox.click();
		}
		Driver.findElement(By.id("register")).click();
		}

  @Test
     public void bk2() throws Exception{
	    Driver.findElement(By.className("username")).sendKeys("edwinvic");
		Driver.findElement(By.id("password")).sendKeys("Edwinnn448");
		Thread.sleep(2500);
		Driver.findElement(By.id("login")).click();
		Thread.sleep(1500);
		String expectedurl = "file:///C:/Users/itctesting07/Desktop/PROJECT/loginpage.html";
		String newurl = Driver.getCurrentUrl();
		Assert.assertEquals(newurl,expectedurl);
	  
  }
  
  @Test
  public void bk1() throws Exception {
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
		Driver.findElement(By.className("email")).sendKeys("edwinvic22@gmail.com");
		Thread.sleep(2500);
		Driver.findElement(By.id("sub")).click();
		Driver.navigate().to("file:///C:/Users/itctesting07/Desktop/PROJECT/last.html");
	    Thread.sleep(1500);
		Actions lastaction = new Actions(Driver);
		WebElement move = Driver.findElement(By.id("back")); 
		lastaction.moveToElement(move);
		lastaction.click();
		Driver.navigate().to("file:///C:/Users/itctesting07/Desktop/PROJECT/mainpage.html");

		Thread.sleep(1500);
		Actions lastactions = new Actions(Driver);
		WebElement move1 = Driver.findElement(By.id("logout"));
		lastactions.moveToElement(move1);
		lastactions.click();
		Driver.navigate().to("file:///C:/Users/itctesting07/Desktop/PROJECT/loginpage.html");
		Thread.sleep(1500);
		String expectedurl = "file:///C:/Users/itctesting07/Desktop/PROJECT/loginpage.html";
		String newurl = Driver.getCurrentUrl();
		Assert.assertEquals(newurl,expectedurl);
		Thread.sleep(1500);
  }


  @AfterMethod
  public void afterMethod() throws InterruptedException{
	  Thread.sleep(1500);
	  Driver.close();
  }

}
