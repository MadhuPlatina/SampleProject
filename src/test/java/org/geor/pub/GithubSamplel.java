package org.geor.pub;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GithubSamplel {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://www.walmart.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//*[text()='Departments']")).click();
		 Thread.sleep(10);
		 driver.findElement(By.xpath("//button[text()='Back to School']")).click();
		 
			 
		 
		// driver.close();
		 

	}

}
