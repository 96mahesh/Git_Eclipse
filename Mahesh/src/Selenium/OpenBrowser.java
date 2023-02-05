package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.google.com");
		driver.manage().window().maximize();
		
		By googleL = By.name("q");
		WebElement google =driver.findElement(googleL) ;
		google.click();
	}

}
