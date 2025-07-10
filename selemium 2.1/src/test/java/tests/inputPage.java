package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.openpage;
public class inputPage  extends Basetest1 {
	
	@Test
	public static void case1()
	{
		driver.get("https://letcode.in/test");
		openpage.input_btn(driver).click();
		
		openpage.text_box(driver).sendKeys("AAA bbb ccc");
        openpage.TAB_btn(driver).sendKeys(Keys.TAB);
        String getMe=driver.findElement(By.id("getMe")).getAttribute("value");
	    System.out.println("The text inside the box "+getMe);
	    driver.findElement(By.id("clearMe")).clear();
	    Boolean editbox =driver.findElement(By.id("noEdit")).isEnabled();
	    System.out.println("The edit box is enabled "+editbox);
	    String readOnly = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
	    System.out.println("The text inside the box "+readOnly);
	    //driver.navigate().back();
	}
	
	
	
}
