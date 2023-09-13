package seleniumInstallation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Kewan8_10HW {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		homeWork1();
		
	}
	
	
	public static void homeWork1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//Step 1: Go to URL "https://www.thetestingworld.com/testings".
		String url = "https://www.thetestingworld.com/testings";
		driver.get(url);
//		Step 2: Maximize the browser & declare implicitly wait for 5 second.
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		Step 3:  Verify the browser landed on the "Register" page. 
		
		WebElement registerBtn = driver.findElement(By.xpath("//*[@for='tab1']"));
		System.out.println("The Register Button is Displayed " + registerBtn.isDisplayed());

//		Step 4: Locate all the required Text Boxes, Dropdowns, Radio Buttons.
	
		WebElement userName = driver.findElement(By.xpath("//input[@name='fld_username']"));
		String userN = "S.Y";
		WebElement email = driver.findElement(By.xpath("//input[@name='fld_email']"));
		String userEmail = "saharyasir123@gmail.com";
		WebElement passWord = driver.findElement(By.xpath("//input[@name='fld_password']"));
		WebElement confirmPassW = driver.findElement(By.xpath("//input[@name='fld_cpassword']"));
		String userPassw = "12345";
		
		userName.sendKeys(userN);
		email.sendKeys(userEmail);                                                                                                                                                                                                 
		
		passWord.sendKeys(userPassw);
		confirmPassW.sendKeys(userPassw);
		
		WebElement dob = driver.findElement(By.xpath("//input[@name='dob']"));
		String userDOB = "12/12/2000";
		
		//dob.sendKeys(userDOB);
		//dob.sendKeys(Keys.ENTER);
		dob.sendKeys(Keys.chord(userDOB, Keys.ENTER));
		
		WebElement phoneNumber = driver.findElement(By.cssSelector("input[name='phone']"));
		String userPHnumber = "1012023090";
		phoneNumber.sendKeys(userPHnumber);
		
		WebElement address = driver.findElement(By.cssSelector("input[name='address']"));
		String userAddress = "1234 fairfax blvd";
		address.sendKeys(userAddress);
		
		WebElement radioAddresstype = driver.findElement(By.cssSelector("input[value='office']"));
		radioAddresstype.click();
		
		WebElement genderDD = driver.findElement(By.cssSelector("select[name='sex']"));
		Select sl3 = new Select(genderDD);
		sl3.selectByVisibleText("Male");
		
		WebElement countryDD = driver.findElement(By.id("countryId"));
		Select sel = new Select(countryDD);
		sel.selectByValue("231");
		
		WebElement stateDD = driver.findElement(By.id("stateId"));
		WebDriverWait wait = new WebDriverWait(driver,3);
		wait.until(ExpectedConditions.elementToBeClickable(stateDD));
		Select sle1 = new Select(stateDD);
		sle1.selectByValue("3974");
		
		WebElement cityDD = driver.findElement(By.id("cityId"));
		WebDriverWait wt = new WebDriverWait(driver, 3);
		wt.until(ExpectedConditions.elementToBeClickable(cityDD));
		Select sle2 = new Select(cityDD);
		sle2.selectByVisibleText("Fairfax");
		
		WebElement zipCode = driver.findElement(By.cssSelector("input[name='zip']"));
		String userZipCode = "11001";
		zipCode.sendKeys(userZipCode);
		
		

//		Step 5: Locate the checkbox for Terms and Conditions and Sign Up button and click.  
		
		WebElement termsAndCond = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		termsAndCond.click();
		WebElement logInBtn = driver.findElement(By.xpath("//*[@value='Sign up']"));
		logInBtn.click();
		
//		Step 6: Locate "User is successfully Register. Now You can Login" webelement and verify its displayed on the page. 
		
		String actualMsg = "User is successfully Register. Now You can Login";
		String expectedMsg = driver.findElement(By.className("vd_green")).getText();
		
		//System.out.println(actualMsg + "VS" +expectedMsg);
		
		if(expectedMsg.contains(actualMsg)) {System.out.println("The message is matching with actual message test pass");
		}else {System.out.println("The message is not matching with actual message test fail");
		
		}
//		Step 7: Locate the Login button and click on it. 
		
		
	}
		
}
