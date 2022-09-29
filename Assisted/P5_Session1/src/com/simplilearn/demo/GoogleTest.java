package com.simplilearn.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
	public static void main(String[] args) {
		//declare the path
		String path="F:\\GitHub\\phase-1\\demo\\Phase5\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		//initialize the webdriver
		WebDriver driver=new ChromeDriver();
		//give the base url
		String url="https://www.google.com";
		driver.get(url);
		driver.close();
		System.out.println("Driver working properly");
		
	}

}
