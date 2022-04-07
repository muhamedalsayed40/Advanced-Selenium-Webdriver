package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage extends BasePageObject {

	private String pageUrl = "http://the-internet.herokuapp.com/";

	private By formAuthenticationLinkLocator = By.linkText("Form Authentication");

	private By checkboxesLinkLocator = By.linkText("Checkboxes");
	
	private By dropdownLinkLocator = By.linkText("Dropdown");
	
	private By javaScriptAlertsLinkLocator = By.linkText("JavaScript Alerts");
	
	private By multipleWindowsLinkLocator = By.linkText("Multiple Windows");
	
	private By editorLinkLocator = By.linkText("WYSIWYG Editor");
	
	public WelcomePage(WebDriver driver, Logger log) {
		super(driver, log);
	}

	/** Open WelcomePage with it's url */
	public void openPage() {
		log.info("Opening page: " + pageUrl);
		openUrl(pageUrl);
		log.info("Page opened!");
	}

	/** Open LoginPage by clicking on Form Authentication Link */
	public LoginPage clickFormAuthenticationLink() {
		log.info("Clicking Form Authentication link on Welcome Page");
		click(formAuthenticationLinkLocator);
		return new LoginPage(driver, log);
		
		
	}
	
	public CheckboxesPage clickCheckboxesLink() {
		
		log.info("Clicking Checkboxes link on welcome page");
		click(checkboxesLinkLocator);
		return new CheckboxesPage(driver, log);
	}

	// open dropdown page
	public DropdownPage clickDropdownLink() {
	
		log.info("clicking drop down link");
		click(dropdownLinkLocator);
		return new DropdownPage(driver, log);
	}
	// open javascript alert page
	
	public JavaScriptAlertsPage clickJavaScriptAlertsLink() {
		log.info("Clicking JavaScript Alerts link on Welcome Page");
		click(javaScriptAlertsLinkLocator);
		return new JavaScriptAlertsPage(driver, log);
	}
	
	public WindowsPage clickMultipleWindowsLink() {
		log.info("Clicking Multiple Windows link on Welcome Page");
		click(multipleWindowsLinkLocator);
		return new WindowsPage(driver, log);
	}
	
	public EditorPage clickWYSIWYGEditorLink() {
		log.info("Clicking WYSIWYG Editor link on Welcome Page");
		click(editorLinkLocator);
		return new EditorPage(driver, log);
	}

}