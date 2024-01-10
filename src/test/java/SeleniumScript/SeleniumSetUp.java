package SeleniumScript;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSetUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.selenium.dev/"); 
				
		driver.close(); 
	}

}
