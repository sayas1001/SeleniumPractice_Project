package seleniumInstallation;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Day6Task2 {

	
	public static void main(String[] args)throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahar\\Downloads\\chromedriver_win32\\chromedriver.exe");
			//Test case 2.
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
	        //go to http://practice.primetech-apps.com/practice/radio-button
			driver.get("http://practice.primetech-apps.com/practice/radio-button");
	        //Find those available radio buttons.
			List<WebElement> radioButtons = driver.findElements(By.cssSelector(".form-check-input"));
	        //Check if it’s displayed and enabled,
			//if true, check if it’s selected, if false select the button and check if it’s selected.
			for (WebElement radio : radioButtons) {
				if (radio.isDisplayed() && radio.isEnabled()) {
					System.out.println("Radio button is enabled and displayed!");
					if (radio.isSelected()) {
						System.out.println("Radio button is selected!");
					}else {
						radio.click();
					}
				}else {
					System.out.println("Radio button is NOT enabled and displayed!");
				}
				
				if (radio.isSelected()) {
					System.out.println("Radio button is selected now!");
				}else {
					System.out.println("Radio button is NOT selected now!");
				}
				Thread.sleep(1000);
			}
			

		}
	}


