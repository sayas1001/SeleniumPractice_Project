package seleniumInstallation;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class KewanAlertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		alertDemo22();
	}
		public static void alertDemo22() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			//Go to ‘https://demo.automationtesting.in/Alerts.html’
			driver.get("https://demo.automationtesting.in/Alerts.html");
			driver.findElement(By.className("btn-danger")).click();
			
			Alert alert = driver.switchTo().alert();
			alert.accept();
			
//				Click the button to display an alert box.
			
			
//				Cancel or dismiss the alert.
			
	}

}
