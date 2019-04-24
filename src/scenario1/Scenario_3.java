package scenario1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario_3 implements Constant{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		WebDriver driver = new FirefoxDriver();;
		driver.get(url);
		WebElement Elem = driver.findElement(By.xpath("//a[.='View More Collections']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Elem);
		driver.quit();
		
	}

}
