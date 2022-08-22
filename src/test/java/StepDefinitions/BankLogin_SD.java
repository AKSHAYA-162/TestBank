package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.BankLoginPage;

public class BankLogin_SD {
	
	WebDriver d = new FirefoxDriver();
	 BankLoginPage BankloginPage = new BankLoginPage();

	 @Given("^user should enter (.*) and (.*)$") 
	    public void user_enters_name_and_pwd(String username, String pwd) throws InterruptedException  {
		 System.setProperty("webdriver.firefox.driver", "C:\\Users\\akshayabd\\Downloads\\CucumberJava\\CucumberJava\\geckodriver.exe");
			Thread.sleep(5000);
			d.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(5000);
			d.manage().window().maximize();
			
	       
	        
	        BankloginPage.enterUsername(username);
	        BankloginPage.enterpassword(pwd);
	        
	        d.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			Thread.sleep(2000);
	    }
	 
	 @And("enter employee id to search")
	 public void enter_employee_id_to_search() throws InterruptedException {
		 
		 d.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys("0297");
		 Thread.sleep(3000);
		 d.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
		 Thread.sleep(2000);
		 
		 
	 }
	 
	 @Then("click on edit button")
	 public void click_on_edit_button() throws InterruptedException {
		 
		 d.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]")).click();
		 Thread.sleep(2000);
		 
	 }
	 
	 @And("change some information and save")
	 public void change_some_information_and_save() throws InterruptedException {
		 d.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[2]/input")).sendKeys("10087");
		 Thread.sleep(2000);
		 
		 d.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div/div[2]/i")).click();
		 Thread.sleep(1000);
		 d.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div/div[1]")).click();
		 Thread.sleep(1000);
		 
		 d.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[5]/button")).click();
		 Thread.sleep(2000);
		 
	 }
}
