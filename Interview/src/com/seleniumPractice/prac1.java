package com.seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class prac1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BV095423\\OneDrive - Cerner Corporation\\Desktop\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.setBinary("C:\\Users\\BV095423\\OneDrive - Cerner Corporation\\Desktop\\Selenium\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriver driver= new ChromeDriver(co);
		driver.get("https://www.gmail.com");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
