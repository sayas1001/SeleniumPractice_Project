package seleniumInstallation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class ButtonsAndCheckBoxes {

	public static void main(String[] args)  throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			// go to facebook
			driver.get("https://facebook.com");
			// click on create new account
			driver.findElement(By.linkText("Create new account")).click();
			Thread.sleep(1000);
			// check if the Male radio button selected or not
			WebElement maleRadio = driver.findElement(By.xpath("//label[text()='Male']"));
			if (maleRadio.isDisplayed()) {
				System.out.println("The male radio button is displayed!");
			}else {
				System.out.println("The male radio button is NOT displayed!");
			}
			
			if (maleRadio.isEnabled()) {
				System.out.println("The male radio button is enabled!");
			}else {
				System.out.println("The male radio button is NOT enabled!");
			}
			
			if(maleRadio.isSelected()) {
				System.out.println("Male radio button is already selected");
			}else {
				// if not, then select the Male radio button
				maleRadio.click();
			}
			
	}
}



