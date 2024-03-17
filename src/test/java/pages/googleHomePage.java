package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class googleHomePage {
	
	WebDriver driver;
	
	public googleHomePage(WebDriver dr) {
		
		driver = dr;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(className ="gLFyf")
	WebElement searchBar;
	
	@FindBy(name ="btnK")
	WebElement searchButton;
	
	@FindBy(id ="result-stats")
	WebElement searchResult;
	
	public void enterProductNameInSearchBar(String product) {
		
		
		searchBar.sendKeys(product);
	}
	
	public void clickOnSearchButton() {
		searchButton.click();
	}
	public boolean verifySearchResult() throws InterruptedException { 
		
		Thread.sleep(3000);
		
		return searchResult.isDisplayed();
	}

}
