import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class NewTest1 {
	

	String baseUrl = "http://newtours.demoaut.com";
    WebDriver driver;
	
  @Test
  public void f() {
	  System.out.println("Test");
	  String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = "";
      actualTitle = driver.getTitle();
	Assert.assertEquals(actualTitle,expectedTitle);
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method ");
	  System.setProperty("webdriver.gecko.driver", "C:\\D\\tools\\geckodriver\\geckodriver.exe");
	  driver = new FirefoxDriver();   
	  driver.get(baseUrl);
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
	  driver.quit();
	  
  }

}
