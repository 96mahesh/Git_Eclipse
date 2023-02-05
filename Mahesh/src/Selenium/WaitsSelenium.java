package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsSelenium {

	public static WebDriver driver;
	public static void implicitlyWait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
	}
	public static void ExplicitWait()
	{
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeSelected(By.id("as")));
	}
	
	public static void FluientWait()
	{
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		
	
		wait.pollingEvery(null);
		
	}
	
	
	
}
