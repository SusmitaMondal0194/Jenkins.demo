package mavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class GoogleTest {
	WebDriver driver;
	
  @Test
  public void LaunchTest() {
	  
	  String expected = "Google";
	  String actual = driver.getTitle();
	  Assert.assertEquals(actual, expected);
  }
  
  @BeforeTest
  public void LaunchAppTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUSMITAMONDAL\\Desktop\\Desktop_8ThFeb2019\\Manipal_Training Time documents\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("http://www.google.com");
  }

  @AfterTest
  public void CrowserCloseTest() {
	  driver.quit();
  }

}
