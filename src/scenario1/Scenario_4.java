package scenario1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario_4  implements Constant{
	public static void main(String[] args) {
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		WebDriver driver = new FirefoxDriver();;
		driver.get(url);
		System.out.println("abc");
		
	}
	
}
