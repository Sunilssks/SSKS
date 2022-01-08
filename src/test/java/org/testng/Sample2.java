package org.testng;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample2 {
	
	@Parameters({"Browser"})
	@Test
	private void FireFoxbrowser(String url) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}

}
