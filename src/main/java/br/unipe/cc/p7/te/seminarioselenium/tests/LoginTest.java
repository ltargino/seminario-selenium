package br.unipe.cc.p7.te.seminarioselenium.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.unipe.cc.p7.te.seminarioselenium.utils.Constants;

public class LoginTest extends TestClass {

	@Test
	public void RunLoginTestSucess() {
		
		//Efetua Login
		String inputUserID = "name";
		String inputPasswordID = "pass";
		String inputLoginButtonXPath = "//*[@id=\"pwd-container\"]/div[2]/section/form/fieldset/input[3]";
		
		this.driver.get(Constants.Helpdesk_Engeselt_URL);
		
		WebElement inputUser = this.driver.findElement(By.id(inputUserID));
		WebElement inputPassword = this.driver.findElement(By.id(inputPasswordID));
		WebElement inputLoginButton = this.driver.findElement(By.xpath(inputLoginButtonXPath));
		
		inputUser.sendKeys("larissa.targino");
		inputPassword.sendKeys("lary7206");
		inputLoginButton.click();
		
		//Validar Login
		String labelNameXPath = "/html/body/div[1]/nav/div/strong";
		
		WebElement labelName = this.driver.findElement(By.xpath(labelNameXPath));
		
		Assert.assertEquals("Larissa", labelName.getText());
		
	}
	
}
