package org.geor.pub;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GithubSamplel {

	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://www.google.com/");
		 driver.findElement(By.id("APjFqb")).sendKeys("kids dresses", Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 //driver.findElement(null)
		 
		 
		 
		 
		 
		 
		// driver.close();
		 

	}

}
