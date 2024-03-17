package steps;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import common.googleBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.googleHomePage;

public class searchProduct extends googleBase {

	
	googleHomePage gp;
	

	@Given("i am at the google homepage")
	public void i_am_at_the_googl_homepage() {
		
		LaunchBrowser();

		
	}

	@When("i entered {string} in the search bar")
	public void i_entered_in_the_search_bar(String string) {

		gp = new googleHomePage(driver);
		
		gp.enterProductNameInSearchBar(string);
	}

	@When("i click the search button")
	public void i_click_the_search_button() {

		gp.clickOnSearchButton();
	}

	@Then("i can see the result successfully")
	public void i_can_see_the_result_successfully() throws InterruptedException {
		
		Assert.assertTrue(gp.verifySearchResult());
		closeAll();
		
	}

}
