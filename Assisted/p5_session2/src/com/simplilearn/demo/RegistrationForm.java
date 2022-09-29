package com.simplilearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\\\\\\\GitHub\\\\\\\\phase-1\\\\\\\\demo\\\\\\\\Phase5\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https:/www.shine.com/registration/");
		
		//name
		WebElement name=driver.findElement(By.id("id_name"));
		name.sendKeys("Sai");
		//email
		WebElement email=driver.findElement(By.id("id_email"));
		email.sendKeys("sai785469@gmail.com");
		//mobile
		WebElement mobile=driver.findElement(By.id("id_cell_phone"));
		mobile.sendKeys("9876544587");
		//password
		WebElement password=driver.findElement(By.id("id_password"));
        password.sendKeys("Sai@12378954");
        
        //button
        WebElement register=driver.findElement(By.cssSelector("#registerButton"));
        register.click();
	}

}
