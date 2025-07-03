package javaprograms;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ForEachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.manage().window().maximize();
		driver.findElementByLinkText("Sign up").click();
		WebElement country = driver.findElementById("userRegistrationForm:countries");
		Select dropdownCountry = new Select(country);
		List<WebElement> listCountry = dropdownCountry.getOptions();
		for (WebElement count : listCountry) {
			System.out.println(count.getText());
			if (count.getText().startsWith("E")) {
				i++;
				if(i == 2)
				{
					count.click();
					break;
				}
				
				
			}
		}

	}

}
