package seleniumInstallation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kewan8_4_TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		testCase2();
	}
	
public static void testCase2() throws InterruptedException {
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		    //Step 1: Go to http://teststore.automationtesting.co.uk
		
		driver.get("https://teststore.automationtesting.co.uk");
		driver.findElement(By.cssSelector(".close-cookie-warning > span")).click();
		
			//Step 2: Locate "test store" element and click on it. 
		WebElement testStoreBtm = driver.findElement(By.xpath("//*[contains(text(),'Test Store')]"));
		testStoreBtm.click();
		Thread.sleep(3000);
		
			//Step 3: Locate "Sign In button" and click on it.
		WebElement SignInButn = driver.findElement(By.xpath("//*[contains(text(),'Sign in')]"));
		
			//Step 4: Locate "No account? Create one here" and click on it.
		WebElement noAccountBtn = driver.findElement(By.xpath("//*[@data-link-action='display-register-form']"));
	
			//Step 5: Locate "Create an account" and check if it isDisplayed.
		
		
			//Step 6: Locate "Social title" radio buttons.
			//Step 7: Locate the three checkboxes before the save button.
			//Step 8: Check if the radio button isSelected, print statement to validate.  
			//Step 9: Check if the checkboxes isSelected, print statement to validate.  
		
		
	}

}
