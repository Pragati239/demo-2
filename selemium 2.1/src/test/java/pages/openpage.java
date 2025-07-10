package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class openpage {

public static WebElement element;


	public static WebElement input_btn(WebDriver driver)
	{
        element = driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[2]/app-menu/div/footer/a"));
		return element;
	} 
	public static WebElement text_box(WebDriver driver)
	{
		element= driver.findElement(By.id("fullName"));
		return element;
	}
	public static WebElement TAB_btn(WebDriver driver)
	{
		element=   driver.findElement(By.id("join"));
		return element;
	}
	public static WebElement button_btn(WebDriver driver)
	{
		element= driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[3]/app-menu/div/footer/a"));
		return element;
	}
	public static WebElement position(WebDriver driver)
	{
		element = driver.findElement(By.id("position"));
		return element;
		
	}
	public static WebElement enabledbtn(WebDriver driver)
	{
		element = driver.findElement(By.id("isDisabled"));
		return element;
	}
	
	public static WebElement press_holdbtn(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"isDisabled\"]/div/h2"));
		return element;
	}
	public static WebElement select_page(WebDriver driver)
	{
		element = driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[4]/app-menu/div/footer/a"));
		return element;
	}
	
	public static WebElement dropdown_1(WebDriver driver)
	{
		element = driver.findElement(By.id("fruits"));
		return element;
	}
	
	public static WebElement dropdown_2(WebDriver driver)
	{
		element = driver.findElement(By.id("superheros"));
		return element;
	}
	
	public static WebElement dropdown_3(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"lang\"]"));
		return element;
	}
	
	public static WebElement radio_page(WebDriver driver)
	{
		element = driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[7]/app-menu/div/footer/a"));
		return element;
	}
	
	public static List<WebElement> radio_btn2(WebDriver driver)
	{
		List<WebElement> element = driver.findElements(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[3]/div/label/input"));
		return element;
	}
	
	public static WebElement checkbox1(WebDriver driver)
	{
		element = driver.findElement(By.xpath("/html/body/app-root/app-radio/section/div/div/div[1]/div/div/div[6]/label[2]"));
		return element;
	}
	
	
	
	public static WebElement Alert_pageBtn(WebDriver driver)
	{
		element = driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[5]/app-menu/div/footer/a"));
		return element;
	}
	
	public static WebElement Alert_sweet(WebDriver driver)
	{
		element = driver.findElement(By.cssSelector("body > app-root >app-alert > section.section.has-background-white-ter > div > div > div.column.is-7-desktop.is-8-tablet > div > div > div.modal.is-active > button"));
		return element;
	}
	
	public static WebElement Sort_pageBtn(WebDriver driver)
	{
		element = driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[4]/div/div/div/div[3]/app-menu/div/footer/a"));
		return element;
	}
	
	public static WebElement DragDrop_pageBtn(WebDriver driver)
	{
		element = driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[10]/app-menu/div/footer/a"));
		return element;
	}
	

	public static WebElement MultiSelect_pageBtn(WebDriver driver)
	{
		element = driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[13]/app-menu/div/footer/a"));
		return element;
	}
	
	public static WebElement Sel_Btn(WebDriver driver)
	{
		element = driver.findElement(By.xpath("/html/body/app-root/app-selectable/section/div/div/div[1]/div/div/div/div/div/div[3]"));
		return element;
	}
	
	public static WebElement Post_Btn(WebDriver driver)
	{
		element =  driver.findElement(By.xpath("/html/body/app-root/app-selectable/section/div/div/div[1]/div/div/div/div/div/div[7]"));
		return element;
	}
	
	public static WebElement Test_Btn(WebDriver driver)
	{
		element =  driver.findElement(By.xpath("/html/body/app-root/app-selectable/section/div/div/div[1]/div/div/div/div/div/div[6]"));
		return element;
	}
	
	public static WebElement framepage_Btn(WebDriver driver)
	{
		element =  driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[6]/app-menu/div/footer/a"));
		return element;
	}
	public static WebElement waitpage_Btn(WebDriver driver)
	{
		element =  driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[15]/app-menu/div/footer/a"));
		return element;
	}
	public static WebElement sliderpage_Btn(WebDriver driver)
	{
		element =  driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[14]/app-menu/div/footer/a"));
		return element;
	}
	
	public static WebElement tableepage_Btn(WebDriver driver)
	{
		element =  driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[16]/app-menu/div/footer/a"));
		return element;
	}
	public static WebElement formpage_Btn(WebDriver driver)
	{
		element =  driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[19]/app-menu/div/footer/a"));
		return element;
	}
	public static WebElement calendarpage_Btn(WebDriver driver)
	{
		element =  driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[18]/app-menu/div/footer/a"));
		return element;
	}
	public static WebElement windowpage_Btn(WebDriver driver)
	{
		element =  driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[8]/app-menu/div/footer/a"));
		return element;
	}
	public static WebElement Drag_pageBtn(WebDriver driver)
	{
		element =  driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[10]/app-menu/div/footer/a"));
		return element;
	}
	
}


