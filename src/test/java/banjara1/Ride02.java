package banjara1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import banjara1.Ride01;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
public class Ride02 extends Ride01 {
	AndroidDriver<AndroidElement> driver;
	@BeforeTest
	public void Before() throws IOException, InterruptedException {
		service = startServer();
		driver = capabilities(deviceName, plateformName,AppActivity,AppPackage);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	    @Test(enabled = true)
	    public void task1() throws InterruptedException {
		
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"OK\")")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"BOOK NOW\")")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Hire Bike\")")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Splendor+\"))").click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(MobileBy.className("android.widget.ImageView")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"7 days 0 hr\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
  	    driver.findElement(MobileBy.xpath("//android.view.View[@content-desc=\"14 February 2024\"]")).click();
	 
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"18\")")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"OK\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.BACK));
		driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.BACK));
		driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.BACK));
		
	}
	    @Test(enabled = true)
	    public void task2() {
	    	
			//driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"OK\")")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"My Tools\")")).click();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Bookings\")")).click();
		
			driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup")).click();
			driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Search\")")).sendKeys("Activa");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup")).click();
		
			driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.BACK));
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.BACK));
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Home\")")).click();
	     
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    }
	    @Test(enabled = true)
	    public void task3() {
	 			
//	 			driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"OK\")")).click();
	 			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 			
	 	        driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Call Us\")")).click();
	 				
	 	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 	        driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.BACK));
	 			
	 			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 			
	 			driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.BACK));
	 			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 			
	 			driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.BACK));
	 			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 			
	 			driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.BACK));
	 			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 		}






		}  
		    

