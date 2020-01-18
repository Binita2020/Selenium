package Package;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
public class TestGmail {
	WebDriver driver;
	
	
	
//	public void invokeBrowser(){
	
	@Test(priority=1)
	public void OpenBrowser()
	{
		 System.setProperty("webdriver.ie.driver", "lib/IEDriverServer.exe");
		 DesiredCapabilities d = DesiredCapabilities.internetExplorer();
			d.setCapability("nativeEvents", false);
			d.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			d.setCapability(CapabilityType.BROWSER_NAME, "IE");
			d.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
	   	 driver = new InternetExplorerDriver();
	    driver.manage().window().maximize();
	}
				 
	@Test(priority=2)
	public void LaunchGmail() throws InterruptedException
	{
	    
		  driver.get("https://www.gmail.com/");
		Thread.sleep(3000);  
		  
	}
	
	@Test(priority=3)
	public void SignIn() throws InterruptedException
	{
	
		driver.findElement(By.id("identifierId")).sendKeys("TanuTesting1");
		driver.findElement(By.id("identifierNext")).sendKeys(Keys.ENTER);
		//driver.findElement(By.className("lCoei YZVTmd SmR8")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);  
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("TanuTesting123");
		driver.findElement(By.id("passwordNext")).sendKeys(Keys.ENTER);
	}
	
	@Test(priority=4)
	public void GetURL()
	{
	System.out.println(driver.getCurrentUrl());

	}
	@Test(priority=5)
	public void DriverClose()
	{
		driver.close();
	}
	
}


/*	  String expectedTitle = "Facebook - log in or sign up";
String actualTitle = driver.getTitle();
     if (actualTitle.contentEquals(expectedTitle)){
      System.out.println("Test Passed!");
     } else {
      System.out.println("Test Failed");
     }
     */
