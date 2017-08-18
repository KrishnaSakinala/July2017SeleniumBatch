package day17.com.automationtesting.keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/KRISHNA VOLUME/drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.shopclues.com/");
		driver.findElement(By.xpath("//*[@id='sign-in']/a")).click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='main_user_login']")));

		driver.findElement(By.xpath("//*[@id='main_user_login']")).sendKeys("kkabap@gmail.com");
		driver.findElement(By.xpath("//*[@id='main_user_login']")).sendKeys(Keys.TAB);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='login']/form/fieldset/div[3]/input")).sendKeys("india123");

		driver.findElement(By.xpath("//*[@id='login']/form/fieldset/div[3]/input")).sendKeys(Keys.ENTER);
	}

}
