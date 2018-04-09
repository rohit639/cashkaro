package com.cashkaro.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.cashkaro.util.BaseWebdriver;
import com.cashkaro.util.FunctionLib;
import com.cashkaro.util.Locators;
import com.cashkaro.util.LoggerClass;

public class BasePage {

	@FindBy(id = Locators.BasePage.header)
	public WebElement headear;

	@FindBy(id = Locators.BasePage.footer)
	public WebElement footer;

	@FindBy(id = Locators.BasePage.join)
	public WebElement join;

	@FindBy(id = Locators.BasePage.signIn)
	public WebElement signIn;

	protected static final Logger logger = LoggerClass.createLogger();

	public BasePage() {

		PageFactory.initElements(BaseWebdriver.getDriver(), this);
		verifyHeaderFooter();
	}

	public void verifyHeaderFooter() {
		Assert.assertTrue(FunctionLib.isElemntVisble(headear), "Failed to validate header of page");
		Assert.assertTrue(FunctionLib.isElemntVisble(footer), "Failed to validate footer of page");
	}
}
