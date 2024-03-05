package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps
{
	WebDriver driver;
	@Given("User is on login page")
	public void user_is_on_login_page() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.navigate().to("https://www.saucedemo.com/");
	}
	@When("User enters username and password")
	public void user_enters_username_and_password() throws InterruptedException 
	{
		driver.findElement(By.id("user-name")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
	}
	@And("clicks on login button")
	public void clicks_on_login_button() 
	{
		driver.findElement(By.id("login-button")).click();
	}
	
	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() throws Exception
	{
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
