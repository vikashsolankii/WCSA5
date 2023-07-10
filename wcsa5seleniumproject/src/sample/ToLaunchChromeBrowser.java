package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver","./drivers/chromedrivers.exe");
		// Upcasting into WebDriver
		WebDriver driver=new ChromeDriver();
 
         // To maximize Browser
         driver.manage().window().maximize();
         //Providing the delay time for 2 Sec
         //Thread.sleep(2000);
         // To close Browser
        // driver.close();
        
       
         
         
	}

}
