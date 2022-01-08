package org.login;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class BaseCase1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseClass b = new BaseClass();
		b.chromeLaunch();
		b.getUrl("https://adactinhotelapp.com/index.php");
		b.maximize();
		
		WebElement txtuser = b.findElementById("username");
		String name = b.getData("demo1", 1, 0);
		b.sendKeys(txtuser, name);
		
		WebElement txtpass = b.findElementById("password");
		String pass = b.getData("demo1", 1, 1);
		b.sendKeys(txtpass, pass);
		
		WebElement btnlogin = b.findElementById("login");
		b.click(btnlogin);
		
		WebElement dwnloc = b.findElementById("location");
		b.selectOptionsByIndex(dwnloc, 2);
		
		WebElement dwnhotel = b.findElementById("hotels");
		b.selectOptionsByIndex(dwnhotel, 1);
		
		WebElement dwnroom = b.findElementById("room_type");
		b.selectOptionsByIndex(dwnroom, 0);
		
		WebElement dwnnoofroom = b.findElementById("room_nos");
		b.selectOptionsByIndex(dwnnoofroom, 5);
		
		WebElement dwnadult = b.findElementById("adult_room");
		b.selectOptionsByIndex(dwnadult, 2);
		
		WebElement dwnchild = b.findElementById("child_room");
		b.selectOptionsByIndex(dwnchild, 1);
		
		WebElement btnsubmit = b.findElementById("Submit");
		b.click(btnsubmit);
		
		Thread.sleep(3000);
		
		WebElement btnselect = b.findElementById("radiobutton_2");
		b.click(btnselect);
		
		WebElement btncontinue = b.findElementById("continue");
		b.click(btncontinue);
		
		Thread.sleep(3000);
		
		WebElement txtfirst = b.findElementById("first_name");
		String first = b.getData("demo1", 1, 2);
		b.sendKeys(txtfirst, first);
		
		WebElement txtlast = b.findElementById("last_name");
		String last = b.getData("demo1", 1, 3);
		b.sendKeys(txtlast, last);
		
		WebElement txtaddress = b.findElementById("address");
		String address = b.getData("demo1", 1, 4);
		b.sendKeys(txtaddress, address);
		
		WebElement txtcard = b.findElementById("cc_num");
		String card = b.getData("demo1", 1, 5);
		b.sendKeys(txtcard, card);
		
		WebElement cardtype = b.findElementById("cc_type");
		b.selectOptionsByIndex(cardtype, 1);
		
		WebElement dwnmonth = b.findElementById("cc_exp_month");
		b.selectOptionsByIndex(dwnmonth, 5);
		
		WebElement dwnyear = b.findElementById("cc_exp_year");
		b.selectOptionsByIndex(dwnyear, 5);
		
		WebElement txtcvv = b.findElementById("cc_cvv");
		String cvv = b.getData("demo1", 1, 6);
		b.sendKeys(txtcvv, card);
		
		WebElement btnbook = b.findElementById("book_now");
		b.click(btnbook);
		
		Thread.sleep(10000);
		
		WebElement txtfinal = b.findElementById("order_no");
		String text = b.getAttributeValue(txtfinal);
		System.out.println(text);
		
		WebElement btnlogout = b.findElementById("logout");
		b.click(btnlogout);
		
	}
	
}
