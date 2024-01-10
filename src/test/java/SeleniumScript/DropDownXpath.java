package SeleniumScript;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDownXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
		
		driver.manage().window().maximize();
		
		// write xpath for the main drop down not of the dropdown option
		
		// to handle drop down, selenium gives you a class Select class and method
		
		// Select dd = new Select(dropdownelement)));
		
		Select dd = new Select(driver.findElement(By.xpath("//select[@name='coffee']")));
		
		
		// selectByIndex(),selectByVisibleText(),selectByValue() methods to select a dropdown option
		
		dd.selectByIndex(1); // select with cream
		
		Thread.sleep(1500);
		
		dd.selectByValue("sugar");
		Thread.sleep(1500);
		
		dd.selectByVisibleText("Crisp (har har...)");
		
		
	// Get all the options from the dropdown and store it in a list object. Print it on console
		
		List<WebElement> li = dd.getOptions(); // this method returns a list of elements in the dropdown
		
		System.out.println("The size of the list" + li.size());
		
		for(WebElement e:li)
		{
			System.out.println(e.getText()); // get the each element in the list and print it.
		}


	}

}
