package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.openpage;

public class AlertPage extends Basetest1
{
    @Test
	public static void case1()
	{
		driver.get("https://letcode.in/test");
		openpage.Alert_pageBtn(driver).click();
		
		driver.findElement(By.id("accept")).click();
		driver.switchTo().alert().accept();
		System.out.println("Accepted the alert");
		
	}
    @Test
    public static void case2()
	{
		driver.get("https://letcode.in/test");
		openpage.Alert_pageBtn(driver).click();
		
		
		driver.findElement(By.id("confirm")).click();
		Alert alert = driver.switchTo().alert();
		String AlertText = alert.getText();
		alert.dismiss();
		
		System.out.println("dismiss alert text--- "+AlertText);
	}
    
    @Test
    public static void case3()
	{
		driver.get("https://letcode.in/test");
		openpage.Alert_pageBtn(driver).click();
		driver.findElement(By.id("prompt")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.sendKeys("Jenelia");
		alert1.accept();
		
		WebElement promptBox = driver.findElement(By.id("myName"));
		String Text2 = promptBox.getText();
		
		System.out.println("What the name? = "+Text2);
				
	}
    @Test
    public static void case4()
	{
		driver.get("https://letcode.in/test");
		openpage.Alert_pageBtn(driver).click();
		driver.findElement(By.xpath("//*[@id=\"modern\"]")).click();
		//openpage.Alert_sweet(driver).click();
		
		System.out.println("handled sweet alert also");
		
	}
    
}
