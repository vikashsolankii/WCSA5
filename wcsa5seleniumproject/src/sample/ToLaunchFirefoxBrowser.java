package sample;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ToLaunchFirefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		new FirefoxDriver();



	}

}
