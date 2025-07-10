package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.openpage;

public class radioPage extends Basetest1
{
	@Test
	public static void case4() throws InterruptedException
	{
		driver.get("https://letcode.in/test");
		openpage.radio_page(driver).click();
		driver.findElement(By.id("yes")).click();
		System.out.println("1. first button is selected");
		
		List<WebElement> radio1 = driver.findElements(By.name("one"));
	    

		for(WebElement button: radio1)
		{
			button.click();
			Thread.sleep(1000);			
		}
		System.out.println("2. we can select only one button");
		
	}

	@Test
	public static void case5()
	{
		driver.get("https://letcode.in/test");
		openpage.radio_page(driver).click();
		
	
		for(WebElement button2: openpage.radio_btn2(driver))
		{
			button2.click();
		}
		System.out.println("3. Error-both button is selected");
		
		boolean select1 = driver.findElement(By.id("foo")).isSelected();
		System.out.println("button is selected- "+select1);
		
		boolean select2 = driver.findElement(By.id("notfoo")).isSelected();
		System.out.println("button is selected- "+select2);
		
		boolean disabled1 = driver.findElement(By.id("maybe")).isEnabled();
		System.out.println("button is Enabled- "+disabled1);
		
		boolean checkbox = openpage.checkbox1(driver).isSelected();
		System.out.println("button is clicked- "+checkbox);
		
	    
	    
	}
	

}
