package seleniumInstallation;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Day6Elements {

	public static void main(String[] args)throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
			// Test case 3.
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        // go to http://practice.primetech-apps.com/practice/check-box
			driver.get("http://practice.primetech-apps.com/practice/check-box");
	        // find the checkboxes and verify if it’s displayed, if true, then verify if it’s enabled, if true, 
			// verify if it’s selected, if false, then check the boxes. Then verify if it’s checked.
			List<WebElement> checkBoxes = driver.findElements(By.className("form-check-input"));
			for (WebElement checkbox : checkBoxes) {
				if (checkbox.isDisplayed()) {
					System.out.println("Checkbox is displayed.");
					if (checkbox.isEnabled()) {
						System.out.println("Checkbox is enabled.");
						if (checkbox.isSelected()) {
							System.out.println("Checkbox is selected.");
						}else {
							checkbox.click();
						}
					}else {
						System.out.println("Checkbox is NOT enabled.");
					}
				}else {
					System.out.println("Checkbox is NOT displayed.");
				}
				
				if (checkbox.isSelected()) {
					System.out.println("Checkbox is selected now.");
				}else {
					System.out.println("Checkbox is still NOT selected.");
				}
				Thread.sleep(1000);
			}
	       
		}
	}


