package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BankLoginPage {
protected WebDriver d;

private  By txt_username = By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");

private  By txt_pwd = By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");




public void enterUsername(String username) {
	d.findElement(txt_username).sendKeys(username);
	
}

public void enterpassword(String pwd) {
	d.findElement(txt_pwd).sendKeys(pwd);
	
}
}
