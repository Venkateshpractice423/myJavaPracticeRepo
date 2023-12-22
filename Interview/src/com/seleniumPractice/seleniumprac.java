package com.seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumprac {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		
		driver.close();

	}

}
