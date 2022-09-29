package com.simplilearn.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingWebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="F:\\\\\\\\GitHub\\\\\\\\phase-1\\\\\\\\demo\\\\\\\\Phase5\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver=new ChromeDriver();
        String url="https://www.facebook.com/";
        driver.get(url);
        //locating web elements
        //by name
        WebElement email_name=driver.findElement(By.name("email"));
        
        //by id
        WebElement email_id=driver.findElement(By.id("email"));
        
        System.out.println("Email by name and id:"+email_name.equals(email_id));
        
        //by link text
        WebElement link=driver.findElement(By.linkText("Forgotten password?"));
        //link.click();
        //by relative xpath
        WebElement email_xpath=driver.findElement(By.xpath("//*[@id=\"email\"]"));
        System.out.println("Email by id and xpath:"+email_xpath.equals(email_id));
        
        //by full xpath
        WebElement full_xpath=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
        System.out.println("Email by xpath and full xpath:"+full_xpath.equals(email_xpath));
        
        //by selector (css selector)
        WebElement email_web_selector=driver.findElement(By.cssSelector("#email"));
        System.out.println("Email by css selector and xpath:"+email_web_selector.equals(email_xpath));
        
        //list of webelements
        List<WebElement> list=driver.findElements(By.cssSelector("input.inputtext"));
        
        for(WebElement e:list) {
        	System.out.println("List of web elements:"+e.getAttribute("placeholder"));
        	
        	
        	
        }
        
        
        //by using tag
        
        WebElement password=driver.findElement(By.cssSelector("input[name=pass]"));
        System.out.println("password using tag:"+password.getAttribute("placeholder"));
        driver.close();
        
        
	}

}
