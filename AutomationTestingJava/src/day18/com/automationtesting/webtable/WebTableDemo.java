package day18.com.automationtesting.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebTableDemo {

	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/KRISHNA VOLUME/drivers/chromedriver");
		driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/WebTable.html");

		/*
		 * // Printing emails System.out.println("****** Printing Emails ******");
		 * List<WebElement> allEmails = driver .findElements(By.
		 * cssSelector(".ui-grid-canvas >div >div >div:nth-child(1) >div"));
		 * 
		 * for (WebElement email : allEmails) { System.out.println(email.getText()); }
		 * 
		 * // Printing firstNames
		 * System.out.println("****** Printing FirstNames ******"); List<WebElement>
		 * allFNames = driver .findElements(By.
		 * cssSelector(".ui-grid-canvas >div >div >div:nth-child(2) >div"));
		 * 
		 * for (WebElement fName : allFNames) { System.out.println(fName.getText()); }
		 */

		// .ui-grid-canvas >div:nth-child(6) >div >div:nth-child(6) .fa-pencil

		WebElement itemsPerPageDropdown = driver
				.findElement(By.xpath("html/body/section/div[1]/div/div[3]/div[2]/div[1]/div[2]/select"));
		Select select = new Select(itemsPerPageDropdown);
		select.selectByVisibleText("20");

		int noOfRows = driver.findElements(By.cssSelector(".ui-grid-canvas >div")).size();

		if (noOfRows == 20) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

		int emailPosition = emailPositionInTable("HSR@dbeaa.com");
		System.out.println("Position of the email is: " + emailPosition);

		editTableUsingEmail("HSR@dbeaa.com");

		/*
		 * int position = 0;
		 * 
		 * allEmails = driver.findElements(By.
		 * cssSelector(".ui-grid-canvas >div >div >div:nth-child(1) >div"));
		 * 
		 * for (WebElement email : allEmails) { position++; if
		 * (email.getText().equals("abcdefgh2@gmail.com")) { break; } } Actions action =
		 * new Actions(driver);
		 * 
		 * String cssForEditIcon = ".ui-grid-canvas >div:nth-child(" + position +
		 * ") >div >div:nth-child(6) .fa-pencil";
		 * 
		 * WebElement editIcon = driver.findElement(By.cssSelector(cssForEditIcon)); //
		 * action.moveToElement(editIcon).doubleClick().build().perform();
		 * action.doubleClick(editIcon).perform();
		 */

	}

	public static void editTableUsingEmail(String emailID) {
		int position = 0;

		List<WebElement> allEmails = driver
				.findElements(By.cssSelector(".ui-grid-canvas >div >div >div:nth-child(1) >div"));

		for (WebElement email : allEmails) {
			position++;
			if (email.getText().equals(emailID)) {
				break;
			}
		}
		Actions action = new Actions(driver);

		String cssForEditIcon = ".ui-grid-canvas >div:nth-child(" + position + ") >div >div:nth-child(6) .fa-pencil";

		WebElement editIcon = driver.findElement(By.cssSelector(cssForEditIcon));
		action.doubleClick(editIcon).perform();
	}

	public static int emailPositionInTable(String emailID) {
		int position = 0;

		List<WebElement> allEmails = driver
				.findElements(By.cssSelector(".ui-grid-canvas >div >div >div:nth-child(1) >div"));

		for (WebElement email : allEmails) {
			position++;
			if (email.getText().equals(emailID)) {
				break;
			}
		}
		return position;
	}

}
