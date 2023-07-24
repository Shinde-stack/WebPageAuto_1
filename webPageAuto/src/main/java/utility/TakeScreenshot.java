package utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class TakeScreenshot {

     public static String captureScreenshot_file(WebDriver driver,String scName) {
    	 
 //   	 Date dt=new Date();
    	 
    	 
    	File fileSource= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	 
    	String scPath =System.getProperty("user.dir")+File.separator+"myScreenshots"+File.separator+scName+".png";

    	File fileDest= new File(scPath);
    	
    	try 
    	{
			FileHandler.copy(fileSource, fileDest);
		} 
    	catch (IOException e) 
    	{
    		System.out.println("failed to copy screenshot from source to destination ");
			e.printStackTrace();
		}
    	
    	 return scPath;
     }
     
  
     
}
