package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class HerokuappHelloWorld {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");
	  
	  driver.findElement(By.xpath("//button[text()='Start']")).click();
	  
	  String actualOutput = driver.findElement(By.xpath("//h4[text()='Hello World!']")).getText();
	  String expectedOutput = "Hello World!";
	  assertEquals(actualOutput, expectedOutput);
	
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\GS-2350\\workspace\\WebDriverTraining\\test\\resources\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }

}
