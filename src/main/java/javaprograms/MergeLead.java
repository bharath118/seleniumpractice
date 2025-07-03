package javaprograms;
import java.util.Set;

import org.openqa.selenium.chrome.*;


public class MergeLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("http://leaftaps.com/opentaps");
		  driver.manage().window().maximize();
		  driver.findElementById("username").sendKeys("DemoSalesManager");
		  driver.findElementById("password").sendKeys("crmsfa");
		  driver.findElementByClassName("decorativeSubmit").click();
		  driver.findElementByLinkText("CRM/SFA").click();
		  driver.findElementByLinkText("Leads").click();
		  driver.findElementByLinkText("Merge Leads").click();
		  driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		  //String newWindow = driver.getWindowHandle();
		  //System.out.println(currentWindow);
		  //driver.switchTo().window(newWindow);
		  Set<String> allWindow = driver.getWindowHandles();
		  for (String eachWindow : allWindow) {
		   driver.switchTo().window(eachWindow);
		  }
		  driver.findElementByName("id").sendKeys("11033");
		  driver.findElementById("ext-gen114").click();
		  Thread.sleep(3000);
		  driver.findElementByLinkText("11033").click();
		  Set<String> allWindow1 = driver.getWindowHandles();
		  for (String eachWindow1 : allWindow1) {
		   {
		    driver.switchTo().window(eachWindow1);
		   }
		   
		  }
		  driver.findElementById("ComboBox_partyIdTo").sendKeys("11106");
		  driver.findElementByLinkText("Merge").click();
		  driver.switchTo().alert().accept();
		  //List<WebElement> allLinks = driver.findElementsByTagName("a");
		  //System.out.println(allLinks.size());
		  //allLinks.get().click();
		  driver.findElementByLinkText("Find Leads").click();
		  driver.findElementById("ext-gen246").sendKeys("11034");
		  driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		  String verifyText = driver.findElementByXPath("//div[text()='No records to display']").getText();
		  if(verifyText.contains("No records to display"))
		  {
		   System.out.println("Pass");
		   driver.close();
		  }

	}

}
