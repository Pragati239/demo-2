package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TooltipPage extends Basetest1
{
	@Test
	public static void case1() 
	{
	  driver.get("https://letcode.in/test");
	  Actions action = new Actions(driver);
	  WebElement text1 = driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/div[1]/div[2]/a"));
	  action.moveToElement(text1).perform();
	 
	  WebElement tooltip1 = driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/div[1]/div[2]/div/a[1]"));
	
	  String text2 = tooltip1.getAttribute("text");
	  
	  WebElement tooltip2 = driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/div[1]/div[2]/div/a[2]"));
	  
	  String text3 = tooltip2.getAttribute("text");
	  
	  System.out.println("The tooltip text is 1."+text2+" 2."+text3);
	  
	  if(text2.equalsIgnoreCase(" Test Practice"))
	  {
		  System.out.println("its equal");
	  }
	  else
	  {
		  System.out.println("its not equal");
	  }
	  
	}
}
