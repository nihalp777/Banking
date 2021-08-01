package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class SendEmailFromYahooMail {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-IN&.intl=in&.done=https%3A%2F%2Fin.mail.yahoo.com%2Fd");
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.findElement(By.id("login-username"));
	  WebElement username = driver.findElement(By.id("login-username"));
	  Thread.sleep(1000);
	  username.sendKeys("nihal_patel7@yahoo.com");
	  Thread.sleep(2000);
	  driver.findElement(By.id("login-signin")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("login-passwd"));
	  WebElement password = driver.findElement(By.id("login-passwd"));
	  password.sendKeys("Neelkantha");
	  Thread.sleep(2000);
	  driver.findElement(By.id("login-signin")).click();
	  Thread.sleep(2000);

	  String actualTitle = "nihal_patel7@yahoo.com - Yahoo Mail";
	  
	  String expectedTitle = driver.getTitle();
	  
	  assertEquals(actualTitle , expectedTitle);
	  
	  
	  driver.findElement(By.xpath("//a[text()='Compose']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("message-to-field")).sendKeys("ketan@paratussystems.com");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@class='q_T y_Z2hYGcu je_0 jb_0 X_0 N_fq7 G_e A_6EqO C_Z281SGl ir_0 P_0 bj3_Z281SGl b_0 j_n d_72FG em_N']")).sendKeys("Hi Ketan .. I am Nihal");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@class='rte em_N ir_0 iy_A iz_h N_6Fd5']")).sendKeys("I have done my assignment");
	  Thread.sleep(2000);
	  //	  driver.findElement(By.xpath("//span[text()='Send']")).click();
	  driver.findElement(By.xpath("//span[@class='D_F ab_C gl_C W_6D6F']")).click();
	  
	  Thread.sleep(2000);
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\GS-2350\\workspace\\WebDriverTraining\\test\\resources\\chromedriver.exe");
	  driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }

}