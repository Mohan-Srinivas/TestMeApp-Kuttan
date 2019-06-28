package Case_Search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Raghul.Raghul_Kuttan.Utility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Step_Search
{
	WebDriver driver;
	@Given("User must be login  to the home page {string} and {string}")
	public void user_must_be_login_to_the_home_page_and(String x, String y) 
	{
		driver=Utility.getDriver("Chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		driver.findElement(By.name("userName")).sendKeys(x);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(y);
		driver.findElement(By.name("Login")).click();
	}
	@When("User search a product in a search box {string}")
	public void user_search_a_product_in_a_search_box(String string) 
	{
		driver.findElement(By.id("myInput")).sendKeys("HeadPhone");
	}

	@And("Click the Find Details button")
	public void click_the_Find_Details_button() 
	{
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("Navigated to the product details page")
	public void navigated_to_the_product_details_page()
	{
		Assert.assertEquals(driver.getTitle(),"Search");
	}

}
