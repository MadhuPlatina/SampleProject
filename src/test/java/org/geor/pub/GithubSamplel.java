package org.geor.pub;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
public class GithubSamplel {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://www.fooddepot.com/");
		 String Title=driver.getTitle();
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//ul[@id='top-menu']//a[text()='Weekly Ad']")).click();
		// driver.findElement(By.xpath("//img[@src='/wp-content/uploads/2020/07/fooddepot-logo.png']")).click();
		 driver.findElement(By.xpath("//img[@id='logo']")).click();
		 String ExpectedTitle=driver.getTitle();
		 Assert.assertEquals(Title, ExpectedTitle);
		 driver.findElement(By.xpath("//*[@id='top-menu']//*[text()='Locations']")).click();
		 //Thread.sleep(10);
		 driver.findElement(By.xpath("//img[@id='logo']")).click();
		 driver.findElement(By.xpath("//img[@src='/wp-content/uploads/2020/07/fooddepot-logo.png']")).click();
		 driver.findElement(By.xpath("//*[@id='top-menu']//*[text()='About Us']")).click();
		 Thread.sleep(10);
		 driver.findElement(By.xpath("//img[@src='/wp-content/uploads/2020/07/fooddepot-logo.png']")).click();
		 driver.findElement(By.xpath("//ul[@id='top-menu']//a[text()='Careers']")).click();
		 Thread.sleep(10);
		 driver.findElement(By.xpath("//img[@src='/wp-content/uploads/2020/07/fooddepot-logo.png']")).click();
		 driver.findElement(By.xpath("//ul[@id='top-menu']//a[text()='Contact Us']")).click();
		 Thread.sleep(10);
		 driver.findElement(By.xpath("//img[@src='/wp-content/uploads/2020/07/fooddepot-logo.png']")).click();
	     driver.findElement(By.xpath("//*[text()='Welcome to Food Depot!']")).click();
	     ////////
	     
	     driver.findElement(By.xpath("//ul[@id='top-menu']//a[text()='Coupons']")).click();
	     Alert alert=driver.switchTo().alert();
	     alert.dismiss();
	     
	     driver.findElement(By.xpath("//img[@src='/wp-content/uploads/2020/07/fooddepot-logo.png']")).click();
	    
	     
		 
		 
			 
		 
		// driver.close();
		 

	}

}
