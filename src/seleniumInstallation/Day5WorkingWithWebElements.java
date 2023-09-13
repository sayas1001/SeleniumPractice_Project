package seleniumInstallation;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Day5WorkingWithWebElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahar\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			// window maximize
			driver.manage().window().maximize();
			
			// implicitly wait - Implicitly wait - waits the page (html elements / dom structure) to be loaded properly.
			// That doen't mean your element to be visible on the screen.
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			// it doesn't wait 5 second if the page is loaded in 1 second, it just moves to next command.
			
			driver.navigate().to("https://google.com");
			WebElement inputBox = driver.findElement(By.name("q"));
			
			inputBox.sendKeys("Coffee mug", Keys.ENTER);
			Thread.sleep(2000);
			// navigate back to previous page
			driver.navigate().back();
			Thread.sleep(2000);
			// navigate forward to last visited page
			driver.navigate().forward();
			Thread.sleep(2000);
			driver.navigate().refresh();
		}
	}


