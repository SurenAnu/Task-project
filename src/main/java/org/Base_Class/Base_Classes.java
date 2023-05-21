package org.Base_Class;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Classes {
	public static void url(WebDriver d, String s ) {
		 d.get(s);
			}
	public static void max(WebDriver d) {
	    d.manage().window().maximize();
		}
	public static void min(WebDriver d) {
		d.manage().window().minimize();
			}
	public static void clk(WebElement e) {
	     e.click();
		 } 
	public static void actionclk(WebElement e,WebDriver d) {
Actions a = new Actions(d);
a.click().build().perform();
	}
	public static void actioncclk(WebElement e,WebDriver d) {
Actions a = new Actions(d);
a.contextClick().build().perform();
	}
   public static void close(WebDriver d) {
d.close();
}
   public static void currenturl(WebDriver d) {
d.getCurrentUrl();
}
public static void winhan(WebDriver d) {
String windowHandle = d.getWindowHandle();
}
public static void winhans(WebDriver d) {
Set<String> handles = d.getWindowHandles();
}

	
public static  void selint(WebElement e, int i) {
Select s = new Select(e);
s.selectByIndex(i);
	
}
public static  void selvalue(WebElement e, String ss ) {
Select s = new Select(e);
	s.selectByValue("ss");
}
	
public static  void seltext(WebElement e,String text ) {
Select s = new Select(e);
s.selectByVisibleText(text);
}

public static  void deselint(WebElement e, int i) {
Select s = new Select(e);
s.deselectByIndex(i);	
}

public static  void deseltext(WebElement e,String text ) {
Select s = new Select(e);
s.deselectByVisibleText(text);
}	
	
public static void clo(WebDriver d) {
d.close();
}
	
public static void sendke(WebElement e, String s) {
e.sendKeys(s);
}


public static void jsclk(WebDriver d, WebElement e) {

JavascriptExecutor j = (JavascriptExecutor) d;
j.executeScript("arguments[0].scrollIntoView();", e);
e.click();
}

public static void jj(WebDriver d , WebElement e) {
	JavascriptExecutor j = (JavascriptExecutor) d;

}
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		
		
	}
	
	
}
