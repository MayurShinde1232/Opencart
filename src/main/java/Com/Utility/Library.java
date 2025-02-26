package Com.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;

public class Library {
	
	public static ExtentTest test;
	
	public static void customRegistration(WebElement element, String value)
	{
		element.sendKeys(value);
	}
	
	public static void customClick(WebElement element)
	{
		element.click();
	}
	
	public static void customeSelect(WebElement element, int index)
	{
		Select sel= new Select(element);
		sel.selectByIndex(index);
	}

}
