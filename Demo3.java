import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

//import packages above for each browser

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create Driver Object for a Firefox browser
		
		// We will strictly implement methods of webdriver. *interface
		//X driver = new X();
		
		System.setProperty("webdriver.ie.driver", "C:\\Program Files\\Selenium\\MicrosoftWebDriver.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

}
