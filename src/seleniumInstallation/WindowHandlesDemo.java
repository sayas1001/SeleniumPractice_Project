package seleniumInstallation;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		windowHandlesDemo();
	}
		
		
		public static void windowHandlesDemo() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			// got to this website
			driver.get("http://practice.primetech-apps.com/practice/browser-windows");
			
			// get the window id and store it in a variable
			String mainWindowID = driver.getWindowHandle(); // gets the window id of the current window that the driver is on
		
			// print it out
			System.out.println(mainWindowID);
			
			// click on new tab button
			driver.findElement(By.id("newTab")).click();
			
			// get the all window ids and store them into a set of string
			Set<String> windowIds =  driver.getWindowHandles();
			
			// print them out
			// switch to the new window / child window
			for (String singleWindowId : windowIds) {
				// if the singleWindowId is not equal to main windowId, then switch
				if (!singleWindowId.equals(mainWindowID)) {
					driver.switchTo().window(singleWindowId);
				}
			}
			
			// verify that there is a text as 'This is a new tab'
			WebElement newTabText = driver.findElement(By.xpath("//p[text()='This is a new tab']"));
			if (newTabText.isDisplayed()) {
				System.out.println("We are on the child window");
			}else {
				System.out.println("We are not on the child window yet");
			}
			
			// close the new window
			driver.close();
			
			// driver will not automatically switch between the windows, we have to command it
			// switch back to main window
			
			driver.switchTo().window(mainWindowID);
			
			
			if (driver.findElement(By.xpath("//h3[text()='Browser Windows']")).isDisplayed()) {
				System.out.println("we are back to main window");
			}else {
				System.out.println("I am lost between the windows");
			}
	}

}
