package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pages.openpage;

public class SliderPage  extends Basetest1 { 
	@Test
    public static void case1()
    {
    	driver.get("https://letcode.in/test");
    	openpage.sliderpage_Btn(driver).click();
    	
    	WebElement slider = driver.findElement(By.id("generate"));
    	Actions act = new Actions(driver);
    	
    	act.clickAndHold(slider).moveByOffset(40, 0).build().perform();
    	
    	driver.findElement(By.xpath("//button[text()='Get Countries']")).click();
    	
    	WebElement countries = driver.findElement(By.xpath("/html/body/app-root/app-slider/section/div/div/div[1]/div/div/div[1]/div[2]/div/p"));
	
		String names = countries.getText();
		//System.out.println(names);
		
		String[] Str = names.split("-");
		        for (String a : Str) 
		        {
		            System.out.println(a);
		       
		        }

	}
}
