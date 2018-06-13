package br.unipe.cc.p7.te.seminarioselenium.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import br.unipe.cc.p7.te.seminarioselenium.utils.Constants;


public class GoogleSearchTest extends TestClass {

	@Test
	public void RunGoogleSearchTest() {
		
		String SearchInputID = "lst-ib";
		
		this.driver.get(Constants.Google_URL);
		
		WebElement input = this.driver.findElement(By.id(SearchInputID));
		
		input.sendKeys("Selenium Webdriver");
		input.sendKeys(Keys.RETURN);
		
		WebElement inputAfterSearch = this.driver.findElement(By.id(SearchInputID));
		
		Assert.assertEquals("Selenium Webdriver", inputAfterSearch.getAttribute("value"));
	
	}
	
}
