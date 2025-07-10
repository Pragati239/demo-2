package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import pages.openpage;

public class TablePage extends Basetest1 {
    @Test
	public static void case1()
	{
		driver.get("https://letcode.in/test");
		openpage.tableepage_Btn(driver).click();
		
		WebElement i1 = driver.findElement(By.xpath("//*[@id=\"shopping\"]/tbody/tr[1]/td[2]"));
		WebElement i2 = driver.findElement(By.xpath("//*[@id=\"shopping\"]/tbody/tr[2]/td[2]"));
		WebElement i3 = driver.findElement(By.xpath("//*[@id=\"shopping\"]/tbody/tr[3]/td[2]"));
		WebElement i4 = driver.findElement(By.xpath("//*[@id=\"shopping\"]/tbody/tr[4]/td[2]"));
		
		String s1 = i1.getText();String s2 = i2.getText();String s3 = i3.getText();String s4 = i4.getText();
		int f1 = Integer.parseInt(s1);int f2 = Integer.parseInt(s2);int f3 = Integer.parseInt(s3);int f4 = Integer.parseInt(s4);
		
		int total1 = f1+f2+f3+f4;
		
		WebElement i5 = driver.findElement(By.xpath("//*[@id=\"shopping\"]/tfoot/td[2]/b"));
		String s5 = i5.getText(); int f5 = Integer.parseInt(s5);
		
		if(total1 == f5)
		{
			System.out.println(total1+"="+f5);
		}
		System.out.println(" ");
		
		
		 
	}
    @Test
    public static void case2()
    {
    	driver.get("https://letcode.in/test");
		openpage.tableepage_Btn(driver).click();
		
	    driver.findElement(By.xpath("//input[@id='second']")).click();
	    
    }
    
}
