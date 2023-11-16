package objects;

import org.openqa.selenium.By;

import com.mysql.cj.exceptions.AssertionFailedException;

import general.MainCall;

public class Landing {
	 public Landing() {}
	 public static By landing_loginURL = By.xpath("//a[@href='https://automationteststore.com/index.php?rt=account/login']");
	 
	 public static void arrivetoLanding()
	 {
	     try {
	         MainCall.webDriverFactory.getInstance();
	     } catch (Exception exception) {
	         throw new AssertionFailedException(exception.getMessage());
	     }
	 }
	 
	
		 public static void click_LoginButton()
		    {
		        MainCall.seleniumFunctions.PressButton(landing_loginURL);
		    }
	 }


