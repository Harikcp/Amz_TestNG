package com.Pro.TestElem;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public static WebDriver driver;
	public LoginPage(WebDriver Idriver) {
		this.driver = Idriver;
		PageFactory.initElements(driver, this);

	}
    
      @FindBy(id = "nav-link-accountList")
      private WebElement Signin_option;
      
      public WebElement getSignin_option() {
		return Signin_option;
	}


	public void setSignin_option(WebElement signin_option) {
		Signin_option = signin_option;
	}


	public WebElement getSign_in() {
		return Sign_in;
	}


	public void setSign_in(WebElement sign_in) {
		Sign_in = sign_in;
	}


	public WebElement getEmail() {
		return email;
	}


	public void setEmail(WebElement email) {
		this.email = email;
	}


	public WebElement getPassword() {
		return password;
	}


	public void setPassword(WebElement password) {
		this.password = password;
	}


	public WebElement getNav_Menu() {
		return Nav_Menu;
	}


	public void setNav_Menu(WebElement nav_Menu) {
		Nav_Menu = nav_Menu;
	}


	public WebElement getAmaz_Menu() {
		return Amaz_Menu;
	}


	public void setAmaz_Menu(WebElement amaz_Menu) {
		Amaz_Menu = amaz_Menu;
	}


	public WebElement getAmz_Television() {
		return Amz_Television;
	}


	public void setAmz_Television(WebElement amz_Television) {
		Amz_Television = amz_Television;
	}


	public WebElement getAmz_Featured() {
		return Amz_Featured;
	}


	public void setAmz_Featured(WebElement amz_Featured) {
		Amz_Featured = amz_Featured;
	}

	  @FindBy(xpath = "//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][contains(text(),'Sign in')]")
      private WebElement Sign_in;
      
      @FindBy(xpath = "//input[@id='ap_email']")
      private WebElement email;
      
      @FindBy(xpath = "//input[@id='continue']")
      private WebElement email_continue;
      
      @FindBy(xpath = "//input[@id='ap_password']")
      private WebElement password;
      
      @FindBy(xpath = "//input[@id='signInSubmit']")
      private WebElement login;
      
      @FindBy(xpath = "//a[@id='nav-hamburger-menu']")
      private WebElement Nav_Menu;
      
      @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/ul[1]/li[10]/a[1]")
      private WebElement Amaz_Menu;
      
      @FindBy(xpath = "//a[@class='hmenu-item'][contains(text(),'Televisions')]")
      private WebElement Amz_Television;
      
      
      @FindBy(xpath = "//button[contains(text(),'Featured brands')]")
      private WebElement Amz_Featured;
      
      @FindBy(xpath = "//div[@class='acs-ln-links']//a[contains(text(),'OnePlus')]")
      private WebElement Oneplus;
      
      @FindBy(xpath = "//div[@class='acs-ln-links']//a[contains(text(),'Mi')]")
      private WebElement tv_mi;
      
      @FindBy(xpath = "//span[contains(text(),'Mi TV 4A PRO 80 cm (32 inches) HD Ready Android LE')]")
      private WebElement tv_select_32;

      public WebElement getMi_addchat() {
		return mi_addchat;
	}


	public void setMi_addchat(WebElement mi_addchat) {
		this.mi_addchat = mi_addchat;
	}

	@FindBy(xpath = "//input[@id='add-to-cart-button']")
      private WebElement mi_addchat;
      
	  public WebElement getOneplus() {
		return Oneplus;
	}


	public void setOneplus(WebElement oneplus) {
		Oneplus = oneplus;
	}


	public WebElement getTv_mi() {
		return tv_mi;
	}


	public void setTv_mi(WebElement tv_mi) {
		this.tv_mi = tv_mi;
	}


	public WebElement getTv_select_32() {
		return tv_select_32;
	}


	public void setTv_select_32(WebElement tv_select_32) {
		this.tv_select_32 = tv_select_32;
	}


	public WebElement getEmail_continue() {
		return email_continue;
	  }


	  public void setEmail_continue(WebElement email_continue) {
		this.email_continue = email_continue;
	  }


	  public WebElement getLogin() {
		return login;
	  }


	public void setLogin(WebElement login) {
		this.login = login;
	}
      
     
    
	
}

