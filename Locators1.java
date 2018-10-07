import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		//Find element by ID
		driver.findElement(By.id("email")).sendKeys("UsernameTest");
		
		//Find element by Name
		driver.findElement(By.name("pass")).sendKeys("PasswordTest");
		
		//Find element by Class Name cannot have spaces
		//Gives error Compound class names not permitted
		//driver.findElement(By.className("_6j mvm _6wk _6wl _58mi _3ma _6o _6v")).click();
		
		//Find element by link text
		//Text for the link in the anchor tag
		driver.findElement(By.linkText("Forgot account?")).click();
		
	}

}
