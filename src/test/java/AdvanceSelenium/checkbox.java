package AdvanceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkbox {

	public static void main(String[]args) {
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement chek1 = driver.findElement(By.xpath("(//input[@type ='checkbox'])[1]"));
		
		WebElement chek2 = driver.findElement(By.xpath("(//input[@type ='checkbox'])[2]"));
		
		if(!chek1.isSelected()) {
			
			chek1.click();
			
		}
		else {
			System.out.println("check box 1 is already selected");
		}
		if(chek2.isDisplayed()) {
			chek2.click();
		}
		

}
	}
