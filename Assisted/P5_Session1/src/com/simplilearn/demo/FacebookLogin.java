package com.simplilearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="F:\\\\GitHub\\\\phase-1\\\\demo\\\\Phase5\\\\chromedriver_win32\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		String url="https://www.facebook.com/";
		driver.get(url);
		//get the title of the page
		System.out.println("Title:"+driver.getTitle());
		//to maximize the window
		driver.manage().window().maximize();
		WebElement email=driver.findElement(By.id("email"));
		System.out.println(email.getAttribute("placeholder"));
		email.sendKeys("Sai@gmail.com");
		WebElement pass=driver.findElement(By.name("pass"));
		System.out.println(pass.getAttribute("placeholder"));
		pass.sendKeys("Sai@123");
		
		
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		
		
		
		

	}

}
