package seleniumInstallation;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Kewan8_11HW {

	public static void main(String[] args)  throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		homeWorklogin();
		
	}
	
	public static void homeWorklogin() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		   
//		Step 1: Go to URL "https://www.thetestingworld.com/testings".
		WebDriver driver1 = new ChromeDriver();
		String url = "https://www.thetestingworld.com/testings";
		driver1.get(url);
//		Step 2: Maximize the browser & declare implicitly wait for 5 second.
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);



//Locate the Login button and click on it.
		driver1.findElement(By.xpath("//label[contains(text(),'Login')]")).click();
//Locate the userName and passWord text box and put your info. 
//Locate the Login button and click on it. 
		WebElement userNameBox = driver1.findElement(By.xpath("//input[@name='_txtUserName']"));
		userNameBox.sendKeys("S.Y");
		WebElement passWordBox = driver1.findElement(By.xpath("//input[@name='_txtPassword']"));
		passWordBox.sendKeys("12345");
		WebElement loginBtn = driver1.findElement(By.xpath("//input[@value='Login']"));
		loginBtn.click();
//Locate the Home button then select "user list" from the drop down menu
		WebElement homeBtn = driver1.findElement(By.xpath("//*[contains(text(),'Home')]"));
		//homeBtn.click();
		Thread.sleep(1000);
		
		
		Actions letdoaction = new Actions(driver1);
		letdoaction.moveToElement(homeBtn).perform();
		
		Thread.sleep(1000);
		
		WebElement userListbtn = driver1.findElement(By.xpath("//*[contains(text(),'User List')]"));
		userListbtn.click();
		
		
//Save all users in a List of WebElements, then print the user information 
//Print only the email and phone number for user 2. 

	List <WebElement> usersLst = driver1.findElements(By.className("items"));
	System.out.println(usersLst.size());
	for (int i = 0; i < usersLst.size(); i++) {
		System.out.println(usersLst.get(i).getText());
	}










		        
	}

}
