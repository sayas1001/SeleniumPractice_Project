package seleniumInstallation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithLocators {

	public static void main(String[] args) {
		
		
		// WebDriver is an interface being a reference type
		// ChromeDriver is a class being an object type here.
		WebDriver driver = new ChromeDriver();
		
		// find by name
		
		driver.get("https://amazon.com"); 
		// find the email field and type automation
		WebElement emailField = driver.findElement(By.name("email"));
		emailField.sendKeys("automation");
		// find the password field and type automation
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("automation");
		// find the login button and click on it
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		
		// validate the user is not logged in
		// and user sees this message 
		// "The email or mobile number you entered isn’t connected to an account. Find your account and log in."
		
		
		
		// find by linktext
		
		// in order to use findBy linkText, the element has to be a tag (anchor tag/ link tag)
		driver.get("https://amazon.com");
		// find clinic link using linkText and click on it
		WebElement backToSchoolLink = driver.findElement(By.linkText("Clinic"));
		backToSchoolLink.click();
		
		// find by partial link text
		
		driver.get("https://amazon.com");
		// find Discover more footwear on Shopbop link using partial link text and click on it
		WebElement partialText = driver.findElement(By.partialLinkText("footwear on Shopbop"));
		partialText.click();
		
		
		
		// find by className
		
		driver.get("https://amazon.com");
		WebElement off = driver.findElement(By.className("nav-swm-text"));
		off.click();

				
				
				
				
	}

}
