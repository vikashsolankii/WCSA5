package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BySelectIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/shell/Desktop/QUERRY%20BACKUP/webElementDropDownMultiple.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement multi =driver.findElement(By.id("menu"));
		Select sel= new Select(multi);
		sel.selectByIndex(1);



	}

}
