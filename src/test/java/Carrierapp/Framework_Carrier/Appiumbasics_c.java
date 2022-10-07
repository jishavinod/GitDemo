package Carrierapp.Framework_Carrier;

import org.testng.annotations.Test;

import Carrierapp.Framework_Carrier.pom.android.Loginpage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

public class Appiumbasics_c extends BaseTest_c {
  /**
 * @throws MalformedURLException
 * @throws InterruptedException 
 */
@Test
  public void appiumtest() throws MalformedURLException, InterruptedException {

	Loginpage lg=new Loginpage(driver);  //test by deliya
	lg.tapallow();
	lg.tapQA();
	lg.enterusername("devna1@mailinator.com");
	lg.enterpwd("71028159");
	lg.taplogin();
	//lg.tapnext2();
	


	
	 //driver.findElement(AppiumBy.id("com.veritread.carrier.debug:id/textViewPassword")).sendKeys("71028159");
	// driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.veritread.carrier.debug:id/activity_login_next_btn']")).click();
	 //driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.veritread.carrier.debug:id/buttonNext']")).click();
			
	 System.out.println("End of the Test Case");
	 
  }

@Test
public void newtest()
{
	System.out.println("Test for git");
}
@Test
public void newtest2()
{
	System.out.println("Test2 for git");
}
  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("This is before test");
	  System.out.println("2nd change");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("This is after test");
	  System.out.println("2nd change");
  }

}
