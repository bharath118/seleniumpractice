package javaprograms;


import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		Boolean selected = driver.findElementById("otpId").isSelected();
		System.out.println(selected);

	}

}
