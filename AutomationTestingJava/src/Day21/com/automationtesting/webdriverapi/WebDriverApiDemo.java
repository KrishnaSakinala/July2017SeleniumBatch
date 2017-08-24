package Day21.com.automationtesting.webdriverapi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverApiDemo {

	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/KRISHNA VOLUME/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://demo.automationtesting.in/Register.html");

		System.out.println("The current url is: " + driver.getCurrentUrl());
		System.out.println("The current webpage title is: " + driver.getTitle());
		System.out.println("The current webpage source is:" + driver.getPageSource());

		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
}
