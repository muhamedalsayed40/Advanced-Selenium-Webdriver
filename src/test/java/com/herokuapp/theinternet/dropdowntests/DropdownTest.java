package com.herokuapp.theinternet.dropdowntests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.DropdownPage;
import com.herokuapp.theinternet.pages.WelcomePage;

public class DropdownTest extends TestUtilities {

	
	
	@Test
	public void optionTwoTest() {
		log.info("Starting optionTwoTest");
		
		// open main page
		WelcomePage welcomePage = new WelcomePage(driver, log);
		welcomePage.openPage();
		
		// click on drop down link
		DropdownPage dropdownPage = welcomePage.clickDropdownLink();
		
		// select option 2
		dropdownPage.selectOption(2);
		
		// verify the selected option
		String selectedOption = dropdownPage.getSelectedOption();
		Assert.assertTrue(selectedOption.equals("Option 2"), "Option 2 is not selected. Instead - " + selectedOption);
	}

}
