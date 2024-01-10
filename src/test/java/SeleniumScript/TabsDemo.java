package SeleniumScript;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TabsDemo {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
   
		driver.get("https://www.flipkart.com/");
		
   /* We will now learn a class called as ROBOT class that allows selenium to perform keyword Event
    */
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL); // press control key
		
		r.keyPress(KeyEvent.VK_T);
		
		// Now relase the keys
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		r.keyRelease(KeyEvent.VK_T);
		
		/*********AGAIN OPEN a Tab********************/
		
		r.keyPress(KeyEvent.VK_CONTROL); // press control key
		
		r.keyPress(KeyEvent.VK_T);
		
		// Now release the keys
		
		r.keyRelease(KeyEvent.VK_CONTROL);
				
		r.keyRelease(KeyEvent.VK_T);
		
		/*************MANAGE and SWITCH TO TABS*****************************/
		
		// first compute how many tabs are open in that browser window
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println(tabs);
		
		// method to switch to a new Tab and open a new URL
		
		driver.switchTo().window(tabs.get(1));
		
		driver.get("https://lms.simplilearn.com/dashboard");
		
		Thread.sleep(1000);
		
		driver.switchTo().window(tabs.get(2));
		
		driver.get("https://github.com/");
		
		
		// Use close() method to close only the current tab/window which is open
		
		// use quit() method to close all the tabs and browser window of the session
		
		
		//driver.close();
		
		driver.quit();


	}

}
