package SeleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
   
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(1500);
		
		// store the element location in a WebElement object
	WebElement e1=	driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	
	// MouseHover activites are done using methods moveToElement(e1) ==> class Action
	
	Actions a = new Actions(driver);
	
	a.moveToElement(e1).perform();
	
	Thread.sleep(1500);
	
	WebElement e2 = driver.findElement(By.xpath("//div[@id='nav-xshop-container']/descendant::a[6]"));
	
	e2.click(); // click on mobiles link
	
	
	Thread.sleep(3000);
	
	System.out.println(driver.getTitle());
	
	// Store the location of element mobiles and accessories.
	WebElement e3 = driver.findElement(By.xpath("//div[@id='nav-progressive-subnav']/descendant::a[2]"));
	
	a.moveToElement(e3).perform();
	


	}

}
