package SeleniumScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocatorClassTag {

	public static void main(String[] args)  throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up");
		
		driver.manage().window().maximize();
		
		// find the link Login  on the page and click on it
		
		// for links, selenium has given exlusive locator called as linkText
		// the value of this locator is the text on the link
		
		driver.findElement(By.linkText("Log in")).click();
		
		// wait for 1.5 seconds
		
		Thread.sleep(1500);
		
		// whenever we click on a link we will be navigated to a new page
		// We want to find the title of the new page
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.id("wpName1")).sendKeys("admin");
		
		driver.findElement(By.name("wpPassword")).sendKeys("admin@123");
		
		// click on the button
		
		driver.findElement(By.id("wpLoginAttempt")).click();
		
		Thread.sleep(1500);
		
		// find the link and click on it
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(1500);
		
		// this locator will search link which contains text as given in partialLinkText locator value
		
	   driver.navigate().to("https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Wikipedia:Sign+up");
	  
	  
	   driver.findElement(By.partialLinkText("logging in")).click();
		
	   title = driver.getTitle();
		System.out.println(title);

	}

}
