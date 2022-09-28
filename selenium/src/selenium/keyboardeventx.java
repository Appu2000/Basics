package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardeventx {
public static void main(String args[]) {	
	

	System.setProperty("webdriver.chrome.driver","C:\\Users\\SRIRAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	WebElement textbox1=driver.findElement(By.name("q"));
	
	Actions builder=new Actions(driver);
	org.openqa.selenium.interactions.Action typeIncaps=builder.keyDown(textbox1, Keys.SHIFT)
           .sendKeys(textbox1,"artoftesting")
           .keyUp(textbox1,Keys.SHIFT)
           .build();
	typeIncaps.perform();
}
}
