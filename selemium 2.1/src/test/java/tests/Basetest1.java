package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Basetest1 {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void start_test() 
	{
		System.setProperty( 
	            "webdriver.chrome.driver",
	            "C:\\Users\\Admin\\Desktop\\Pragati data\\automation stuff\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
  
        driver = new ChromeDriver(); 
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 
        
    }
	//@BeforeMethod
	public void starttest()
	{
		System.out.println("------Execution start-------");
	}
	
	//AfterMethod
	public void Endtest()
	{
		System.out.println("------Execution done-------");
	}
	
	//@AfterTest
	public void end_test()
	{
		driver.close();
		System.out.println("Done");
	}
}
