package seleniumInstallation;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class AlertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			// go to website
			driver.get("http://practice.primetech-apps.com/practice/alerts");
			
			// click on Alert button
			driver.findElement(By.id("alert")).click();
			
			//wait until the alert to be present
			WebDriverWait letswait = new WebDriverWait(driver, Duration.ofSeconds(5));
			letsWait.until(ExpectedConditions.alertIsPresent());
			
			// get the alert text and confirm it equals to "do you confirm ?"
			Alert handle = driver.switchTo().alert();
			
			String alertText = handle.getText();
			if (alertText.equals("do you confirm ?")) {
				System.out.println("Alert text match.");
			}else {
				System.out.println("Alert text does NOT match.");
			}
			
			// click ok button
			handle.accept();
			
		}
	}

