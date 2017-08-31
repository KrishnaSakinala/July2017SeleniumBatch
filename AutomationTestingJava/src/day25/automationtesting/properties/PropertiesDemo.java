package day25.automationtesting.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream(
				"/Users/krishnasakinala/git/July2017SeleniumBatch/AutomationTestingJava/environment.properties");
		Properties prop = new Properties();
		prop.load(fis);

		System.setProperty(prop.getProperty("geckodrivervalue"), prop.getProperty("geckodriverpath"));
		WebDriver driver = new FirefoxDriver();
		driver.get(prop.getProperty("applicationUrl"));

		driver.findElement(By.xpath(prop.getProperty("firstNameTextbox"))).sendKeys("Selenium");
		driver.findElement(By.xpath(prop.getProperty("lastNameTextbox"))).sendKeys("WebDriver");
		driver.findElement(By.xpath(prop.getProperty("addressTextarea"))).sendKeys("India");
		driver.findElement(By.xpath(prop.getProperty("emailAddress"))).sendKeys("selenium@gmail.com");
		driver.findElement(By.xpath(prop.getProperty("phoneNumber"))).sendKeys("1234567890");
	}
}
