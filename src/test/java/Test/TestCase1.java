package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Com.PageObject.RegistrationPom;
import Com.Utility.BaseClass;
import Com.Utility.Library;

public class TestCase1 extends BaseClass{
	//WebDriver driver;
	@Test
	public void Login()
	{
		System.out.println("This is first test case");
		RegistrationPom regis= PageFactory.initElements(driver, RegistrationPom.class);
		//regis.getF_Name().sendKeys("Mayur");
		//regis.getL_Name().sendKeys("Shinde");
		//regis.getPhone().sendKeys("8975857850");
		
		String fName= excel.getSheet_Data("Registration", 0, 0);
		String lName= excel.getSheet_Data("Registration", 0, 1);
		String mobile= excel.getSheet_Data("Registration", 0, 2);
		String address= excel.getSheet_Data("Registration", 0, 3);
		String city= excel.getSheet_Data("Registration", 0, 4);
		String country= excel.getSheet_Data("Registration", 0, 5);
		String p_code= excel.getSheet_Data("Registration", 0, 6);
		String mail= excel.getSheet_Data("Registration", 0, 7);
		String password= excel.getSheet_Data("Registration", 0, 8);
		String c_password= excel.getSheet_Data("Registration", 0, 9);
		
		Library.customRegistration(regis.getF_Name(), fName);
		Library.customRegistration(regis.getL_Name(), lName);
		Library.customRegistration(regis.getPhone(), mobile);
		Library.customeSelect(regis.getDOB_Year(), 10);
		Library.customeSelect(regis.getDOB_Month(), 10);
		Library.customeSelect(regis.getDOB_Day(), 10);
		Library.customClick(regis.getProvisional());
		Library.customeSelect(regis.getOccupation(), 11);
		Library.customRegistration(regis.getAddress_Street(),address);
		Library.customRegistration(regis.getCity(), city);
		Library.customRegistration(regis.getCountry(),country);
		Library.customRegistration(regis.getPost_code(), p_code);
		Library.customRegistration(regis.getEmail(), mail);
		Library.customRegistration(regis.getPassword(), password);
		Library.customRegistration(regis.getConfirm_Password(), c_password);
		Library.customClick(regis.getCreatebtn());

		
		
		
		Library.customeSelect(regis.getDOB_Year(),10);
		Library.customeSelect(regis.getDOB_Month(), 10);
		Library.customeSelect(regis.getDOB_Day(), 10);
		Library.customeSelect(regis.getLicence_Period(), 59);
		
	}
	

}
