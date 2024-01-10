package SeleniumScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DialogueBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
   
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
        driver.navigate().refresh();


		// find the element text box to enter mobile number on the dialogue box
		
		driver.findElement(By.xpath("//div[@class='_3skCyB']/descendant::input[1]")).sendKeys("2343535345");
		
		// find the element locator for cross symbol to lose the dialogue box
		
		driver.findElement(By.xpath("//div[@class='JFPqaw']/child::span")).click();


	}

}
