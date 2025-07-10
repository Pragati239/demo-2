 package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pages.openpage;

public class DragDropTest extends Basetest1{
    @Test
	public static void case1() throws InterruptedException
	{
    	
    	driver.get("https://letcode.in/test");   
    	
    	String title  = driver.getTitle();
    	System.out.println("Title of the page= "+title);
    	
    	String url = driver.getCurrentUrl();
    	System.out.println("url of the page= "+url);
    	
    	String windowid = driver.getWindowHandle();
    	System.out.println("windowid of the page= "+windowid);
    	
    	openpage.DragDrop_pageBtn(driver).click();
    	
    	WebElement drag1 = driver.findElement(By.xpath("//*[@id=\"sample-box\"]"));
    	WebElement drop1 = driver.findElement(By.xpath("//*[@id=\"sample-box\"]"));
    	
    	Actions drag = new Actions(driver);
    	drag.dragAndDrop(drag1, drop1).build().perform();
    	System.out.println("the drag drop action performed");
    	
	}
    @Test
    public static void case2()
    {
    	driver.get("https://letcode.in/test");   
    	openpage.Drag_pageBtn(driver).click();
    	
    	WebElement box1 = driver.findElement(By.xpath("//h3[@id='header']"));
    	
    	int xaxis = box1.getLocation().getX(); 
    	int yaxis = box1.getLocation().getY(); 
    	
    	System.out.println("The x-y coordinates of box1 are "+xaxis+","+yaxis);
    }
    
}
