package br.unipe.cc.p7.te.seminarioselenium.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {

	private static WebDriver driver;
	
	public static WebDriver GetDriver() {
		
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Larissa Targino\\Desktop\\Seminario-Selenium\\seminario-selenium\\src\\main\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		return driver;
	}
	
}
