package Day6;

public class WebDriverDemo {
	
	static WebDriver driver;
	
	public static void main(String[] args)
	{
		//FirefoxDriver driver = new FirefoxDriver();
		
		//ChromeDriver driver1 = new ChromeDriver();
		if(driver == driver) // not exactly this
		{
			driver = new FirefoxDriver();
		}
		else
		{
			driver = new ChromeDriver();
		}
		
		driver.get();
		driver.getTitle();
	}

}
