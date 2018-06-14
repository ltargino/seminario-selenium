package br.unipe.cc.p7.te.seminarioselenium.tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import br.unipe.cc.p7.te.seminarioselenium.resources.WebDriverManager;

public abstract class TestClass {
	
	protected static WebDriver driver;
	
	@BeforeClass
	public static void Before() {
		driver = WebDriverManager.GetDriver();
	}	
	
	@AfterClass
	public static void After() {
		driver.close();
	}
	
}
