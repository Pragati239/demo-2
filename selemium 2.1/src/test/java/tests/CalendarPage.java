package tests;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.openpage;

public class CalendarPage extends Basetest1
{
	@Test
	public static void case1() 
	{
	  driver.get("https://letcode.in/test");
	  openpage.calendarpage_Btn(driver).click();
	  
	  driver.findElement(By.xpath("//*[@id=\"datetimePicker4da9cb1e-4d9f-42e5-84ca-f352bd3a4008\"]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[1]")).click();
	}
}
