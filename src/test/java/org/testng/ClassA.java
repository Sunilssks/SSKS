package org.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassA {
	
	WebDriver driver;
	@Parameters({"fburl"})
	@Test
	public void chromeBrowser(String url) {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
		driver.get(url);
	}
//	@Parameters({"adurl"})
//	@Test
//	public void fireFoxBrowser(String url) {
//		WebDriverManager.firefoxdriver().setup();
//		driver= new FirefoxDriver();
//		driver.get(url);
//	}
//	@Parameters({"grurl"})
//	
//	@Test
//	public void microsoftEdge(String url) {
//		WebDriverManager.edgedriver().setup();
//		driver = new EdgeDriver();
//		driver.get(url);
//
//}
}
