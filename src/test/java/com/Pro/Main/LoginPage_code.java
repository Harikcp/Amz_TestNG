package com.Pro.Main;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pro.TestElem.LoginPage;

public class LoginPage_code extends Baseclass {


	static WebDriver driver;
    static LoginPage lg;
	
	@BeforeClass
	public void Details() {
	String str = "Testing the AMAZON Application";
		System.out.print(str);
		}
	
	@BeforeMethod
	public void App_Browser(){
		System.out.println("Before Method");	
	}
	
	@Test(priority = 0)
	public void Login() {
		 driver = browsers("Chrome");	
		geturl("https://www.amazon.in/");
		lg = new LoginPage(driver);
		Mouseover(lg.getSignin_option());
		Implicitwait(60);
		lg.getSign_in().click();
		Implicitwait(60);
		lg.getEmail().sendKeys("9940753444");
		Implicitwait(100);
		lg.getEmail_continue().click();
		Implicitwait(120);
		lg.getPassword().sendKeys("Harikcp@123");
		Implicitwait(120);
		lg.getLogin().click();
		Implicitwait(120);
		lg.getNav_Menu().click();
		Implicitwait(120);
		lg.getAmaz_Menu().click();
		Implicitwait(120);
		
	}

    @Test(priority = 1)
    public void Order() {
    	lg.getAmz_Television().click();
		Implicitwait(120);
		lg.getAmz_Featured().click();
		Implicitwait(120);
		lg.getTv_mi().click();
		Implicitwait(120);
		lg.getTv_select_32().click();
		Implicitwait(120);
		lg.getMi_addchat().click();
		Implicitwait(120);
		browser_close();
//      geturl("https://www.flipkart.com/");
//      Implicitwait(120);
//      browser_exit();
 }
	@AfterMethod
	public static void browser_close() {
		System.out.println("After Method");
	}
	@AfterClass
	public static void browser_exit() {
		
		System.out.println("After Class");
	
	
	}
}
