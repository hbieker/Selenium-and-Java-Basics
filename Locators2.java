import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
		//Find element by Xpath
		//driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		
		//Find element by CSS Selector
		//driver.findElement(By.cssSelector("#password")).sendKeys("password");
		
		driver.findElement(By.xpath("//*[@id=\"password\"]"));
	}

}
