package seleniumInstallation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class ClassTest2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
			WebDriver driver = new ChromeDriver();
			String searchCriteria = "SDET";
			//Test case 2:
				//1. go to indeed.com
			driver.get("https://indeed.com");
				//2. get the current URL and store it in a variable called homeURL.
			String homeURL = driver.getCurrentUrl();
			System.out.println("Home URL is: " + homeURL);
				//3. get the website title and store it in a variable homeTitle.
			String homeTitle = driver.getTitle();
			System.out.println("Home Title is: " + homeTitle);
				//4. find the input field for WHAT and type SDET
			WebElement whatField = driver.findElement(By.name("q"));
			whatField.sendKeys(searchCriteria); 
				//5. find the Search button and click on it.
			WebElement searchBtn = driver.findElement(By.className("yosegi-InlineWhatWhere-primaryButton"));
			searchBtn.click();
			Thread.sleep(1000);
				//6. get the current URL and store it as a variable searchURL.
			String searchURL = driver.getCurrentUrl();
			System.out.println("Search URL is: " + searchURL);
				//7. get the website title and store it in a variable searchTitle.
			String searchTitle = driver.getTitle();
			System.out.println("Search Title is: " + searchTitle);
				//8. verify that searchURL does not equal to homeURL and contains the search criteria.
			if ((!searchURL.equals(homeURL)) && searchURL.contains(searchCriteria)) {
				System.out.println("Search URL Test Pass!");
			}else {
				System.out.println("Search URL Test Fail!");
			}
				//9. verify that searchTitle does not equal to homeTitle and has the search criteria.
			if ((!searchTitle.equals(homeTitle)) && searchTitle.toLowerCase().contains(searchCriteria.toLowerCase())) {
				System.out.println("Search Title Test Pass!");
			}else {
				System.out.println("Search Title Test Fail!");
			}
				//10. Get Text of the JobsInLocation field, store it in a variable, 
			//then verify if it's equal to your search criteria.
			
			WebElement jobsInTextField = driver.findElement(By.className("css-novqjp"));
			String jobsInText = jobsInTextField.getText();
			System.out.println("Jobs in the area text is: " + jobsInText);
			
			// First approach: we could verify the text in this way
			if (jobsInText.contains(searchCriteria)) {
				System.err.println("Jobs in the area text verification pass.");
			}else {
				System.out.println("Jobs in the area text verification fail.");
			}
			
			
			// Second approach:  SDET jobs in Centreville, VA
	         String cutText = jobsInText.substring(0, 4);
	         System.out.println("SubStringed text is: " + cutText);
			if (cutText.equals(searchCriteria)) {
				System.err.println("Pass - Jobs in the area text verification");
			} else {
				System.err.println("Fail - Jobs in the area text verification");
			}
			
			
		}
	}


