package AdvanceSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDown {
	
	public static void main(String[]args) {
		
		WebDriver driver;
		
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver(); 
driver.get("https://the-internet.herokuapp.com/dropdown");
driver.manage().window().maximize(); 
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

WebElement dropDown = driver.findElement(By.xpath("//select[@id ='dropdown']"));

Select s = new Select(dropDown);
s.selectByValue("2");
s.deselectByVisibleText("Option 1");
s.deselectByIndex(0);

List<WebElement> myElements = s.getOptions();

for(WebElement str: myElements) {
	System.out.println(str);
}
		
	}

}
