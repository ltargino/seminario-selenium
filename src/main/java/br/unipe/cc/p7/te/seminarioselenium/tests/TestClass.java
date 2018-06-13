package br.unipe.cc.p7.te.seminarioselenium.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import br.unipe.cc.p7.te.seminarioselenium.resources.WebDriverManager;

public abstract class TestClass {
	
	protected WebDriver driver;
	
	@Before
	public void Before() {
		driver = WebDriverManager.GetDriver();
	}	
	
	@After
	public void After() {
		driver.close();
	}
	
}
