package selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sriram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SRIRAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwiI0-bpqL75AhX8kmYCHW0HCX8YABAAGgJzbQ&ohost=www.google.com&cid=CAASJeRoxCu86sezab_uU00QJpkVetYrqo2UXFeW_pdAhJuZeRrzKwk&sig=AOD64_1aVtst0zQTDarqEN2Ep-kaOtWx4Q&q&adurl&ved=2ahUKEwiFpN_pqL75AhWCXHwKHc-IBQoQ0Qx6BAgCEAE");
		WebElement textbox1=driver.findElement(By.id("twotabsearchtextbox"));
		
		Actions builder=new Actions(driver);
		org.openqa.selenium.interactions.Action typeIncaps=builder.keyDown(textbox1, Keys.SHIFT)
               .sendKeys(textbox1,"iphone new launch")
               .keyUp(textbox1,Keys.SHIFT)
               .build();
		typeIncaps.perform();
		
		WebElement search=driver.findElement(By.id("nav-search-submit-text"));
		search.click();
		
	}

}
