package steps;

import cucumber.api.java.en.Given;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.HomePage;
import pages.UserRegistrationPage;
import tests.TestBase;

import java.io.FileReader;
import java.io.IOException;

//import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistration extends TestBase throws IOException, CsvValidationException  {
	
	// get path of CSV file 
			String CSV_file = System.getProperty("user.dir")+"/src/test/java/data/UserData.csv";
			reader = new CSVReader(new FileReader(CSV_file));


	HomePage homeObject ; 
	UserRegistrationPage registerObject ; 

	@Test
	public void the_user_in_the_home_page() throws Throwable {
		homeObject = new HomePage(driver); 
		homeObject.openRegistrationPage();
	}

	//@When("^I click on register link$")
	@Test
	public void i_click_on_register_link()  {
		Assert.assertTrue(driver.getCurrentUrl().contains("register"));
	}

	//@When("^I entered the user data$")
	@Test
	public void i_entered_the_user_data()  {
		registerObject = new UserRegistrationPage(driver); 
		registerObject.userRegistration("ismail", "saleh", "moataz@test.com", "12345678");
	}

	//@When("^The registration page displayed successfully$")
	@Test
	public void i_entered(String firstname, String lastname, String email, String password) {
		registerObject = new UserRegistrationPage(driver); 
		registerObject.userRegistration(firstname, lastname,email,password);
		
	}

	@Test 
	//("^The registration page displayed successfully$")
	public void the_registration_page_displayed_successfully()  {
		registerObject.userLogout();
		
	}

}
