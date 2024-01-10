package SeleniumScript;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// go to webpage, fetch its URL and title and store in a DB
		driver.get("https://www.facebook.com/");
		
		String URL = driver.getCurrentUrl();
		String title = driver.getTitle();
		
                    // send the URL and title to the DB
		
		String dburl = "jdbc:mysql://localhost:3306/seleniumtest";
		String username = "root";
		String password = "Samyak@123";
		
       Class.forName("com.mysql.cj.jdbc.Driver");
      
       Connection con = DriverManager.getConnection(dburl, username, password);
      
       PreparedStatement ps = con.prepareStatement("insert into webtest values(?,?)");
       ps.setString(1, title);
       ps.setString(2, URL);
       ps.executeUpdate();
      
      
		driver.navigate().to("https://www.selenium.dev/downloads/");
		
	URL = driver.getCurrentUrl();
		title = driver.getTitle();
		
		
	   ps = con.prepareStatement("insert into webtest values(?,?)");
       ps.setString(1, title);
       ps.setString(2, URL);
       ps.executeUpdate();
	
		
       con.close();

		

	}

}
