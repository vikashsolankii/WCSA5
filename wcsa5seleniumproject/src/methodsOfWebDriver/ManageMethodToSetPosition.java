package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodToSetPosition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(null);
		Point point=new Point(200, 150);
		driver.manage().window().setPosition(point);
		Dimension dimension = new Dimension(5000, 4000);
		System.out.println(dimension);
		

	}

}
