package seleniumInstallation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kewan8_4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		testCase1();
	}
	
public static void testCase1() throws InterruptedException {
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//	Step 1: Go to "https://www.automationtesting.co.uk".
		
		String uRl = "https://www.automationtesting.co.uk";
		driver.get(uRl);
		driver.findElement(By.cssSelector(".close-cookie-warning > span")).click();
		
	
//			Step 2: Maximize browser and declare implicitly wait for 5 seconds.
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
//			Step 3: Locate the Element for "test store" store it in variable and click it.
		
		WebElement testStoreBtm = driver.findElement(By.xpath("//*[contains(text(),'Test Store')]"));
		testStoreBtm.click();
		Thread.sleep(3000);
		//			Step 4: Locate the search text box and store it in variable.
		WebElement searchBox = driver.findElement(By.className("ui-autocomplete-input"));
		
//			Step 5: Search for "Mug" and use SendKeys to Press ENTER.
		Thread.sleep(2000);
		searchBox.sendKeys("Mug");
		searchBox.sendKeys(Keys.ENTER);
		
//			Step 6: Navigate back to the previous page.
		Thread.sleep(2000);
		driver.navigate().back();
//			Step 7: Navigate forward to the recent page and refresh the page. 
		Thread.sleep(2000);
		driver.navigate().forward();
		
		//Refresh the page 
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
//			Step 8:Close the browser.
			driver.quit();
		
}
}