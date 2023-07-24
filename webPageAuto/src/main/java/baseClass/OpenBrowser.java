package baseClass;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import dev.failsafe.Timeout;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {

//"E:\1.2.gitRepo\webPageAuto\src\main\resources\msedgedriver.exe"

	public static WebDriver launchEdge(String url) {

		System.setProperty("edge.driver.web.driver", System.getProperty("user.dir") + File.separator + "src"
				+ File.separator + "main" + File.separator + "resources" + File.separator + "msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000)); //implicit wait..........1
		driver.manage().window().maximize();

		return driver;
	}

	public static WebDriver launchChrome(String url) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		return driver;
	}

}
