package seleniumInstallation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Day6Task1 {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

			// Test case 1.
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
	        // go to https://indeed.com
			driver.get("https://indeed.com");
	        // check if the search fields are enabled and displayed.
			WebElement whatField = driver.findElement(By.id("text-input-what"));
			WebElement whereField = driver.findElement(By.id("text-input-where"));
			if (whatField.isEnabled() && whatField.isDisplayed()) {
				System.out.println("What search field is displayed and enabled!");
			}else {
				System.out.println("What search field is NOT displayed and enabled!");
			}
			
			if (whereField.isDisplayed() && whereField.isEnabled()) {
				System.out.println("Where search field is displayed and enabled!");
			}else {
				System.out.println("Where search field is NOT displayed and enabled!");
			}
			

		}
	}


