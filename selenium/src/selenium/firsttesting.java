package selenium;
//import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firsttesting {
	public static void main(String args[]) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\SRIRAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		// driver.get("https://www.amazon.com/");
		 driver.get("https://www.google.com");
		 
		 Thread.sleep(4000);
		 driver.close();
		
		
	}

}
