package org.pom;

import org.junit.Assert;
import org.login.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass {
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement dDnselect;
	
	@FindBy(id="continue")
	private WebElement dDnContinue;

	public WebElement getdDnselect() {
		return dDnselect;
	}

	public WebElement getdDnContinue() {
		return dDnContinue;
	}
	
	public void verifySelectHotel() {
		
		WebElement txtselecthotel = findElementByXpath("//td[contains(text(),'SelectHotel')]");
		
		String text2 = getText(txtselecthotel);
		System.out.println(text2);
		Assert.assertEquals("verify select hotel","Select Hotel",text2);
	}
		
		public void selectHotel() {
		click(dDnselect);
		click(dDnContinue);
		}
	}
	
	


