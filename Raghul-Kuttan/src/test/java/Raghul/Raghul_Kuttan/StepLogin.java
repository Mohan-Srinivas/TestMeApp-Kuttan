package Raghul.Raghul_Kuttan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepLogin
{
	WebDriver driver;
	@Given("User Enter a login Page")
	public void user_Enter_a_login_Page() 
	{
		driver=Utility.getDriver("Chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		
	}
	@Given("Enter a Username {string}")
	public void enter_a_Username(String x) 
	{
		driver.findElement(By.name("userName")).sendKeys(x);
	}

	@When("Enter a Password {string}")
	public void enter_a_Password(String y) 
	{
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(y);
	}
	

	@Then("click the login Button")
	public void click_the_login_Button() 
	{
		driver.findElement(By.name("Login")).click();
	}


}
