package org.testng;

import org.login.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

	public class ChromeLaunch extends BaseClass{
		
	    @Parameters({"UserName","Password"})
		@Test
		private void ChromeBrowser(String name,String pass) {
			chromeLaunch();
			getUrl("https://www.facebook.com/");
			maximize();
			WebElement txtusername = findElementById("email");
			sendKeys(txtusername,name);
			
			WebElement txtpassword = findElementById("pass");
			sendKeys(txtpassword, pass);
			WebElement btnlogin = findElementByName("login");
			click(btnlogin);
		}

}
