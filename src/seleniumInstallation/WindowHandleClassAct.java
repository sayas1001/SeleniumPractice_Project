package seleniumInstallation;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleClassAct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	windowHandlesDemoWithIterator();
	}
	public static void windowHandlesDemoWithIterator() {
		//Test case 2 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//go to http://practice.primetech-apps.com/practice/browser-windows
		driver.get("http://practice.primetech-apps.com/practice/browser-windows");
		
		//1. Get the main window ID and store it in a String called mainWindowId, 
		String mainWindowId = driver.getWindowHandle();
		
		//2. Click on the 'New Tab' button
		driver.findElement(By.id("newTab")).click();
		
		//3. Get window IDs and store it into a Set
		Set<String> windowIds = driver.getWindowHandles();
		
		//4. Get the first window ID from the Set and Verify it matches with the main window id in step 1.  
		   
		Iterator<String> iterate = windowIds.iterator();
		
		//  | item1 | item2 |
		String firstWindowId = iterate.next();
		
		System.out.println("first window id: " + firstWindowId);
		if (firstWindowId.equals(mainWindowId)) {
			System.out.println("First window id match to main window id");
		}else {
			System.out.println("First window id Not match to main window id");
		}
		
		//Then get the second window id and store it in variable called secondWindowId.
		String secondWindowId = iterate.next();
		System.out.println("second window id: " + secondWindowId);
		
		//5. Switch to the second window
		driver.switchTo().window(secondWindowId);
		
		//6. verify that there is a text as 'This is a new tab'
		
		WebElement newTabText = driver.findElement(By.xpath("//p[text()='This is a new tab']"));
		if (newTabText.isDisplayed()) {
			System.out.println("We are on the child window");
		}else {
			System.out.println("We are not on the child window yet");
		}
		
		//7. Close the window, 
		driver.close();
		// Switch back to the main window, 
		driver.switchTo().window(mainWindowId);
		
		//Verify you are on the main window. 
		if (driver.findElement(By.xpath("//h3[text()='Browser Windows']")).isDisplayed()) {
			System.out.println("we are back to main window");
		}else {
			System.out.println("I am lost between the windows");
		}
	}
}

