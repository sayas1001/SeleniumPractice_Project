package seleniumInstallation;

import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
		import org.openqa.selenium.By;
		import org.openqa.selenium.Keys;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

public class HelilHw8_8 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahar\\Downloads\\chromedriver_win32\\chromedriver.exe");
				//testCase1();
				testCase2();
			}
			
			public static void testCase1() throws InterruptedException {
				
				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				//	Step 1: Go to "https://www.automationtesting.co.uk".
				
				String uRl = "https://www.automationtesting.co.uk";
				driver.get(uRl);
				driver.findElement(By.cssSelector(".close-cookie-warning > span")).click();
				
			
//					Step 2: Maximize browser and declare implicitly wait for 5 seconds.
				
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
//					Step 3: Locate the Element for "test store" store it in variable and click it.
				
				WebElement testStoreBtm = driver.findElement(By.xpath("//*[contains(text(),'Test Store')]"));
				testStoreBtm.click();
				Thread.sleep(3000);
				//			Step 4: Locate the search text box and store it in variable.
				WebElement searchBox = driver.findElement(By.className("ui-autocomplete-input"));
				
//					Step 5: Search for "Mug" and use SendKeys to Press ENTER.
				Thread.sleep(2000);
				searchBox.sendKeys("Mug");
				searchBox.sendKeys(Keys.ENTER);
				
//					Step 6: Navigate back to the previous page.
				Thread.sleep(2000);
				driver.navigate().back();
//					Step 7: Navigate forward to the recent page and refresh the page. 
				Thread.sleep(2000);
				driver.navigate().forward();
				
				//Refresh the page 
				Thread.sleep(2000);
				driver.navigate().refresh();
				
				
//					Step 8:Close the browser.
					driver.quit();
				
			}
			
			
			public static void testCase2() throws InterruptedException {
				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				//	Step 1: Go to "https://www.automationtesting.co.uk".
				
				String uRl = "http://teststore.automationtesting.co.uk";
				driver.get(uRl);
				//driver.findElement(By.cssSelector(".close-cookie-warning > span")).click();
				
				Thread.sleep(3000);

//					Step 3: Locate "Sign In button" and click on it.
				WebElement signInBtn = driver.findElement(By.xpath("//*[contains(text(),'Sign in')]"));
				signInBtn.click();
				
				Thread.sleep(1000);
//					Step 4: Locate "No account? Create one here" and click on it.
				
				WebElement noAccountBtn = driver.findElement(By.xpath("//*[@data-link-action='display-register-form']"));
				noAccountBtn.click();
//					Step 5: Locate "Create an account" and check if it isDisplayed.
				WebElement createAccountElmt = driver.findElement(By.className("page-header"));
				System.out.println("Checking if the Create Account is Displayed = " + createAccountElmt.isDisplayed());
//					Step 6: Locate "Social title" radio buttons.
				Thread.sleep(1000);
				WebElement genderMrBtn = driver.findElement(By.xpath("(//*[@name='id_gender'])[1]"));
				WebElement genderMrsBtn = driver.findElement(By.xpath("(//*[@name='id_gender'])[2]"));
				//			Step 7: Locate the three checkboxes before the save button.
				WebElement checkBox1 = driver.findElement(By.xpath("//*[@name='optin']"));
				WebElement checkBox2 = driver.findElement(By.xpath("//*[@name='newsletter']"));
				WebElement checkBox3 = driver.findElement(By.xpath("//*[@name='psgdpr']"));

//					Step 8: Check if the radio button isSelected, print statement to validate.  
				Thread.sleep(3000);
				if (genderMrBtn.isSelected()) {System.out.println("This Button is selected");
					
				}else {System.out.println("This element is not selected");}
				
				if (genderMrsBtn.isSelected()) {System.out.println("This Button is selected");
				
				}else {System.out.println("This element is not selected");}
			
//				Step 9: Check if the checkboxes isSelected, print statement to validate. 
				
				if (checkBox1.isSelected() || checkBox2.isSelected() || checkBox3.isSelected()) 
				{System.out.println("This Checkbox is selected");
				
				}else {System.out.println("This element is not selected"); }
				
			
	}

}
