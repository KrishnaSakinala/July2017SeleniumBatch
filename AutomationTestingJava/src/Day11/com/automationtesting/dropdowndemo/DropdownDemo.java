package Day11.com.automationtesting.dropdowndemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "/KRISHNA VOLUME/drivers/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://demo.automationtesting.in/Register.html");
	
	WebElement skillsDropdown = driver.findElement(By.xpath("//*[@id='Skills']"));
	Select skills = new Select(skillsDropdown);
	
	skills.selectByIndex(5);
	skills.selectByValue("APIs");
	skills.selectByVisibleText("APIs");
	Thread.sleep(3000);
	//skills.deselectByIndex(5); // This will work only for multi select
	
	// Print the count of elements in dropdown
	List<WebElement> skillsValues = skills.getOptions();
	System.out.println("Total values in the skills dropdown: "+ skillsValues.size());
	
	// Print all values from the dropdown
	for (WebElement webElement : skillsValues) {
		System.out.println(webElement.getText());
	}
	
	String selectedValue = skills.getFirstSelectedOption().getText();
	System.out.println("Selected Dropdown Value: "+ selectedValue);
	
	}
}
