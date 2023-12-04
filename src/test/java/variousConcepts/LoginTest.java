package variousConcepts;

import org.openga.selenium.Webdriver;

public class LoginTest {

	Webdriver driver;
	
	public void init() {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.get()
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait
	
	}
	
	@Test
	public void loginTest() {
		
		//Store Elements 
		WebElement USERNAME_ELEMENT = driver.findElement(By.xpath("//*@id=\"user_name\")"));
		
		driver.findElement(By.xpath("//*[@id=\"))
		
	}
	
	
	
	
}
