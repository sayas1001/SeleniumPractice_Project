package seleniumInstallation;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class cLassActivity2WorkingWithElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

 //go to https://saucedemo.com 
		driver.get("https://saucedemo.com");
 //log in with username = standard_user   password = secret_sauce
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
 //find all the results. print the price of each result. 
 //Hint: loop through the list, get index and get text
		List<WebElement> itemsPrice = driver.findElements(By.cssSelector(".inventory_item_price"));
		
		for (int i = 0; i < itemsPrice.size(); i++) {
		    System.out.println(itemsPrice.get(i).getText());
		    // broken down steps.
//			WebElement singleItem = itemsPrice.get(i);
//			String priceofItem = singleItem.getText();
//			System.out.println(priceofItem);
		}
		
		// for each loop version  == demo purpose only
		for (WebElement singleItemPrice : itemsPrice) {
			System.out.println(singleItemPrice.getText());
		}
}
	}


