import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Custom_CSS {

	public static void main(String[] args) {
		
		/*
		CSS Selector syntax
			tagName[attribute='value']
			[attribute='value']
			tagName#id  (Only if you have an id in the tag)
			#id (will also work)
			tagName.classname (Only if you have class in the tag)

		validate CSS in console
			$(" ")
		*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.weather.gov");
		driver.findElement(By.cssSelector("input[value='Enter location ...']")).click();
		driver.findElement(By.cssSelector("input[value='Enter location ...']")).sendKeys("80908");
		driver.findElement(By.cssSelector("input[name='myfcst-location-input']")).sendKeys("Colorado Springs");
				
	}

}
