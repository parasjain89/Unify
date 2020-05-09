package com.UnifyPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import com.Unify.util.Xls_Reader;

public class LoginPage  extends com.Unify.Base.BaseTest {
	
	
	@FindBy(how = How.XPATH, using = "//*[@id='UserName']")
	private WebElement user;

	@FindBy(how = How.XPATH, using = "//*[@id='Password']")
	private WebElement Pass;
	@FindBy(how = How.XPATH, using = "//*[@type='submit']")
	private WebElement Submitbutton;
	
	
 
	public LoginPage () {
		PageFactory.initElements(driver, this);
	}
			
	public UniversityPage Loginprocess ()   {
		bwaitclass();
		bwaitclass();
		//user.sendKeys("inpodssa.mech@galgotiasuniversity.edu.in");
		user.sendKeys(pro.getProperty("UserName"));
		bwaitclass();
		bwaitclass();
		//Pass.sendKeys("techone");
		Pass.sendKeys(pro.getProperty("password"));
		Submitbutton.click();
		 
		return new UniversityPage();
		 
	
	}}
