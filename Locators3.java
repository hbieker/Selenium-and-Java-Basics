import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("UNTEST");
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("PWTEST");
		
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		
	}

}
