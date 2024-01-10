package SeleniumScript;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ScreesnshotJavaScriptExecution {

	public static WebDriver driver;
	
	public static void drawborder(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
		
	}
	public static void takescreenshot_method(String filepath) throws IOException
	{
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File(filepath);
		FileUtils.copyFile(srcFile, destFile);
	}
	public static void main(String[] args)  throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
   
		driver.get("https://www.opera.com/download");
		
		Thread.sleep(1000);
		
		WebElement e1 = driver.findElement(By.xpath("//div[@class='cookie-consent__basic cookie-consent__inner']/descendant::span[3]"));
		drawborder(e1,driver);
		
		takescreenshot_method("./Screenshot/opera2.png");
	}
}
