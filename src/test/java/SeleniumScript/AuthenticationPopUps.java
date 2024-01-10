package SeleniumScript;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AuthenticationPopUps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
      
       // Whenever there is a URL that open with the authencation pop up then we have to pass the username
       // and password with the URL itself
       // Synatx:
       // driver.get("https://username:password@URL");
   
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");


	}

}
