package javaprograms;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class assignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	driver.manage().window().maximize();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	System.out.println(driver.getTitle());
	System.out.println(driver.findElementById("userRegistrationForm:occupation").getText());
	System.out.println(driver.findElementById("userRegistrationForm:dobMonth").getText());
	WebElement attrib = driver.findElementById("userRegistrationForm:occupation");
	String attribName = attrib.getAttribute("id");
	System.out.println(attribName);
	boolean verifySelect = driver.findElementById("userRegistrationForm:resAndOff:0").isSelected();
	System.out.println(verifySelect);
	boolean verifyEnable = driver.findElementById("userRegistrationForm:statesName").isEnabled();
	System.out.println(verifyEnable);
	boolean verifyDisplay = driver.findElementById("userRegistrationForm:statesName").isDisplayed();
	System.out.println(verifyDisplay);
	System.out.println(driver.findElementById("userRegistrationForm:statesName").getCssValue("color"));
}

}
