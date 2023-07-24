package z_other;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import baseClass.OpenBrowser;
import utility.Parametrization;
import utility.TakeScreenshot;

public class A_testingClasss {

	public static void main(String[] args) {
		
//		
//		OpenBrowser.launchEdge("https://demoblaze.com/index.html");
//		OpenBrowser.launchChrome("https://www.facebook.com/");
//		
//		
			
		System.setProperty("edge.driver.web.driver", System.getProperty("user.dir") + File.separator + "src"
				+ File.separator + "main" + File.separator + "resources" + File.separator + "msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		TakeScreenshot.captureScreenshot_file(driver, "ok");

	}
}
