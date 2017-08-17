package Day16.com.automationtesting.browseroptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class FirefoxOptionsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/KRISHNA VOLUME/drivers/geckodriver");

		// firefox profile
		// windows - goto run -> firefox.exe -p
		// mac - terminal -> /Applications/Firefox.app/Contents/MacOS/firefox-bin
		// --profilemanager

		ProfilesIni availableProfiles = new ProfilesIni();
		FirefoxProfile profile = availableProfiles.getProfile("Selenium");
		FirefoxOptions option = new FirefoxOptions().setProfile(profile);
		WebDriver driver = new FirefoxDriver(option);

		driver.get("http://automationtesting.in/");
	}
}
