package SeleniumScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver(); 
			
			driver.get("https://www.selenium.dev/"); 
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			String title = driver.getTitle();
			
			System.out.println("The title of page-1 is : " + title);
			
			// Fetch the URL of the webpage
			 String url = driver.getCurrentUrl();
			
			 System.out.println("The URL of page is : " + url);
			
			 // Methods to naviagate form one webpage to another webpage
			
			driver.navigate().to("https://www.selenium.dev/downloads/") ;
			
		    String title1 = driver.getTitle();
			
			System.out.println("The title of webpage-2 is : " + title1);
				
			// Again naviage to  webpage 3
			
			driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html") ;
			
	        String title2 = driver.getTitle();
			
			System.out.println("The title of webpage-3 is : " + title2);
			
			// Navigation methods : to go forward and backword on browser window
			
			driver.navigate().back();
			
			  String title3 = driver.getTitle();
				
				System.out.println("The title of webpage is : " + title3);
			
			driver.navigate().forward();
			
			  String title4 = driver.getTitle();
				
					System.out.println("The title of webpage is : " + title4);
			
			driver.navigate().refresh();
				
				driver.close();

		

	}

}
