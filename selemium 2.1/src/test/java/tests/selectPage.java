package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pages.openpage;

public class selectPage extends Basetest1{
    @Test
	public static void case3() throws InterruptedException
	{
    	System.out.println("select page automation start");
    	driver.get("https://letcode.in/test");
    	openpage.select_page(driver).click();
        Select dropdown = new Select(openpage.dropdown_1(driver));
        dropdown.selectByVisibleText("Apple");
        Thread.sleep(2000);
        dropdown.selectByIndex(4);
        
        Select dropdown2 = new Select(openpage.dropdown_2(driver));
        dropdown2.selectByValue("ta");
        Thread.sleep(2000);
        dropdown2.selectByVisibleText("Captain America");
        dropdown2.deselectByValue("ta");
        
        Select dropdown3 = new Select(openpage.dropdown_3(driver));
        dropdown3.selectByIndex(4);
        
        List<WebElement> option = dropdown3.getOptions();
        
        int i=1;
        for(WebElement options: option)
        {
        	System.out.println(i+"-"+options.getText());
        	i++;	
        }
        
       driver.findElement(By.id("country")).click();
      WebElement dd4 = driver.findElement(By.xpath("//*[@id=\"country\"]/option[7]"));
      dd4.click();
      String name = dd4.getText();
      System.out.println("The selected country is "+name);
      
}
}
