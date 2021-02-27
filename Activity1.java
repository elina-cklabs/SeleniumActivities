package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {
		
		//ctrl+shift+o
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.quit();

	}

}
