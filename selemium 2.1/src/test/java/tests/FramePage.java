package tests;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.openpage;

public class FramePage extends Basetest1 {
	@Test
   public static void case1()
   {

   	driver.get("https://letcode.in/test");

   	openpage.framepage_Btn(driver).click();
   	
   	driver.switchTo().frame(0);
   	driver.findElement(By.name("fname")).sendKeys("jinny");
   	driver.findElement(By.name("lname")).sendKeys("jinny@gmail.com");
   	System.out.println("Switched to first frame");
   	System.out.println(" ");
   	
   	WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='has-background-white']"));
   	
    driver.switchTo().frame(frame1);
    driver.findElement(By.xpath("/html/body/app-root/app-innerframe/div/div/div/div/div/input")).sendKeys("abc@gmail.com");
   	System.out.println("Switched to second frame");
   	
   }

}
