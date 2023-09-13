package seleniumInstallation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstBrowserLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
				// WebDriver is an interface being a reference type
		//ChromeDriver is a class being an object
		WebDriver driver = new ChromeDriver(); //this line means I created an object
		driver.get("https://amazon.com"); //.get gets all info inside the webdriver
			
		
		//navigate to amazon
		driver.get("https://amazon.com"); 
		
		//*type for coffee mug in search field
		//1. find the element of the search field
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		//2. sendKeys() to the element we found
		searchBox.sendKeys("coffee mug");
		//*click on search button
		//1.find the search button element
		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		//2. click on the element
		searchButton.click();
	}
	//public : access modifier  
	//void :return type
	//sum : name of function  
	//int num1 int num2 : parameter arguements
	
	public void sum(int num1, int num2) {
		System.out.println(num1 + num2);
		
	}
	}
		
	
	

