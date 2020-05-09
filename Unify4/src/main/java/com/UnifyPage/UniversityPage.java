package com.UnifyPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Unify.util.Xls_Reader;

public class UniversityPage extends com.Unify.Base.BaseTest {
	
	
	@FindBy(how = How.XPATH, using = "//*[@id='side-menu']/li[2]/a/span")
	private WebElement adminicon;
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Courses')])[1]")
	private WebElement courses;
	
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Courses')])[2]")
	private WebElement courseslink;
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Change Teacher')]")
	private WebElement changeTeacher;
	
	@FindBy(how = How.XPATH, using = "(//*[@name='Selected_SectionId'])[1]")
	private WebElement Selected_SectionId;
	
	@FindBy(how = How.XPATH, using = "(//*[@name='Selected_TeacherId'])[1]")
	private WebElement Selected_TeacherId;
	
	public UniversityPage () {
		PageFactory.initElements(driver, this);
	}
			
	public void clickonAdmin ()   {
		driver.getTitle();
		adminicon.click();
		
	}
	
	public void coursesicon ()   {
		courses.click();
		courseslink.click();}

	public void changeTeachericon ()   {
		changeTeacher.click();}
	
		
	public void section ()   {
		Select dropDown = new Select(Selected_SectionId);
		List<WebElement> e = dropDown.getOptions();
		int itemCount = e.size();
		
		Xls_Reader xlsreader = new Xls_Reader("./src/main/java/com/Unify/util/Projectdata.xlsx");
		 String sheetName = "Mechanical";
		 int rowcount =xlsreader.getRowCount(sheetName);
		 for(int rowNum=2;rowNum<=rowcount;rowNum++) {
		String items=	xlsreader.getCellData(sheetName,"Batch/Section",rowNum);
		//System.out.println(items);
		

		for(int l = 0; l < itemCount; l++)
		{
		   String item=e.get(l).getText();
			
			if(item.trim()==items.trim()) {
				System.out.println("Paras");
			}
			else {
				System.out.println(items);
			}
		}}
		
	}
		 public void Techer ()   {
				Select dropDown = new Select(Selected_TeacherId);
				List<WebElement> e = dropDown.getOptions();
				int itemCount = e.size();
				
				Xls_Reader xlsreader = new Xls_Reader("./src/main/java/com/Unify/util/Projectdata.xlsx");
				 String sheetName = "Mechanical";
				 int rowcount =xlsreader.getRowCount(sheetName);
				 for(int rowNum=2;rowNum<=rowcount;rowNum++) {
				String teacherid=	xlsreader.getCellData(sheetName,"Teacher id",rowNum);
				//System.out.println(items);
				

				for(int l = 0; l < itemCount; l++)
				{
				   String selecttecherid=e.get(l).getText();
					
					if(selecttecherid.trim()==teacherid.trim()) {
						System.out.println("jain");
					}
					else {
						System.out.println(teacherid);
					}
				}
					 
	}
		 }}
	


