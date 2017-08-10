package Day12.com.automationtesting.dropdowndemo2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropdownWithoutSelect {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/KRISHNA VOLUME/drivers/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		// with Select Tag
		
				/*WebElement skillsDropdown = driver.findElement(By.cssSelector("#Skills"));
				skillsDropdown.click();
				
				List<WebElement> allSkills = driver.findElements(By.xpath("//select[@id='Skills']/option"));
				for (WebElement skill : allSkills) {
					if(skill.getText().equals("C")) {
						skill.click();
						break;
					}
				}*/
				
				//Thread.sleep(5000);
				
				
		selectValueFromDropdown("//*[@id='yearbox']","//*[@id='yearbox']/option","1920");
		selectValueFromDropdown("//*[@id='basicBootstrapForm']/div[11]/div[2]/select","//*[@id='basicBootstrapForm']/div[11]/div[2]/select/option","5");
		
		
		/*// Select year in DOB
				
				WebElement yearDropdown = driver.findElement(By.xpath("//*[@id='yearbox']"));
				yearDropdown.click();
				
				List<WebElement> allYears = driver.findElements(By.xpath("//*[@id='yearbox']/option"));
				for (WebElement year : allYears) {
					if(year.getText().equals("1920")) {
						year.click();
						break;
					}
				}
				
				
				// Select year in DOB
				
				WebElement monthDropdown = driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[11]/div[2]/select"));
				monthDropdown.click();
				
				List<WebElement> allMonths = driver.findElements(By.xpath("//*[@id='basicBootstrapForm']/div[11]/div[2]/select/option"));
				for (WebElement month : allMonths) {
					if(month.getText().equals("5")) {
						month.click();
						break;
					}
					
				}*/
		
		/*// without Select Tag
		
		WebElement languageDropdown = driver.findElement(By.xpath("//*[@id='msdd']"));
		languageDropdown.click();
		
		List<WebElement> allLanguages = driver.findElements(By.cssSelector("#msdd + div >ul >li >a"));
		for (WebElement language : allLanguages) {
			if(language.getText().equals("English")) {
				language.click();
				break;
			}
		}*/
	
	}
	
	public static void selectValueFromDropdown(String dropdownLocator, String dropdownValuesLocator, String desiredValue) {
		
		WebElement monthDropdown = driver.findElement(By.xpath(dropdownLocator));
		monthDropdown.click();
		
		List<WebElement> allMonths = driver.findElements(By.xpath(dropdownValuesLocator));
		
		for (WebElement month : allMonths) {
			if(month.getText().equals(desiredValue)) {
				month.click();
				break;
			}
			
		}
	}
}
