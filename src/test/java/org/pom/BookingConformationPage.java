package org.pom;

import java.io.IOException;

import org.login.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConformationPage extends BaseClass {
	
	public BookingConformationPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_no")
	private WebElement txtorderid;

	public WebElement getTxtorderid() {
		return txtorderid;
	}
	
	public void BookingConformation() throws IOException {
		
		String orderid = getAttributeValue(txtorderid);
		
		createCell(1, 8, orderid);
		
		
	}
	

}
