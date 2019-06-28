package ForRegister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Raghul.Raghul_Kuttan.Utility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepReg 
{
	WebDriver driver;
	@Given("User is in the Testme app home page")
	public void user_is_in_the_Testme_app_home_page() 
	{
		driver=Utility.getDriver("Chrome");
		driver.get("http://10.232.237.143:443/TestMeApp");
	}

	@Given("Cilcks the Signup button")
	public void cilcks_the_Signup_button() 
	{
		driver.findElement(By.linkText("SignUp")).click();
	}

	@When("I enter valid credentials")
	public void i_enter_valid_credentials() 
	{
		driver.findElement(By.id("userName")).sendKeys("AlexUser");
		driver.findElement(By.name("firstName")).sendKeys("Alex");
	    driver.findElement(By.name("lastName")).sendKeys("User");
	    driver.findElement(By.id("password")).sendKeys("Alex123");
	    driver.findElement(By.id("pass_confirmation")).sendKeys("Alex123");
	    driver.findElement(By.xpath("//*[@id='gender']")).click();
	    driver.findElement(By.id("emailAddress")).sendKeys("Rohit45@gmail.com");
	    driver.findElement(By.id("mobileNumber")).sendKeys("9876543210");
	    driver.findElement(By.name("dob")).sendKeys("10/14/1997");
	    driver.findElement(By.id("address")).sendKeys("coimbatore");
	    Select question = new Select(driver.findElement(By.id("securityQuestion")));
	    question.selectByValue("411011");
	    driver.findElement(By.id("answer")).sendKeys("blue");
	}
	@And("clicks register button")
	public void clicks_register_button() 
	{
		 driver.findElement(By.name("Submit")).click();
	}

	@Then("navigated to Homepage")
	public void navigated_to_Homepage() 
	{
		Assert.assertEquals(driver.getTitle(),"Login");  
	}


}
