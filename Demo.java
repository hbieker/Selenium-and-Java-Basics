import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import packages above for each browser

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create Driver Object for Chrome browser
		
		// We will strictly implement methods of webdriver. *interface
		//X driver = new X();  is the normal approach, but see line above.
		//Class name is ChromeDriver
		
		//System.setProperty for each browser depending on what your using.
		//Code always goes in the main method, this method is required as the starting
		//point for each class
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

}
