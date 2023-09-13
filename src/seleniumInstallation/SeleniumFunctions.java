package seleniumInstallation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFunctions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://ebay.com"); 


		// get title that is stored already in the library
		
		String webTitle = driver.getTitle();
		System.out.println("Title is: " + webTitle);
		
		
		
           //find the Create New Account button and click on it
		WebElement newAccountBtn = driver.findElement(By.linkText("Create new account"));
		newAccountBtn.click();
		
		// Thread.sleep - stops the java code execution for certain amount of time given.
		
           //find the FirstName,  LastName, Email and Password fields and type Automation
		WebElement firstName = driver.findElement(By.name("firstname"));
		WebElement lastName = driver.findElement(By.name("lastname"));
		WebElement email = driver.findElement(By.name("reg_email__"));
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		firstName.sendKeys("automation");
		lastName.sendKeys("automation");
		email.sendKeys("automation");
		password.sendKeys("automation");
           //find the Sign Up button and click on it.
		WebElement signupBtn = driver.findElement(By.name("websubmit"));
		signupBtn.click();
		
		
		// get current url
		System.out.println("Current URL is: " + driver.getCurrentUrl());
		
		
		// get text of element
		WebElement nonUserNoticeLink = driver.findElement(By.id("non-users-notice-link"));
		String noticeLinkText = nonUserNoticeLink.getText();
		System.out.println("Notice LInk Text Is: " + noticeLinkText);
		
		
		// close the browser - closes the current browser, if there are multiple tabs open, it only closes the current one
		driver.close();
		
		// quit the driver  - shut down everything.
		driver.quit();
	}

}
