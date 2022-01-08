package org.pom;

import java.io.IOException;

import org.junit.Assert;
import org.login.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends BaseClass {
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement txtFirstName;
	
	@FindBy(id="last_name")
	private WebElement txtLast;
	
	@FindBy(id="address")
	private WebElement txtAddress;
	
	@FindBy(id="cc_num")
	private WebElement txtCard;
	
	@FindBy(id="cc_type")
	private WebElement dwnCardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement dwnMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement dwnyear;
	
	@FindBy(id="cc_cvv")
	private WebElement txtCVVCard;
	
	@FindBy(id="book_now")
	private WebElement btnBook;

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLast() {
		return txtLast;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCard() {
		return txtCard;
	}

	public WebElement getDwnCardType() {
		return dwnCardType;
	}

	public WebElement getDwnMonth() {
		return dwnMonth;
	}

	public WebElement getDwnyear() {
		return dwnyear;
	}

	public WebElement getTxtCVVCard() {
		return txtCVVCard;
	}

	public WebElement getBtnBook() {
		return btnBook;
	}
	
	public void verifyBookHotel() {
		WebElement txtbookhotel = findElementByXpath("//td[contains(text(),'Book A Hotel')]");
		String text3 = getText(txtbookhotel);
		Assert.assertEquals("verify booh hotel", "Book A Hotel", text3);
	}
	public void BookHotel() throws IOException {
		
		sendKeys(txtFirstName, getData("demo1", 1, 2));
		sendKeys(txtLast, getData("demo1", 1, 3));
		sendKeys(txtAddress, getData("demo1", 1, 4));
		sendKeys(txtCard, getData("demo1", 1, 5));
		selectOptionsByIndex(dwnCardType, 1);
		selectOptionsByIndex(dwnMonth, 5);
		selectOptionsByIndex(dwnyear, 3);
		sendKeys(txtCVVCard, getData("demo1", 1, 6));
		click(btnBook);
		
		
	}
	
	
	
	

}