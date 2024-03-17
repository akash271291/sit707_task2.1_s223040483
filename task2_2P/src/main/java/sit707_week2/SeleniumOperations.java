package sit707_week2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void officeworks_registration_page(String url) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\61410\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		
		
		// Find first input field which is firstname
		WebElement element = driver.findElement(By.id("firstname"));
		System.out.println("Found element: " + element);
		// Send first name
		element.sendKeys("Akash");
		
		/*
		 * Find following input fields and populate with values
		 */
		// Write code
		
		 WebElement lastNameElement = driver.findElement(By.id("lastname"));
		    lastNameElement.sendKeys("deep");
		    
		    
		    WebElement phoneNumberElement = driver.findElement(By.id("phoneNumber"));
		    phoneNumberElement.sendKeys("0410961533");
		    
		    
		    WebElement emailElement = driver.findElement(By.id("email"));
		    emailElement.sendKeys("my.test@gmail.com");
		    
		    WebElement passwordElement = driver.findElement(By.id("password"));
		    passwordElement.sendKeys("Password");
		    
		    WebElement confirmPasswordElement = driver.findElement(By.id("confirmPassword"));
		    confirmPasswordElement.sendKeys("Password");
		    
		   WebElement createAccountButton = driver.findElement(By.cssSelector("button[data-testid='account-action-btn']"));
		    createAccountButton.click();
		/*
		 * Take screenshot using selenium API.
		 */
	
		    try {
	            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	            FileUtils.copyFile(scrFile, new File("C:\\Users\\61410\\Documents\\screenshot.png"));
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}
	
	
	public static void target_registration_page(String url) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\61410\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
		 // Find and click the 'Create Account' button
		    WebElement createAccountButton = driver.findElement(By.xpath("//button[contains(text(), 'Create Account')]"));
		    createAccountButton.click();
		    
		WebElement emailElement = driver.findElement(By.id("signup-email"));
	    emailElement.sendKeys("my.test@gmail.com");
		
		// Find first input field which is firstname
		WebElement element = driver.findElement(By.id("first-name"));
		System.out.println("Found element: " + element);
		// Send first name
		element.sendKeys("Akash");
		
		/*
		 * Find following input fields and populate with values
		 */
		// Write code
		
		 WebElement lastNameElement = driver.findElement(By.id("last-name"));
		    lastNameElement.sendKeys("deep");
		    
		    WebElement phoneNumberElement = driver.findElement(By.id("mobile-number"));
		    phoneNumberElement.sendKeys("0410961533");
		    
		    WebElement passwordElement = driver.findElement(By.id("signup-password"));
		    passwordElement.sendKeys("Password");
		    
		    // Find the Join Now button and click it
		    WebElement joinNowButton = driver.findElement(By.xpath("//button[contains(text(), 'Join Now')]"));
		    joinNowButton.click();
		    
		 // Take screenshot using selenium API.
	
		    
		// Write code
		// Sleep a while
		    try {
	            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	            FileUtils.copyFile(scrFile, new File("C:\\Users\\61410\\Documents\\screenshot1.png"));
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		sleep(2);
		
		// close chrome driver
	driver.close();	
	}
	
	
}
