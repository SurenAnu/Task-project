package org.Home_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Pages {

	public static WebDriver driver;

	public Home_Pages(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
@FindBy(xpath = " //input[@class='name']")
	private WebElement name;

public WebElement getName() {
	return name;

}
	@FindBy(xpath = " //input[@class='email']")
	private WebElement mail;

	public WebElement getMail() {
		return mail;
	}
	
	@FindBy(xpath = " //input[@id='g2599-website']")
	private WebElement ur;

	public WebElement getUrl() {
		return ur;
	}
	
	@FindBy(xpath = " //select[@class='select']")
	private WebElement exper;

	public WebElement getExper() {
		return exper;
	}
	
	
	
	
	
	
	
	
	
	
	
}
