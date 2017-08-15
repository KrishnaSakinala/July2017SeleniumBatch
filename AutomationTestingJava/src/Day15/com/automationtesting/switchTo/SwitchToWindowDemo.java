package Day15.com.automationtesting.switchTo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchToWindowDemo {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/KRISHNA VOLUME/drivers/geckodriver");
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		WebElement tabbedButton = driver.findElement(By.xpath("//*[@id='Tabbed']/a/button"));
		tabbedButton.click();
		
		//Thread.sleep(10000);
		
		/*Set<String> windowIds = driver.getWindowHandles();
		Iterator<String> iter = windowIds.iterator();
		String mainWindow = iter.next();
		String childWindow = iter.next();
		
		Thread.sleep(10000);
		
		driver.switchTo().window(childWindow);*/
		
		Thread.sleep(10000);
		
		switchToWindow(2);
		
		String childWindowtitle = driver.getTitle();
		System.out.println("WebPage title is : " + childWindowtitle);
		
		//driver.switchTo().window(mainWindow);
		
		driver.close();
		
		Thread.sleep(10000);
		
		switchToWindow(1);
		
		String mainWindowtitle = driver.getTitle();
		System.out.println("WebPage title is : " + mainWindowtitle);
		
		driver.quit();

	}
	
	public static void switchToWindow(int index) {
		String windowId = null;
		Set<String> windowIds = driver.getWindowHandles();
		Iterator<String> iter = windowIds.iterator();
		
		for(int i = 1; i<=index; i++) {
			windowId = iter.next();
		}
		driver.switchTo().window(windowId);
	}

}
