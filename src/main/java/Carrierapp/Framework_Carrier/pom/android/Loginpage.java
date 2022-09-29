package Carrierapp.Framework_Carrier.pom.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Loginpage 
{
	AndroidDriver driver;
	public Loginpage(AndroidDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="com.android.packageinstaller:id/permission_allow_button")
	private WebElement allow;
	
	@AndroidFindBy(id="com.veritread.carrier.debug:id/textViewQA")
	private WebElement QA;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='com.veritread.carrier.debug:id/textViewEmail']")
	private WebElement usern;
	
	@AndroidFindBy(id="com.veritread.carrier.debug:id/textViewPassword")
	private WebElement password;
	
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='com.veritread.carrier.debug:id/activity_login_next_btn']")
	private WebElement loginbtn;
	
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='com.veritread.carrier.debug:id/buttonNext']]")
	private WebElement next2;
	
	
	public void tapallow()
	{
	allow.click();
	}
	
	public void tapQA()
	{
	QA.click();
	}
	
	public void enterusername(String un)
	{
	usern.sendKeys(un);
	}
	
	public void enterpwd(String pswd)
	{
		password.sendKeys(pswd);
	}
	
	public void taplogin()
	{
	loginbtn.click();
	}
	
	//public void tapnext2()
	{
	next2.click();
	}
	
}
