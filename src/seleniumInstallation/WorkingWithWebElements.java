package seleniumInstallation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class WorkingWithWebElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	
		WebDriver driver = new ChromeDriver();
		// window maximize
		driver.manage().window().maximize();
		
		// implicitly wait - Implicitly wait - waits the page (html elements / dom structure) to be loaded properly.
		// That doen't mean your element to be visible on the screen.
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// it doesn't wait 5 second if the page is loaded in 1 second, it just moves to next command.
		
		// navigate to google.com
		driver.get("https://google.com");
		// search for coffee mug
		WebElement inputBox = driver.findElement(By.name("q"));
		inputBox.sendKeys("Coffee Mug");
		// hit enter
		inputBox.sendKeys(Keys.ENTER);
		// find the search box again
		WebElement searchInputBox = driver.findElement(By.name("q"));
		// select the text in it
		searchInputBox.sendKeys(Keys.chord(Keys.COMMAND, "a"));
		Thread.sleep(2000);
		// delete the selected text
		searchInputBox.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		// search new item
		searchInputBox.sendKeys("Pretty coffee mug", Keys.ENTER);
		
		
	}
	
	
	
	
}

