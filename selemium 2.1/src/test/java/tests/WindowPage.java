package tests;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.openpage;

public class WindowPage extends Basetest1
{
   @Test
	public static void case1() 
	{
		driver.get("https://letcode.in/test");
		openpage.windowpage_Btn(driver).click();
		
		driver.findElement(By.id("home")).click();
		
		String windowid = driver.getWindowHandle();
    	System.out.println("windowid of the page= "+windowid);
    	
    	driver.switchTo().window(windowid);
    	String title = driver.getTitle();
    	
    	System.out.println("The title of first window is = "+title);
  
    	System.out.println(" ");
    	
    	driver.findElement(By.id("multi")).click();
    	
    	Set<String> windowid2 = driver.getWindowHandles();
    	
    	System.out.println("windowid of the page= "+windowid2+" ");
    	
    	driver.switchTo().window("1D1BFDFD0F2645E8D99344EF12660FA6");
    	
        String title2 = driver.getTitle();
    	
    	System.out.println("The title of second window"+title2);
    			
	}

}
