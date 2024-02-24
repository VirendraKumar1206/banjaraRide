package banjara1;
import org.testng.annotations.AfterTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Simple {
		public class simple extends Ride02 {
			AndroidDriver<AndroidElement> driver;
			@AfterTest
			public void last() {
				
				service.stop();
			}
		}
}
	
	
