package seleniumInstallation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class FindElementDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		// TODO Auto-generated method stub
			// Test case 1
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    // go to https://saucedemo.com
			driver.get("https://saucedemo.com");
		    // log in with username = standard_user   password = secret_sauce
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
		    // find all the results and get them in a list, and print the size of the list.
			List<WebElement> items = driver.findElements(By.cssSelector(".inventory_item"));
			int sizeOfList = items.size();
			System.out.println(sizeOfList + " Items available on the page.");
			
		}
	}


