package com.atcost.Testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Unify.Base.BaseTest;
import com.Unify.util.Xls_Reader;
import com.UnifyPage.HomePage;
import com.UnifyPage.LoginPage;
import com.UnifyPage.UniversityPage;

public class QuestionTest extends BaseTest {
	LoginPage loginPage;
	HomePage homePage;
	UniversityPage universityPage;
	
	public QuestionTest() {
		super();
	}
	@BeforeMethod
	public void first() {
		inbokebrowser();
		loginPage=new LoginPage();
		homePage=new HomePage();
	    universityPage = new UniversityPage();
	
	     
	}
	@Test
	public void Question3() {
		loginPage= homePage.cilikonLoginlink();
		universityPage=loginPage.Loginprocess();
		
		universityPage.clickonAdmin();
		universityPage.coursesicon();
		universityPage.changeTeachericon();
		universityPage.section();
		universityPage.Techer();
		
	}
	
	@AfterMethod
	public void close() {
		//driver.quit();
		
	}

}
