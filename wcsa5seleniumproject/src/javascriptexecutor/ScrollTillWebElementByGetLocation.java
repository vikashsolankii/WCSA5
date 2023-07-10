package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTillWebElementByGetLocation {

	public static void main(String[] args) {
	    	script();
	    }
	    public static void script() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_96612yg6jw_e&adgrpid=60571832564&hvpone=&hvptwo=&hvadid=610644605478&hvpos=&hvnetw=g&hvrand=15476553367585909351&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9300140&hvtargid=kwd-296458795081&hydadcr=14452_2316413");
		WebElement tElement=driver.findElement(By.xpath("//span[text()='Gift for men']"));
		Point loc = tElement.getLocation();
		int xAxis = loc.getX();
		int yAxis = loc.getY();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+xAxis+","+yAxis+")");

	}
	

}
