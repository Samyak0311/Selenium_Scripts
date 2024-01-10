package SeleniumScript;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
   
		driver.get("https://www.flipkart.com/");
		
		
		driver.navigate().refresh();
	// we want the script to wait(10 seconds) until the mobile number text box element is visible
		
		// In explicit wait , tester will give 2 things:
		   // waititme - 10 seconds --> selenium is going to wait for 10 seconds
		   // condition --> while waiting it will keep checking th econdition
		
		// If 5 seconds have been completed and the condition is satisfied now
		// selenium will immediatly comeout of the wait time and conitnue executing the script
		// In this selenium doesnot have to wait for the entire time,
		// as the conditon is satisfied comeout of waiting time
		// If waittime is complete but condition is not satisfied --> error on console
		// explicit wait is written for single element
		
		
		
		//we want webdriver to wait for 10 seconds
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		// wait until the given condition is satisfied
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_3skCyB']/descendant::input[1]")));
		
	
		WebElement e1 = driver.findElement(By.xpath("//div[@class='_3skCyB']/descendant::input[1]"));
		// find the element text box to enter mobile number on the dialogue box
		
		e1.sendKeys("2343535345");

	}

}
