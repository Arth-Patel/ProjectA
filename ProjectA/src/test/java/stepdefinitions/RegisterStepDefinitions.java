package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cg.repo.RegistrationPageRepo;

import cucumber.api.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinitions {

	WebDriver driver;
	RegistrationPageRepo repo;

    @Given("^User is on Home Page$")
    public void user_is_on_home_page() throws Throwable {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\artpatel\\Downloads\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/artpatel/OneDrive%20-%20Capgemini/Documents/VehicleRegistrationForm.html");
		repo = new RegistrationPageRepo(driver);
    	System.out.println("Home page");
    	
        
    }

    @When("^User enters Title$")
    public void user_enters_title() throws Throwable {
    	repo.Title().sendKeys("m");
    }
    
    @When("^User enters Incorrect Title$")
    public void user_enters_incorrect_title() throws Throwable {
    	System.out.println("Nothing");
    }
    
    @And("^User enters Name$")
    public void user_enters_name() throws Throwable {
        repo.Owner().sendKeys("ArthPatel");
    }
    
    @And("^User enters Incorrect Name$")
    public void user_enters_incorrect_name() throws Throwable {
    	System.out.println("Nothing");
    }

    @And("^User enters Gender$")
    public void user_enters_gender() throws Throwable {
       	repo.Gender().click();
    }
    
    @And("^User enters No Gender$")
    public void user_enters_no_gender() throws Throwable {
    	System.out.println("Nothing");
    }

    @And("^User enters Address$")
    public void user_enters_address() throws Throwable {
        repo.Address().sendKeys("1600shafercourt");
    }
    
    @And("^User enters Incorrect Address$")
    public void user_enters_incorrect_address() throws Throwable {
    	System.out.println("Nothing");
    }
    
    @And("^User enters City$")
    public void user_enters_city() throws Throwable {
        repo.City().sendKeys("rosemont");
    }
    
    @And("^User enters Incorrect City$")
    public void user_enters_incorrect_city() throws Throwable {
    	System.out.println("Nothing");
    }

    @And("^User enters State$")
    public void user_enters_state() throws Throwable {
    	repo.State().sendKeys("Illinois");
    }
    
    @And("^User enters Incorrect State$")
    public void user_enters_incorrect_state() throws Throwable {
    	System.out.println("Nothing");
    }

    @And("^User enters Country$")
    public void user_enters_country() throws Throwable {
        repo.Country().sendKeys("ind");
    }
    
    @And("^User enters No Country$")
    public void user_enters_no_country() throws Throwable {
    	System.out.println("Nothing");
    }

    @And("^User enters Zip$")
    public void user_enters_zip() throws Throwable {
        repo.Zip().sendKeys("600180");
    }

    @And("^User enters Incorrect Zip$")
    public void user_enters_incorrect_zip() throws Throwable {
    	System.out.println("Nothing");
    }
    
    @And("^User enters Vehicle Type$")
    public void user_enters_vehicle_type() throws Throwable {
        repo.Vehicle().click();
    }
    
    @And("^User enters No Vehicle Type$")
    public void user_enters_no_vehicle_type() throws Throwable {
    	System.out.println("Nothing");
    }

    @And("^User enters Fuel Type$")
    public void user_enters_fuel_type() throws Throwable {
        repo.Fuel().click();
    }
    
    @And("^User enters No Fuel Type$")
    public void user_enters_no_fuel_type() throws Throwable {
    	System.out.println("Nothing");
    }

    @And("^User enters MFG$")
    public void user_enters_mfg() throws Throwable {
        repo.MFG().sendKeys("2015");
    }
    
    @And("^User enters No MFG$")
    public void user_enters_no_mfg() throws Throwable {
    	System.out.println("Nothing");
    }
    
    @And("^User clicks Submit$")
    public void user_clicks_submit() throws Throwable{
    	repo.Submit().click();
    }
    
    @Then("^User has successfully registered$")
    public void user_has_successfully_registered() throws Throwable {
    	Assert.assertTrue(driver.switchTo().alert().getText().contains("Succesfully"));
    	driver.switchTo().alert().accept();
    	driver.quit();
    }
    
    @Then("^User gets Title Popup$")
    public void user_gets_Title_Popup() throws Throwable {
        
    	Assert.assertTrue(driver.switchTo().alert().getText().toLowerCase().contains("title"));
    	driver.switchTo().alert().accept();
    	driver.quit();
    
    }

    @Then("^User gets Name Popup$")
    public void user_gets_Name_Popup() throws Throwable {
    	Assert.assertTrue(driver.switchTo().alert().getText().toLowerCase().contains("name"));
    	driver.switchTo().alert().accept();
    	driver.quit();
    }

    @Then("^User gets Gender Popup$")
    public void user_gets_Gender_Popup() throws Throwable {
    	Assert.assertTrue(driver.switchTo().alert().getText().toLowerCase().contains("gender"));
    	driver.switchTo().alert().accept();
    	driver.quit();
    }

    @Then("^User gets MFG Popup$")
    public void user_gets_MFG_Popup() throws Throwable {
    	Assert.assertTrue(driver.switchTo().alert().getText().toLowerCase().contains("mfg"));
    	driver.switchTo().alert().accept();
    	driver.quit();
    }

    @Then("^User gets Fuel Popup$")
    public void user_gets_Fuel_Popup() throws Throwable {
    	Assert.assertTrue(driver.switchTo().alert().getText().toLowerCase().contains("fuel"));
    	driver.switchTo().alert().accept();
    	driver.quit();
    }

    @Then("^User gets Vehicle Popup$")
    public void user_gets_Vehicle_Popup() throws Throwable {
    	Assert.assertTrue(driver.switchTo().alert().getText().toLowerCase().contains("vehicle"));
    	driver.switchTo().alert().accept();
    	driver.quit();
    }

    @Then("^User gets Address Popup$")
    public void user_gets_Address_Popup() throws Throwable {
    	Assert.assertTrue(driver.switchTo().alert().getText().toLowerCase().contains("address"));
    	driver.switchTo().alert().accept();
    	driver.quit();
    }

    @Then("^User gets City Popup$")
    public void user_gets_City_Popup() throws Throwable {
    	Assert.assertTrue(driver.switchTo().alert().getText().toLowerCase().contains("city"));
    	driver.switchTo().alert().accept();
    	driver.quit();
    }

    @Then("^User gets State Popup$")
    public void user_gets_State_Popup() throws Throwable {
    	Assert.assertTrue(driver.switchTo().alert().getText().toLowerCase().contains("state"));
    	driver.switchTo().alert().accept();
    	driver.quit();
    }

    @Then("^User gets Country Popup$")
    public void user_gets_Country_Popup() throws Throwable {
    	Assert.assertTrue(driver.switchTo().alert().getText().toLowerCase().contains("country"));
    	driver.switchTo().alert().accept();
    	driver.quit();
    }

    @Then("^User gets Zip Popup$")
    public void user_gets_Zip_Popup() throws Throwable {
    	Assert.assertTrue(driver.switchTo().alert().getText().toLowerCase().contains("zip"));
    	driver.switchTo().alert().accept();
    	driver.quit();
    }


}