package org.screenshotandscrollupanddown;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SeleniumCourse3 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Aravind Rajkumar\\eclipse-workspace\\EnterThe Values\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement interviewQuestions = driver.findElement(By.id("heading20"));
		interviewQuestions.click();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", interviewQuestions);
		TakesScreenshot tk= (TakesScreenshot) driver;
		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		File f= new File("C:\\Users\\Aravind Rajkumar\\eclipse-workspace\\Day7\\Screenshots\\intQues.png");
		FileHandler.copy(screenshotAs, f);
	}

}
