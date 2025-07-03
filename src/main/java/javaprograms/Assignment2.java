package javaprograms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Contact").click();
		String firstName="Bharath";
		driver.findElementById("firstNameField").sendKeys(firstName);
		driver.findElementById("lastNameField").sendKeys("M");
		driver.findElementById("createContactForm_firstNameLocal").sendKeys("Bharath");
		driver.findElementById("createContactForm_lastNameLocal").sendKeys("M");
		driver.findElementById("createContactForm_personalTitle").sendKeys("Mr.");
		driver.findElementById("createContactForm_generalProfTitle").sendKeys("Create Contact");
		driver.findElementById("createContactForm_departmentName").sendKeys("CSE");
		WebElement currency= driver.findElementById("createContactForm_preferredCurrencyUomId");
		Select dropdownCurrency=new Select(currency);
		dropdownCurrency.selectByVisibleText("INR - Indian Rupee");
		driver.findElementById("createContactForm_accountPartyId").sendKeys("12345");
		driver.findElementById("createContactForm_description").sendKeys("Desc");
		driver.findElementById("createContactForm_importantNote").sendKeys("Note");
		driver.findElementById("createContactForm_primaryPhoneCountryCode").clear();
		driver.findElementById("createContactForm_primaryPhoneCountryCode").sendKeys("91");
		driver.findElementById("createContactForm_primaryPhoneAreaCode").sendKeys("44");
		driver.findElementById("createContactForm_primaryPhoneNumber").sendKeys("99999999");
		driver.findElementById("createContactForm_primaryPhoneExtension").sendKeys("1");
		driver.findElementById("createContactForm_primaryPhoneAskForName").sendKeys("ABC");
		driver.findElementById("createContactForm_primaryEmail").sendKeys("abc@email.com");
		driver.findElementById("generalToNameField").sendKeys("Person 1");
		driver.findElementById("createContactForm_generalAttnName").sendKeys("Person 2");
		driver.findElementById("createContactForm_generalAddress1").sendKeys("Address 1");
		driver.findElementById("createContactForm_generalAddress2").sendKeys("Address 2");
		driver.findElementById("createContactForm_generalCity").sendKeys("Chennai");
		WebElement country= driver.findElementById("createContactForm_generalCountryGeoId");
		Select dropdownCountry=new Select(country);
		dropdownCountry.selectByVisibleText("India");
		Thread.sleep(4000);
		WebElement state= driver.findElementById("createContactForm_generalStateProvinceGeoId");
		Select dropdownState=new Select(state);
		dropdownState.selectByVisibleText("TAMILNADU");
		driver.findElementById("createContactForm_generalPostalCode").sendKeys("600044");
		driver.findElementById("createContactForm_generalPostalCodeExt").sendKeys("11");
		driver.findElementByClassName("smallSubmit").click();
		String verifyFirstName=driver.findElementById("viewContact_firstName_sp").getText();
		System.out.println(verifyFirstName);
		if(verifyFirstName.equals(firstName))
		{
			System.out.println("Name is correct");
		}
		driver.findElementByLinkText("Edit").click();
		WebElement marketcamp= driver.findElementById("addMarketingCampaignForm_marketingCampaignId");
		Select dropdownMarketcamp=new Select(marketcamp);
		dropdownMarketcamp.selectByValue("CATRQ_AUTOMOBILE");
		driver.findElementByXPath("//*[@value='Add']").click();;
		//driver.findElementByLinkText("Automobile (CATRQ_AUTOMOBILE)");
		
	}

}
