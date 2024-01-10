package SeleniumScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		// Click on the text box field , so that the calender is displayed.
		
		driver.findElement(By.xpath("//div[@class='date-posts']/descendant::input")).click();
		
		Thread.sleep(1500);
		
		// On the calander lets inpsect the month and year tab and print the month and year text
		
		String monthyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		
		System.out.println(monthyear);  // January 2024
		
		// Split the String monthyear in to 2 new strings
		// Create a new array object that will store the string monath and year
		
		String my[] = monthyear.split(" "); // split based on the space
		
		String month = my[0]; //January
		String year = my[1]; //2024
		
		// write a loop
		
		while(!(month.equals("August") && year.equals("2025")))
		{
			//click on the next button in the calender
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			
			// come out of the loop
			monthyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			
		month = monthyear.split(" ")[0];
	    year = monthyear.split(" ")[1];
			
		}
		
		// select the date : //a[text()='8']
		//table[@class='ui-datepicker-calendar']/descendant::a[8]
		
		
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/descendant::a[8]")).click();


	}

}
