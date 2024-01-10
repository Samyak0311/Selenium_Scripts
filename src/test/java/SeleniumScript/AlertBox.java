package SeleniumScript;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertBox {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
   
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		// just click on Sign in button without enter username and password. An alert box will be displayed
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
// to perform actions on alertbox, switch to it
		
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		
		// get the text from alert
		
		String text = a.getText();
		System.out.println(text);
		
		// press ok button
		
		a.accept();


	}

}
