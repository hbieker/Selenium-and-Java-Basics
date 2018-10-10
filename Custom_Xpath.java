import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Custom_Xpath {

	public static void main(String[] args) {
		
		/*
		xpath syntax 
		//tagName[@attribute='value']
		//*[@attribute='value'] (Any tag with the attribute)

		validate xpath in console
			$x(" ")
		*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.weather.gov");
		driver.findElement(By.xpath("//input[@id='inputstring']")).click();
		driver.findElement(By.xpath("//input[@id='inputstring']")).sendKeys("90210");
		driver.findElement(By.xpath("//input[@value='City, ST']")).sendKeys("Beverly Hills");	
		
	}

}
