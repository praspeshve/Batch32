package scenario1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario_2 implements Constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		WebDriver driver = new FirefoxDriver();;
		
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys("Rings");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		WebElement Gender = driver.findElement(By.xpath("//span[.='Gender']"));
		Actions act = new Actions(driver);
		act.moveToElement(Gender).click().perform();
		String count = driver.findElement(By.xpath("//span[.='(1696)']")).getText();
		System.out.println(count);
		driver.quit();
	}

}
