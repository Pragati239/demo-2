package tests;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.openpage;

public class WaitPage extends Basetest1
{
    @Test
	public static void case1() throws InterruptedException
	{
    	
    	driver.get("https://letcode.in/test");
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	
    	openpage.waitpage_Btn(driver).click();
    	
    	driver.findElement(By.xpath("//button[@id='accept']")).click();
    	System.out.println("We get the *NoAlertPresentException* in the script to overcome that we need to add wait");
    		
    	wait.until(ExpectedConditions.alertIsPresent());
    	System.out.println("alert is accepted");
  	
	}
}