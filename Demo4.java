import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle()); //validate title of page is correct
		System.out.println(driver.getCurrentUrl()); //validate landed on correct URL
		//System.out.println(driver.getPageSource()); //print page source
		
		driver.navigate().to("http://www.yahoo.com"); //navigate to new URL
		driver.navigate().back(); //click the back button
		driver.navigate().forward();
		driver.close(); //close the browser
		//driver.quit(); //closes all browsers open in the session
	}

}
