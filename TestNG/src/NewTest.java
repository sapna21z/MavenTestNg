import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class NewTest {
	WebDriver driver = null;
	
	@BeforeSuite
	public void setEnv(){
		
		driver = new FirefoxDriver();
		driver.get("file:///D:/Selenium%20Software/Offline%20Website/index.html");
	}
	
	@Test(priority=1)
	public void checkTitle() {
		String title= driver.findElement(By.xpath("html/body/div/div[2]/p")).getText();
	Assert.assertEquals(title, "Sign in to start your session");
	}
	
	@Test(priority=2)
	public void checkEmail() {
		String emailName= driver.findElement(By.id("email")).getText();
		Assert.assertEquals(emailName,"Email");
	}
  @Test(priority =3)
  public void checkPassword() {
	String passName  = driver.findElement(By.id("password")).getText();
	  Assert.assertEquals(passName,"password");
  }
 @AfterSuite
  
  public void closeBrowser() {
	  driver.close();
  }
}
