package stepdefinition;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*import cucumber.api.*;*/
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import junit.framework.*;

public class Definition1 {
	WebDriver driver;
	
	@Given("user is already on Login Page")
	public void user_is_already_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		driver=new ChromeDriver();
		System.out.println("login to Rehuba Airlines");
		driver.get("file:///D:/loginpage.html");
		
	}
	@When("title of login page is REHUBA ITC Airlines")
	public void title_of_login_page_is_free_crm() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("REHUBA ITC Airlines");
	}
	@When("user enters user name and password")
	public void user_enters_user_name_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.className("username")).sendKeys("Usharani55");
		driver.findElement(By.id("password")).sendKeys("Rani12345");
	}
	@Then("user is on the home page")
	public void user_is_on_the_home_page() {
		//System.out.println(driver.get("file:///D:/loginpage.html"));
	    System.out.println("Click on Navigation button");
	}
}
