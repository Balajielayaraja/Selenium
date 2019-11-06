package org.cts.test.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Homepage {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\karanmc\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement msecourse = driver.findElement(By.id("email"));
	msecourse.sendKeys("kjboisjhesgj");
	WebElement pswd = driver.findElement(By.name("pass"));
	pswd.sendKeys("236457");
	WebElement btnlogin = driver.findElement(By.id("loginbutton"));
	btnlogin.click();
	WebElement msecourse1 = driver.findElement(By.id("email"));
	msecourse1.sendKeys("9791230470");
	WebElement pswd1 = driver.findElement(By.name("pass"));
	pswd1.sendKeys("236457");
	WebElement btnlogin1 = driver.findElement(By.id("loginbutton"));
	btnlogin1.click();
	driver.get("https://www.facebook.com/");
	WebElement msecourse2 = driver.findElement(By.id("email"));
	msecourse2.sendKeys("129759827");
	WebElement pswd2 = driver.findElement(By.name("pass"));
	pswd2.sendKeys("Balaji@19");
	WebElement btnlogin2 = driver.findElement(By.id("loginbutton"));
	btnlogin2.click();
	
	
	
	
	
}
}
