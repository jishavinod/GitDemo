package Carrierapp.Framework_Carrier;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTest_c 
{
	public  AndroidDriver driver;
	@BeforeClass
public void configureappium() throws MalformedURLException
{
	//AppiumDriverLocalService service=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\JISHA VINOD\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
	//.withIPAddress("127.0.0.1").usingPort(4723).build();
	//service.start();
		
		 UiAutomator2Options options= new UiAutomator2Options();
		 options.setDeviceName("moto x4_Jisha");
		options.setApp("D:\\JAVAWS\\appiumudemy\\src\\test\\java\\resources\\Carrier.apk"); 

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		
}
}
