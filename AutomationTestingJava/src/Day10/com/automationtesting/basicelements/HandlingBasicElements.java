package Day10.com.automationtesting.basicelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingBasicElements {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/KRISHNA VOLUME/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		// Handling Text box
		WebElement firstNameTextbox = driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input"));
		firstNameTextbox.sendKeys("Selenium");
		Thread.sleep(5000); // pausing the execution for 5 seconds
		firstNameTextbox.clear();
		Thread.sleep(5000); // holds/pause the execution for 5 seconds
		firstNameTextbox.sendKeys("WebDriver");
		
		// Handling Text area
		WebElement addressTextarea = driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[2]/div/textarea"));
		addressTextarea.sendKeys("Hyderabad,\nIndia");
		
		// Handling check box
		WebElement moviesCheckbox = driver.findElement(By.xpath("//*[@id='checkbox2']"));
		
		if(!moviesCheckbox.isSelected()) {
			moviesCheckbox.click();
		}
		
		Thread.sleep(5000);
		
		if(!moviesCheckbox.isSelected()) {
			moviesCheckbox.click();
		}	
		
		// Handling radio button
		WebElement femaleRadioButton = driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[5]/div/label[2]/input"));
		femaleRadioButton.click();
		
		// Handling Buttons
		WebElement submitButton = driver.findElement(By.xpath("//*[@id='submitbtn']"));
		submitButton.click();
	}

}
