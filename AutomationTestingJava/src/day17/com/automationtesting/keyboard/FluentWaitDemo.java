package day17.com.automationtesting.keyboard;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/KRISHNA VOLUME/drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.shopclues.com/");
		driver.findElement(By.xpath("//*[@id='sign-in']/a")).click();

		Wait wait = new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='main_user_login']")));

		driver.findElement(By.xpath("//*[@id='main_user_login']")).sendKeys("kkabap@gmail.com");
		driver.findElement(By.xpath("//*[@id='main_user_login']")).sendKeys(Keys.TAB);

		driver.findElement(By.xpath("//*[@id='login']/form/fieldset/div[3]/input")).sendKeys("india123");

		driver.findElement(By.xpath("//*[@id='login']/form/fieldset/div[3]/input")).sendKeys(Keys.ENTER);

	}

}
