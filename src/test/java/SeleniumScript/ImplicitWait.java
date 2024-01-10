package SeleniumScript;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.opera.com/download");
		
		// Wait for given seconds for the webpage URL to Load,
		//after the time is up, if the page is not open, then give an error
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
		
		//Implicit wait
		
		// Selenium will poll webpage for all elements visibiltiy
		// and keep wiaitng for 3 seconds
		// if any one element is also visible--> it will proceed with exection
		// if even after 3 seconds if no element is  visible, it will give element not found exception
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement e1 = driver.findElement(By.xpath("//div[@class='cookie-consent__basic cookie-consent__inner']/descendant::span[3]"));
		e1.click();


	}

}
