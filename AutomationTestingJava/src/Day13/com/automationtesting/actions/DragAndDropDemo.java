package Day13.com.automationtesting.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/KRISHNA VOLUME/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demoqa.com/droppable/");
		
		WebElement sourceElement = driver.findElement(By.xpath("//*[@id='draggableview']"));
		WebElement destElement = driver.findElement(By.xpath("//*[@id='droppableview']"));
		
		Actions action = new Actions(driver);
		//action.dragAndDrop(sourceElement, destElement).perform();
		action.clickAndHold(sourceElement).moveToElement(destElement).release().build().perform();
	}
}
