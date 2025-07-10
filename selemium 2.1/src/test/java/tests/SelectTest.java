package tests;

import org.openqa.selenium.Keys;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pages.openpage;

public class SelectTest extends Basetest1{
    @Test
	public static void case1()
	{
    	
    	driver.get("https://letcode.in/test");
       
    	openpage.MultiSelect_pageBtn(driver).click();
    	
    	Actions select = new Actions(driver);
    	select.keyDown(Keys.CONTROL).click(openpage.Sel_Btn(driver)).click(openpage.Test_Btn(driver)).
    	click(openpage.Post_Btn(driver)).build().perform();
    	System.out.println("Selected the required elements");
    	  	
	}
    
}
