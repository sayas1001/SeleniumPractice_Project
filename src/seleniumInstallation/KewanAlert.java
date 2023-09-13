package seleniumInstallation;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class KewanAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		windowHandles();
	}
public static void alertHandle () throws InterruptedException {
	


//		Click the button to display an alert box.
//		Send text to the Alert with your name and title.
//		Then accept the Alert. 
//		Verify that the message displays as it should.
	WebDriver driver = new ChromeDriver(); //coz working on Chrome
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
///		Go to "https://demo.automationtesting.in/Alerts.html"		
	driver.get("https://demo.automationtesting.in/Alerts.html");

//	Click on Alert with text box. 
	WebElement alertWtext = driver.findElement(By.xpath("//*[text()='Alert with Textbox ']"));
	alertWtext.click();
	driver.findElement(By.className("btn-info")).click();
	
	Alert alt = driver.switchTo().alert();
	Thread.sleep(2000);
	alt.sendKeys("Hello, I am Sam");
	Thread.sleep(2000);
	System.out.println(alt.getText());
	alt.accept();
}

public static void windowHandles () {
	WebDriver driver = new ChromeDriver();		
	driver.manage().window().maximize();
	
	driver.get("https://demo.automationtesting.in/Windows.html");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	
	String mainWindowId = driver.getWindowHandle();
	System.out.println(mainWindowId);
	
	WebElement clickBtn = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
	clickBtn.click();
	
	Set <String> windowsIds = driver.getWindowHandles();
	
	for (String str : windowsIds) {
		if(!str.equals(mainWindowId)) {driver.switchTo().window(str);}
	}
	
	String newPageTxt = driver.findElement(By.className("fs-1")).getText();
	System.out.println(newPageTxt);
	
	driver.switchTo().window(mainWindowId);
	String mainPagetxt = driver.findElement(By.xpath("//h1[text()='Automation Demo Site ']")).getText();
	System.out.println(mainPagetxt);
}



}
