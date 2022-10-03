package com.simplilearn.testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupTest {
	
	WebDriver driver=null;
	
	 
	
	@Test(groups = "Chrome")
	public void launchChrome() {
		System.setProperty("webdriver.chrome.driver", "F:\\\\\\\\GitHub\\\\\\\\phase-1\\\\\\\\demo\\\\\\\\Phase5\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(groups = "Chrome",dependsOnMethods = {"launchChrome"})
	public void loginWithChrome() {
		
		driver.findElement(By.id("email")).sendKeys("sai@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Sai@123");
		driver.findElement(By.name("login")).submit();
		//driver.close();
	}
}
