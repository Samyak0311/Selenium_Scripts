package SeleniumScript;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ScreesnshotDemo1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
   
		driver.get("https://www.opera.com/download");
		
		// take screeshot of current window and save it in a file
		
		// Use class TakesScreenshot and method -> getScreenshoAs
		
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Screesnhot is saved in the object srcFile
		
		// In the current project --> create a folder Screenshot--> create a file with name opera1.png
		File destFile = new File("./Screenshot/opera1.png");
		
		FileUtils.copyFile(srcFile, destFile);
		
		/*Copies a file to a new location preserving the file date.
		This method copies the contents of the specified source file
		to the specified destination file. The directoryholding the destination file
		 is created if it does not exist. If the destination file exists,
		 then this methodwill overwrite it */


	}

}
