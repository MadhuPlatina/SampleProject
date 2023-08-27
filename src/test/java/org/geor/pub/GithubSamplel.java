package org.geor.pub;

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
		 driver.get("https://www.amazon.com/");
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("kids dresses", Keys.ENTER);
		 

	}

}
