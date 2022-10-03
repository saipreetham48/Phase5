package com.simplilearn.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstDemo {
	@Test
	public void Hello() {
		System.out.println("----Test1-----");
	}
	@Test
	public void Hello1() {
		System.out.println("----Test2-----");
	}
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before suite");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("After suite");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("After test");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("Before test");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before class");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("After class");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before method");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("After method");
	}
  
  }

