package SeleniumScript;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://omayo.blogspot.com/2013/05/page-one.html"); 
		/*
		 * String parent_win = driver.getWindowHandle();
		 *
		 * System.out.println("Main window page id is: " + parent_win);
		 */
	   
	    // click on the link to open a new window
	   
	    driver.findElement(By.cssSelector("#HTML37 > div.widget-content > p > a")).click();
	   
	    // we capture id of each window or Tab that selenium opens for this driver session.
	   
	    //  Set<String> org.openqa.selenium.WebDriver.getWindowHandles()
	 
	    Set <String> s1 = driver.getWindowHandles(); // A set of window handles which can be used to iterate over all open windows.
	    // We can iterate over each value in the set and print the id of the windows
	   
	   
	    Iterator<String> itr = s1.iterator();
	   
	    // fetch parent window id
	   
	    String parent_win = itr.next();
	   
	    System.out.println("Main window page id is: " + parent_win);
	   
	    String child_window = itr.next();
	   
	    System.out.println("Child window page id is: " + child_window);
	   
	    // switch to the child window
	   
	   driver.switchTo().window(child_window) ;
	  
	   driver.manage().window().maximize();
	  
	   String text = driver.findElement(By.cssSelector("body > div > h3")).getText();
	
	    System.out.println(text);
	   
	    driver.quit();


	}

}
