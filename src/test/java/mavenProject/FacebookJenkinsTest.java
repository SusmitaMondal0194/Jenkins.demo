package mavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class FacebookJenkinsTest {
	WebDriver driver ;
  @Test
  public void f() {
	  driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Sumi");
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Roy");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9007322344");
		driver.findElement(By.id("u_0_v")).sendKeys("acc888");;
		Select s = new Select(driver.findElement(By.id("day")));
		s.selectByValue("23");
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Oct");
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue("1980");
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.id("u_0_11")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\SUSMITAMONDAL\\Desktop\\Desktop_8ThFeb2019\\Manipal_Training Time documents\\chromedriver.exe"); 
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}


