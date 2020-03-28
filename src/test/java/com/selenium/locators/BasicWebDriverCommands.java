package com.selenium.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// Following Example depicts the most commonly used Browser Commands for Selenium WebDriver

public class BasicWebDriverCommands {

	public WebDriver driver;

	@BeforeTest
	public void basicBrowserOperation() throws InterruptedException {
		
		// System Property for Chrome Driver   
		System.setProperty("webdriver.chrome.driver", "C:\\TestAutomation\\Grid\\chromedriver_win32\\chromedriver.exe");
		
		// Instantiate a ChromeDriver class.     
		driver = new ChromeDriver();
		
		Thread.sleep(2000);

	}

	@Test
	public void openBrowser() throws InterruptedException {

		// 1)Get Command :
		// -->method : get(String arg0) : void
		// -->In WebDriver, this method loads a new web page in the existing browser window.
		// -->It accepts String as parameter and returns void.
		 
		driver.get("https://yahoo.com");

		// This line maximizes the browser window
		driver.manage().window().maximize();

		Thread.sleep(2000);

		// 2)Get Title Command:
		// -->method: getTitle(): String
		// -->In WebDriver, this method fetches the title of the current web page.
		// -->It accepts no parameter and returns a String.

		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		
		//3)Get Current URL Command:
		
		//-->method: getCurrentUrl(): String  
		//-->In WebDriver,this method fetches the string representing the Current URL of the current web page. 
		//-->It accepts nothing as parameter and returns a String value.
		
		String currentURL= driver.getCurrentUrl();
		System.out.println(currentURL);
		Thread.sleep(2000);
		
		//4)Get Page Source Command:
		//-->method: getPageSource(): String  
		//-->In WebDriver, this method returns the source code of the current web page loaded on the current browser. 
		//-->It accepts nothing as parameter and returns a String value.
		
		String pagesource= driver.getPageSource();
		System.out.println(pagesource);
		Thread.sleep(2000);
		
		
		//5)Close Command:
		//-->method: close(): void  
		//-->This method terminates the current browser window operating by WebDriver at the current time. 
		//If the current window is the only window operating by WebDriver, it terminates the browser as well. 
		//-->This method accepts nothing as parameter and returns void.
		
		driver.close();
		System.out.println("Closed the current window..!!");
		Thread.sleep(2000);
		

	}

	@AfterTest
	public void closeBrowser() {

		//6)Quit Command
		//-->method: quit(): void  
		//-->This method terminates all windows operating by WebDriver. 
		//-->It terminates all tabs as well as the browser itself. 
		//-->It accepts nothing as parameter and returns void.

		driver.quit();
		
	}

}
