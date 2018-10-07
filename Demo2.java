import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import packages above for each browser

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create Driver Object for a Firefox browser
		
		// We will strictly implement methods of webdriver. *interface
		//X driver = new X();
		
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

}
