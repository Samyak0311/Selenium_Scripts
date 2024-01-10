package SeleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertCookies {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
   
		driver.get("https://www.opera.com/download");
		
		Thread.sleep(1000);
		
		WebElement e1 = driver.findElement(By.xpath("//div[@class='cookie-consent__basic cookie-consent__inner']/descendant::span[3]"));
		e1.click();
		



	}

}
