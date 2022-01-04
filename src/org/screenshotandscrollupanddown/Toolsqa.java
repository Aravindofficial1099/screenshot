package org.screenshotandscrollupanddown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toolsqa {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Aravind Rajkumar\\eclipse-workspace\\EnterThe Values\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/");
		WebElement close = driver.findElement(By.xpath("(//button[@class='modal__close'])[2]"));
		close.click();
		WebElement otherArticles = driver.findElement(By.xpath("//div[text()='Other Articles']"));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", otherArticles);
			
	}

}
