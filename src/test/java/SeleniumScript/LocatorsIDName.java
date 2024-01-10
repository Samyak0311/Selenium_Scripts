package SeleniumScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsIDName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up");
		
		driver.manage().window().maximize();
		// find the element username and perform an action on it using id locator
		// check if the element username is visible on the webpage
		
		boolean display = driver.findElement(By.id("wpName2")).isDisplayed(); // returns true or false
		
		System.out.println("the element is visible : " + display);
		
		// check if the element username is enabled on the webpage
		
		boolean enable =	driver.findElement(By.id("wpName2")).isEnabled();
		System.out.println("the element is enabled : " + enable);
		
		// now enter the data in the text box
		// sendKeys("inputdata") - method used to enter data in text box on webpage.
	
		driver.findElement(By.id("wpName2")).sendKeys("admin");
		
		/*********************************************/
		
		// Find the id locator for password field on the webpage
		
       display = driver.findElement(By.id("wpPassword2")).isDisplayed(); // returns true or false
		
		System.out.println("the element is visible : " + display);
		
		enable =	driver.findElement(By.id("wpPassword2")).isEnabled();
		System.out.println("the element is enabled : " + enable);
		
		driver.findElement(By.id("wpPassword2")).sendKeys("admin@123");
		
		/*********************************************/
		
		// Find the name locator for retype password field on the webpage
	
		 display = 	driver.findElement(By.name("retype")).isDisplayed();
		 System.out.println("the element is visible : " + display);
		
		 enable = driver.findElement(By.name("retype")).isEnabled();
		 System.out.println("the element is enabled : " + enable);
		
		 driver.findElement(By.name("retype")).sendKeys("admin@123");
		
		 //Find the name locator for email  field on the webpage
		
		 display = 	driver.findElement(By.name("email")).isDisplayed();
		 System.out.println("the element is visible : " + display);
		
		 enable = driver.findElement(By.name("email")).isEnabled();
		 System.out.println("the element is enabled : " + enable);
		
		 driver.findElement(By.name("email")).sendKeys("admin@gmail.com");

	}

}
