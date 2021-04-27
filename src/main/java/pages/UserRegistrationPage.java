package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends PageBase 
{
	public UserRegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	  @FindBy(css="input.search-box-text.ui-autocomplete-input")
	  WebElement serachin ; 
	
    @FindBy(id="gender-male")
	WebElement genderRdoBtn  ; 
	
	@FindBy(id="FirstName")
	WebElement fnTxtBox ;
	
	@FindBy(id = "LastName")
	WebElement lnTxtBox ; 
	
	@FindBy (id="Company")
	WebElement CoTxtBox ; 
	
	@FindBy(id="Email")
	WebElement emailTxtBox  ; 
	
	@FindBy(id="Password")
	WebElement passwordTxtBox  ; 
	
	@FindBy(id="ConfirmPassword")
	WebElement confirmPasswordTxtBox ; 
	
	@FindBy(id="register-button")
	WebElement registerBtn  ; 
	
	@FindBy(css="div.result")
	public WebElement successMessage  ; 
	
	@FindBy(linkText="Log out")
	public WebElement logoutLink ; 
	
	@FindBy(linkText="My account")
	 WebElement myAccountLink ; 
	
	public void userRegistration(String firstName , String lastName ,   String email , String password) 
	{
		genderRdoBtn.click();
		fnTxtBox.sendKeys(firstName);
		lnTxtBox.sendKeys(lastName);
		emailTxtBox.sendKeys(email);
		passwordTxtBox.sendKeys(password);
	    confirmPasswordTxtBox.sendKeys(password);
		registerBtn.click();
		
	}
	
	public void userLogout() 
	{
		logoutLink.click();;
	}
	
	public void openMyAccountPage() 
	{
		myAccountLink.click();;
	}
	
}
