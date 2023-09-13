package seleniumInstallation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ActionsDemoClass();
	}
	
	public static void ActionsDemoClass() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	Actions action = new Actions(driver);
	
	// got to http://practice.primetech-apps.com/practice/drag-and-drop
	driver.get("http://practice.primetech-apps.com/practice/drag-and-drop");
	// drag the text to empty box
	
	WebElement sourceTextElement = driver.findElement(By.id("text"));
	WebElement sourceTextAreaElement = driver.findElement(By.id("textarea"));
	WebElement sourceNumberElement = driver.findElement(By.id("Number"));
	

	WebElement targetBoxElement = driver.findElement(By.id("dropzone"));
	
	// remember: whenever you use actions function, you need to finish the function with perform() function.
	
	// .perform() - can be used alone when there is only one actions functions used.
	// .build().perform() - is for more than one chained actions functions.
	action.dragAndDrop(sourceTextElement, targetBoxElement).build().perform();
	action.dragAndDrop(sourceTextAreaElement, targetBoxElement).build().perform();
	action.dragAndDrop(sourceNumberElement, targetBoxElement).build().perform();
	
	
	


}
}

