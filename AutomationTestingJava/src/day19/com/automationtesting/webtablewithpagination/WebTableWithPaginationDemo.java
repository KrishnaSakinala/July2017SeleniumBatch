package day19.com.automationtesting.webtablewithpagination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTableWithPaginationDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/KRISHNA VOLUME/drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/WebTable.html");

		Thread.sleep(2000);

		String count = driver.findElement(By.cssSelector(".ui-grid-pager-max-pages-number.ng-binding")).getText()
				.replace('/', ' ').trim();

		int totalPages = Integer.parseInt(count);

		// Printing all pages emails
		/*
		 * List<String> emails = new ArrayList<String>();
		 * 
		 * for (int i = 0; i < totalPages; i++) { List<WebElement> allEmails = driver
		 * .findElements(By.
		 * cssSelector(".ui-grid-canvas >div >div >div:nth-child(1) >div")); for
		 * (WebElement webElement : allEmails) {
		 * System.out.println(webElement.getText()); emails.add(webElement.getText()); }
		 * driver.findElement(By.cssSelector(".ui-grid-pager-next")).click(); }
		 * System.out.println("Total Emails: " + emails.size());
		 */

		// Find particular email and click on edit icon

		int position = 0;
		boolean isElementFound = false;

		for (int i = 0; i < totalPages; i++) {
			position = 0;
			List<WebElement> allEmails = driver
					.findElementsByCssSelector(".ui-grid-canvas >div >div >div:nth-child(1) >div");

			for (WebElement email : allEmails) {
				position++;
				if (email.getText().equals("lll@gmail.com")) {
					isElementFound = true;
					break;
				}
			}

			if (isElementFound) {
				break;
			}
			driver.findElement(By.cssSelector(".ui-grid-pager-next")).click();
		}
		Actions action = new Actions(driver);
		String cssForEditIcon = ".ui-grid-canvas >div:nth-child(" + position + ") >div >div:nth-child(6) .fa-pencil";
		WebElement editIcon = driver.findElement(By.cssSelector(cssForEditIcon));
		action.doubleClick(editIcon).perform();
	}

}
