package Com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationPom {
	
	@FindBy(how=How.XPATH,using="//input[@name='firstname']") private WebElement f_Name;
	@FindBy(how=How.XPATH,using="//input[@name='lastname']") private WebElement l_Name;
	@FindBy(how=How.XPATH,using="//input[@name='phone']") private WebElement phone;
	@FindBy(how=How.XPATH,using="//Select[@name='year']") private WebElement DOB_Year;
	@FindBy(how=How.XPATH,using="//Select[@name='month']")private WebElement DOB_Month;
	@FindBy(how= How.XPATH,using="//Select[@name='date']")private WebElement DOB_Day;
	@FindBy(how=How.XPATH,using="//input[@value='Provisional']")private  WebElement Provisional;
	@FindBy(how= How.XPATH,using="//select[@name='licenceperiod']")private WebElement Licence_Period;
	@FindBy(how= How.XPATH,using="//select[@name='occupation']")private WebElement Occupation;
	@FindBy(how= How.XPATH,using="//input[@name='street']")private WebElement Address_Street;
	@FindBy(how= How.XPATH,using="//input[@name='city']")private WebElement City;
	@FindBy(how= How.XPATH,using="//input[@name='county']")private WebElement Country;
	@FindBy(how= How.XPATH,using="//input[@name='post_code']")private WebElement Post_code;
	@FindBy(how= How.XPATH,using="//input[@name='email']")private WebElement Email;
	@FindBy(how= How.XPATH,using="//input[@name='password']")private WebElement Password;
	@FindBy(how= How.XPATH,using="//input[@name='c_password']")private WebElement Confirm_Password;
	@FindBy(how= How.XPATH,using="//input[@value='Create']")private WebElement Createbtn;
	
	public WebElement getF_Name() {
		return f_Name;
	}
	
	public WebElement getL_Name() {
		return l_Name;
	}
	
	
	public WebElement getPhone() {
		return phone;
	}

	public WebElement getDOB_Year() {
		return DOB_Year;
	}

	

	public WebElement getDOB_Month() {
		return DOB_Month;
	}

	

	public WebElement getDOB_Day() {
		return DOB_Day;
	}

	public WebElement getProvisional() {
		return Provisional;
	}

	public WebElement getLicence_Period() {
		return Licence_Period;
	}

	public WebElement getOccupation() {
		return Occupation;
	}

	

	public WebElement getAddress_Street() {
		return Address_Street;
	}

	

	public WebElement getCity() {
		return City;
	}

	

	public WebElement getCountry() {
		return Country;
	}

	

	public WebElement getPost_code() {
		return Post_code;
	}

	

	public WebElement getEmail() {
		return Email;
	}

	

	public WebElement getPassword() {
		return Password;
	}

	

	public WebElement getConfirm_Password() {
		return Confirm_Password;
	}

	public WebElement getCreatebtn() {
		return Createbtn;
	}

	

	

	

	

	
	
	
	
	

}
