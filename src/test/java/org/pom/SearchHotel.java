package org.pom;

import org.junit.Assert;
import org.login.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass {
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement dDnLocation;
	
	@FindBy(id="hotels")
	private WebElement dDnHotels;
	
	@FindBy(id="room_type")
	private WebElement dDnRoomtype;
	
	@FindBy(id="room_nos")
	private WebElement dDnNoofRooms;
	
	@FindBy(id="datepick_in")
	private WebElement txtcheckInDate;
	
	@FindBy(id="datepick_out")
	private WebElement txtcheckOutDate;
	
	@FindBy(id="adult_room")
	private WebElement dDnAdultPerRoom;
	
	@FindBy(id="child_room")
	private WebElement dDnChildrenPerRoom;
	
	@FindBy(id="Submit")
	private WebElement btnSearch;

	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnHotels() {
		return dDnHotels;
	}

	public WebElement getdDnRoomtype() {
		return dDnRoomtype;
	}

	public WebElement getdDnNoofRooms() {
		return dDnNoofRooms;
	}

	public WebElement getTxtcheckInDate() {
		return txtcheckInDate;
	}

	public WebElement getTxtcheckOutDate() {
		return txtcheckOutDate;
	}

	public WebElement getdDnAdultPerRoom() {
		return dDnAdultPerRoom;
	}

	public WebElement getdDnChildrenPerRoom() {
		return dDnChildrenPerRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}
	
	public void verifySearchHotel() {	
		WebElement txtsearchhotel = findElementByXpath("//td[contains(@class,'login_title')]");
		String text = getText(txtsearchhotel);
		Assert.assertEquals("verify search hotel", "Search Hotel(Fields marked with Red asterix(*) are mandatory)", text);
	}
	
	public void searchhotel(int location,int hotel,int roomtype,int noofroom,int adultperroom,int childperroom) {
		
		selectOptionsByIndex(dDnLocation, location);
		selectOptionsByIndex(dDnHotels, hotel);
		selectOptionsByIndex(dDnRoomtype, roomtype);
		selectOptionsByIndex(dDnNoofRooms, noofroom);
		selectOptionsByIndex(dDnAdultPerRoom, adultperroom);
		selectOptionsByIndex(dDnAdultPerRoom, childperroom);
		click(btnSearch);
	}
			
	

}
