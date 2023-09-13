package seleniumInstallation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Day5ClassActivity1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// TODO Auto-generated method stub
		// Test case 
		
				WebDriver driver = new ChromeDriver();
			    // maximize browser
				driver.manage().window().maximize();
			    // declare implicitly wait for 5 seconds
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			    // go to amazon.com
				driver.get("https://amazon.com");
			    // Search coffee mug.
				WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
				searchBox.sendKeys("Coffee mug", Keys.ENTER);
				Thread.sleep(1000);
			    // Navigate back then search pretty coffee mug. 
				driver.navigate().back();
				searchBox = driver.findElement(By.id("twotabsearchtextbox"));
				searchBox.sendKeys("Pretty coffee mug", Keys.ENTER);
				
				// driver is page specific tool, whenever driver moves to a different page, driver loses the references to the 
				// elements within the previous page.
				
				Thread.sleep(1000);
			    // Navigate back then navigate forward
				driver.navigate().back();
				Thread.sleep(1000);
				driver.navigate().forward();
			    // Refresh the page.
				driver.navigate().refresh();
			}
	}


