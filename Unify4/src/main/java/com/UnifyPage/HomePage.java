package com.UnifyPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends com.Unify.Base.BaseTest {
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Sign In")
	private WebElement Loginlink;
	
 
	public HomePage () {
		PageFactory.initElements(driver, this);
	}
			
	public LoginPage cilikonLoginlink ()  {
		driver.get(pro.getProperty("url"));
		bwaitclass();
		 driver.manage().window().maximize(); 
		 waitclass();
		 driver.getTitle();
		 Loginlink.click();
			
		return new LoginPage() ;
		
		 }
	
	}
