package sample;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("===Which browser you want to open");
		String browserValue=sc.next();
		if (browserValue.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.getCurrentUrl();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			//driver.close();
		}
			else if (browserValue.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.close();
				
			}
			else if (browserValue.equalsIgnoreCase("Edge")) {
				System.setProperty("webdriver.edge.driver","./drivers/edgedriver.exe");
				WebDriver driver=new EdgeDriver();
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.close();
				
				
			}
		
			
		}

	}


