package a_autoPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandling {

	public static void manageDropdown() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver dr = new ChromeDriver();

		dr.manage().window().maximize();
		dr.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(3000);
//
		WebElement country_Dropdown = dr.findElement(By.xpath("//select[@name='country']"));

		JavascriptExecutor jse = ((JavascriptExecutor) dr);
		jse.executeScript("arguments[0].scrollIntoView(true)", country_Dropdown);
		Thread.sleep(3000);

		Select select = new Select(country_Dropdown);

		select.selectByVisibleText("ANGOLA");

		List<WebElement> allOptionsWE = select.getOptions();
		for (WebElement we : allOptionsWE) {
			String option = we.getText();
			System.out.println(option);
		}

		Thread.sleep(2000);
		dr.close();

	}

	public static void main(String[] args) throws InterruptedException {

		DropdownHandling.manageDropdown();

	}
}
