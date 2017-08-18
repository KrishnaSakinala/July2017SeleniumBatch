package day17.com.automationtesting.keyboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImpliciteWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/KRISHNA VOLUME/drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		driver.get("http://www.shopclues.com/");
		driver.findElement(By.xpath("//*[@id='sign-in']/a")).click();
		// Thread.sleep(60000);

		driver.findElement(By.xpath("//*[@id='main_user_login']")).sendKeys("kkabap@gmail.com");
		driver.findElement(By.xpath("//*[@id='main_user_login']")).sendKeys(Keys.TAB);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='login']/form/fieldset/div[3]/input")).sendKeys("india123");

		driver.findElement(By.xpath("//*[@id='login']/form/fieldset/div[3]/input")).sendKeys(Keys.ENTER);

	}

}
