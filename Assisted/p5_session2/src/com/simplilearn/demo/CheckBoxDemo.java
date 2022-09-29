package com.simplilearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\\\\\\\GitHub\\\\\\\\phase-1\\\\\\\\demo\\\\\\\\Phase5\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https:/www.shine.com/registration/");
		WebElement checkbox=driver.findElement(By.id("id_privacy"));
		if(checkbox.isSelected()) {
			System.out.println("checkbox is selected");
			System.out.println("Status:"+checkbox.isSelected());
		}
		else {
			System.out.println("Checkbox is not selected");
		}
		checkbox.click();
		System.out.println("Status:"+checkbox.isSelected());
		driver.close();
	}

}
