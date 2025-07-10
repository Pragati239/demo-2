package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pages.openpage;

public class buttonPage extends Basetest1{
    @Test
	public static void case2()
	{
		driver.get("https://letcode.in/test");
		
		openpage.button_btn(driver).click();
		
		//driver.findElement(By.id("home")).click();
		//driver.navigate().back();
		
		Point position = openpage.position(driver).getLocation();
		System.out.println("The x aand y co-ordinates are "+position);
		
		String css =driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println("The css of the box "+css);
		
		Dimension size = driver.findElement(By.id("property")).getSize();
		System.out.println("The size of the box "+size);
		
		if(openpage.enabledbtn(driver).isEnabled())
		{
			System.out.println("The btn is enabled? = true");
		}
		else
		{
			System.out.println("The btn is enabled? = false");
		}
		
		Actions action = new Actions(driver);
		action.clickAndHold(openpage.press_holdbtn(driver))
		      .pause(Duration.ofSeconds(6))
		      .release()
		      .perform();
		System.out.println("Press and hold done");
		
		     
	}
}

