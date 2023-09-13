package seleniumInstallation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class WebDriverWait {

	public WebDriverWait(WebDriver driver, int i) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			// implicitlyWait is for the page objects/elements to be loaded.
			
			// go to etsy.com
			driver.get("https://etsy.com");
			
			// click on signin button
			driver.findElement(By.cssSelector(".select-signin")).click();
			
			// wait until the register button is visible
			   // create an object of webDriverWait class
			WebDriverWait letswait = new WebDriverWait(driver, 5);
			
			   // wait until the visibility of the register button
			
			// Thread.sleep(1000);  - from now on, we don't use thread.sleep unless we want to see what is going on.
			letswait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".select-register")));
			
			// click on the register button
			driver.findElement(By.cssSelector(".select-register")).click();
			
			// wait until the email field is visible
			letswait.until(ExpectedConditions.textToBe(By.id("join-neu-overlay-title"), "Create your account"));
			
			// enter email
			driver.findElement(By.name("email")).sendKeys("jon.dow@gmail.com");
			
			// enter name
			driver.findElement(By.name("first_name")).sendKeys("jon");
			
			// enter password
			driver.findElement(By.name("password")).sendKeys("Hfjkhsdft");
			
			// wait until the register button to be clickable
			//letswait.until(ExpectedConditions.elementToBeClickable(By.name("submit_attempt")));
			
			
			// click on the register button
			driver.findElement(By.name("submit_attempt")).click();
			
			
		}
	}


