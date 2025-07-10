package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pages.openpage;

public class FormPage extends Basetest1 {
	@Test
   public static void case1()
   {

   	driver.get("https://letcode.in/test");
   	openpage.formpage_Btn(driver).click();
   	Actions action = new Actions(driver);
   	
   	WebElement firstname = driver.findElement(By.id("firstname"));
   	WebElement lastname = driver.findElement(By.id("lasttname"));
   	action.keyDown(firstname, Keys.SHIFT)
       	  .sendKeys(firstname, "jinny")
   	      .keyUp(firstname, Keys.SHIFT)
   	      .build()
   	      .perform();
   	   	
   	action.keyDown(lastname, Keys.SHIFT)
 	  .sendKeys(lastname, "jacob")
	      .keyUp(lastname, Keys.SHIFT)
	      .build()
	      .perform();
   	
   	WebElement email = driver.findElement(By.id("email"));
   	
   	action.keyDown(email, Keys.BACK_SPACE)
          .sendKeys(email, "jinny@abc.com")
   	      .build().perform();
   	
   	System.out.println("filled the first name, lastname and email using action class");
   	
  	}
	@Test
	public static void case2() throws InterruptedException 
	{
		driver.get("https://letcode.in/test");
	   	openpage.formpage_Btn(driver).click();
	   	
	   	WebElement countrycode = driver.findElement(By.xpath("/html/body/app-root/app-forms/section[1]/div/div/div[1]/div/div/form/div[2]/div[2]/div/div/div/select"));
	   	Select code = new Select(countrycode);
	   	
	   	code.selectByIndex(6);
	   	Thread.sleep(1000);
	   	code.selectByValue("44");
	   	
	 	System.out.println("filled the code using select class");
	}
	
	@Test
	public static void case3() 
	{
		driver.get("https://letcode.in/test");
	   	openpage.formpage_Btn(driver).click();
	   	
	   	driver.findElement(By.id("Phno")).sendKeys("9876543210");
	   	driver.findElement(By.id("Addl1")).sendKeys("-");
	   	driver.findElement(By.id("Addl2")).sendKeys("-");
	   	driver.findElement(By.id("state")).sendKeys("-");
	   	driver.findElement(By.id("postalcode")).sendKeys("-");
	   	
	}
	
}

