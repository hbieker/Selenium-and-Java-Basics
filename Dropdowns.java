import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://material-components.github.io/material-components-web-catalog/#/component/select");
		driver.manage().window().maximize();
		
		//For Static Dropdowns
		//Contain Select tags - create new Select object
		
		Select s = new Select(driver.findElement(By.id("select-hero")));
		//s.selectByValue("banana");
		//s.selectByIndex(2);
		s.selectByVisibleText("Orange");
		
	}

}
