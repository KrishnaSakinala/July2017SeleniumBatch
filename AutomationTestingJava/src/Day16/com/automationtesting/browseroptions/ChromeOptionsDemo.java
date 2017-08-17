package Day16.com.automationtesting.browseroptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/KRISHNA VOLUME/drivers/chromedriver");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.addArguments("window-size=1400,800");

		WebDriver driver = new ChromeDriver(options);

		driver.get("http://automationtesting.in/");
	}
}
