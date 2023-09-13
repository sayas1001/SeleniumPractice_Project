package seleniumInstallation;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

public class KewanIframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	iFrame();
	}
	
		public static void iFrame () throws InterruptedException {
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//			Get the main window ID and store it in a String called mainWindowId.
//			Click on the ‘New Browser Window’ button
//			Get window IDs and store it into a Set
//			Get the first window ID from the Set and Verify it matches with the main window id in step 2.  
//			Switch to the second window.
//			Verify that there is a Featured Products  is Displayed. 
//			Close the window,  Switch back to the main window
//			Verify you are on the main window by confirming the text “Automation Testing Practice” is Matching in the home page. 
//	
//		Go to https://testautomationpractice.blogspot.com/	
		driver.get("https://testautomationpractice.blogspot.com");
		
		String mainPageID = driver.getWindowHandle();
		String newPageId= "";
		String mainPageTxt = driver.findElement(By.xpath("//h1[contains(text(),'Automation Testing Practice')]")).getText();
		
		System.out.println(mainPageTxt);
		
		WebElement newWindowBtn = driver.findElement(By.cssSelector("button[onclick='myFunction()']"));
		newWindowBtn.click();
		
		Set<String> newWindowdIDs = driver.getWindowHandles();
		for (String str : newWindowdIDs) {if(!str.equals(mainPageID)) {newPageId = str;
			
		};
			
		}
		driver.switchTo().window(newPageId);
		String newWindowTxt = driver.findElement(By.xpath("//h3[contains(text(),'Featured')]")).getText();
		System.out.println(newWindowTxt);
		
		Thread.sleep(2000);
		//System.out.println();
		driver.switchTo().window(mainPageID);
		newWindowBtn.click();
	
	}
	
	public static void iFarame1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();	
		
//		Go to ‘https://demo.automationtesting.in/Frames.html’
		driver.get("https://demo.automationtesting.in/Frames.html");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
//		Locate “Single iFrame” button, save it in a webElement and click on it.		
		//WebElement iFrameBtn = driver.findElement(By.xpath("//a[@aria-expanded=\"true\"]"));
		
//		Locate the Text Box inside of the iFrame Demo.
		
		


//			Switch to the iFrame where the textbox located.
		driver.switchTo().frame("singleframe");
		WebElement firstTextbox = driver.findElement(By.xpath("//input[@type='text']"));

//			Send String Value to the textbox 
		firstTextbox.sendKeys("Prime Tech");
		
//			Switch back it parent frame, then verify that “Automation Demo Site” is Displayed on the top of the page 

		
	}
	
	public static void iFrame2() {
		
//			Go to ‘https://demo.automationtesting.in/Frames.html’
		
		WebDriver driver = new FirefoxDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Frames.html");


//			Locate “iFrame within an iFram” button, save it in a webElement and click on it.
		
		WebElement secoundIframeBtn = driver.findElement(By.xpath("//*[contains(text(),'Iframe with in an Iframe')]"));
		secoundIframeBtn.click();
//		Switch to the iFrame where the textbox located.(switch between two frames )
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src='MultipleFrames.html']")));
		driver.switchTo().frame(0);

//			Locate the Text Box inside of the iFrame Demo.
		WebElement secondTextbox = driver.findElement(By.xpath("//input[@type='text']"));
//			Send String Value to the textbox 
		secondTextbox.sendKeys("Prime Tech");
//			Switch back it parent frame, then verify that “Automation Demo Site” is Displayed on the top of the page 
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		String mainPagetext = driver.findElement(By.xpath("//h1[contains(text(),'Automation Demo Site ')]")).getText();
		System.out.println(mainPagetext);
	}
	
	public static void practice1() {
		
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//			Step 1: Go to https://testautomationpractice.blogspot.com
		driver.get("https://testautomationpractice.blogspot.com");
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		
//		Step 2: Go to “Frames” practice tab.
//		Step 3: Locate the iFrame ID and switch to it by ID.
	      driver.switchTo().frame("frame-one796456169");
//		Step 5: Fill all the required information for all fields 
	      WebElement name = driver.findElement(By.xpath("//input[@name='RESULT_TextField-0']"));
	        name.sendKeys("saraa");
	        WebElement gender = driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-1_1']"));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='RESULT_RadioButton-1_1']")));

	        gender.click();
	        WebElement dob = driver.findElement(By.className("calendar_field"));
	        dob.sendKeys("01/01/1990");
	        
//		Step 6: Locate the Job dropdown and select the correct value.
	        WebElement job = driver.findElement(By.id("RESULT_RadioButton-3"));
	        
	        Select slt = new Select(job);
	        slt.selectByVisibleText("Manager");

//		Step 7: Locate the “Submit” button and Click on it. 
	        WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
	        submit.click();
	        
//		Step 8: Switch back to the Main frame.
	        driver.switchTo().defaultContent();
//		Step 9: Get and verify the text on the top of the home page “Automation Testing Practice”
//	        
	        String title = driver.getTitle();
	        if (title.equals("Automation Testing Practice")) {
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	    		
		
		
	}
	
	
	
	public static void actionPractice() {
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Register.html");
		
		Actions action = new Actions(driver);
//		WebElement switchToo = driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]"));
//		action.moveToElement(switchToo).build().perform();
//		driver.findElement(By.xpath("//a[contains(text(),'Alerts')]")).click();
		
		
		action.sendKeys(driver.findElement(By.xpath("//input[@placeholder='First Name']")), "PrimeTech").perform();
	}

	}

