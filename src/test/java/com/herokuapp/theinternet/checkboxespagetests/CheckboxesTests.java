package com.herokuapp.theinternet.checkboxespagetests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.CheckboxesPage;
import com.herokuapp.theinternet.pages.WelcomePage;

public class CheckboxesTests extends TestUtilities{

	@Test
	public void selectingTwoCheckboxesTest() {
		// TODO Auto-generated constructor stub
		log.info("Starting selectingTwoCheckboxesTest");
		
		// open main page
		WelcomePage welcomePage = new WelcomePage(driver, log);
		welcomePage.openPage();
		
		//click on Checkboxes link
		CheckboxesPage checkboxesPage = welcomePage.clickCheckboxesLink();
		
		// Select all check boxes
		checkboxesPage.selectAllCheckboxes();
		
		
		// verify all check boxes are clicked
		Assert.assertTrue(checkboxesPage.areAllCheckboxesChecked(), "Not all checkboxes are selected");
		
	}

}
