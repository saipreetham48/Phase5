package com.simplilearn.demo;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleCheck {
	public static void main(String[] args) {
		String path="F:\\GitHub\\phase-1\\demo\\Phase5\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		String url="https://www.google.com";
		driver.get(url);
		String str=driver.getTitle();
		System.out.println("Title:"+str);
		System.out.println("URL:"+driver.getCurrentUrl());
		//assertEquals("Google1", str);
		driver.close();
	}

}
