package day25.com.automationtesting.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePickerHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/KRISHNA VOLUME/drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Datepicker.html");

		driver.findElement(By.xpath("//*[@id='datepicker2']")).sendKeys("09/01/2020");

		Thread.sleep(5000);

		// driver.findElement(By.xpath("//*[@id='datepicker1']")).sendKeys("09/01/2020");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('datepicker1').value='09/01/2020'");
	}
}
