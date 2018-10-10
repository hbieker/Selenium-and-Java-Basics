import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Custom_Xpath_CSS_RegExp {

	public static void main(String[] args) {
		
		/*
		xpath and CSS with Regular Expressions
			//tagName[contains(@attribute, 'value')]  -XPATH
			tagName[attribute*='value']				  -CSS
			
			Can be used to locate an attribute that contains the text
			Such as when the attribute is changing or is too long to type

		*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//input[contains(@id, 'usern')]")).sendKeys("LocatedByCustomXpath");
		driver.findElement(By.cssSelector("input[type*='passw']")).sendKeys("LocatedByCustomCSS");
		
	}

}
