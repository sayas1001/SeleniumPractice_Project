package seleniumInstallation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Day6HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //maximizes screen
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //wait time
		
		// go to amazon.com  
		driver.get("https://amazon.com");
		
		 //click on signin 
		  driver.findElement(By.xpath("//span[text()=\"Hello, sign in\"]")).click();
		

		 //verify that you are on sign in page (use isDisplayed- either by sign-in text or email field).
		if (driver.findElement(By.id("ap_email")).isDisplayed());
		System.out.println("I am on the sign in page");
	} else  {
		System.out.println("I am not on the sign in page");
	}
	
		//navigate back and navigate forward
		driver.navigate().back() ;	
		Thread.sleep(1000);
		driver.navigate(forward);
		
		//verify that youre on sign in page (either by text or email field1)
		if (driver.findElement(By.id("ap_email")).isDisplayed());
		System.out.println("I am on the sign in page fpor the second time"); 
	
	}else 
		System.out.println("I am on the sign in page for the second ");
	
	}

}
