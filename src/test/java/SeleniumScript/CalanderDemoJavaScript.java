package SeleniumScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalanderDemoJavaScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");
		
		Thread.sleep(1000);
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("document.getElementById('src').value='Paris Beauvais Airport,Paris,France'");
		
		js.executeScript("document.getElementById('onward_cal').value='02-Feb-2024'");


	}

}
