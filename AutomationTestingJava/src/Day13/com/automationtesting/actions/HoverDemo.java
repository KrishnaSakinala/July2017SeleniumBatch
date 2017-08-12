package Day13.com.automationtesting.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverDemo {

	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/KRISHNA VOLUME/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement switchToMenu = driver.findElement(By.cssSelector("ul[class='nav navbar-nav'] >li:nth-child(4) >a"));
		
		Actions action = new Actions(driver);
		action.moveToElement(switchToMenu).perform();
		
		WebElement webTableMenu = driver.findElement(By.xpath("//*[@id='header']/nav/div/div[2]/ul/li[3]/a"));
		webTableMenu.click();
		
		// Double clicking on Edit icon
		
		/*WebElement editIcon = driver.findElement(By.xpath("//*[@class='ui-grid-canvas']/div[1]/div/div[6]/user-click-select/div[1]/button/i"));
		//action.moveToElement(editIcon).doubleClick().build().perform();
		action.doubleClick(editIcon).perform();*/
		
		// Right Click on Delete icon
		
		WebElement deleteIcon = driver.findElement(By.xpath("//*[@class='ui-grid-canvas']/div[1]/div/div[6]/user-click-select/div[1]/del-click/button/i"));
		action.contextClick(deleteIcon).perform();
	}
}
