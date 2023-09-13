package seleniumInstallation;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropdownButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahar\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		
		selectDemo();
	}
		
		public static void selectDemo() throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			// go to http://practice.primetech-apps.com/practice/select-menu
			driver.get("http://practice.primetech-apps.com/practice/select-menu");
			
			// select French from the language dropdown
			// whenever you get a dropdown which started with select tagname in HTML, 
			// that's the time that you can use this select class.
			
			WebElement languageDropdown = driver.findElement(By.id("language"));
			Select letsSelect = new Select(languageDropdown);
			
			// get all the options and get text print them
			List<WebElement> allOptions = letsSelect.getOptions();
			for (WebElement option : allOptions) {
				System.out.println(option.getText());
			}
			
			// get first selected option
			WebElement firstSelectedOption = letsSelect.getFirstSelectedOption();
			System.out.println("First selected item is: " + firstSelectedOption.getText());
			Thread.sleep(2000);
			
			
			// select by visible text - most commonly used one
			letsSelect.selectByVisibleText("French");
			Thread.sleep(2000);
			
			// get first selected option here
			System.out.println("After selecting French, first selected option is: " 
			+ letsSelect.getFirstSelectedOption().getText());
			
			// select by index
			letsSelect.selectByIndex(4);
			
			Thread.sleep(2000);
			
			// select by value
			letsSelect.selectByValue("Spanish");
			Thread.sleep(2000);
			
			// deselect option only works with multi-select dropdown
			
			
			// select class only works with a dropdown which is created by Select tag in html
			// if the dropdown is not created with select tag in HTML, we just treat the dropdown as a regular element.
			// we find the dropdown element, and click on it to expand, then find the value we wanna select, 
			// click on it.
			
			
		}
	}


