package com.cashkaro.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.cashkaro.util.BaseWebdriver;
import com.cashkaro.util.FunctionLib;
import com.cashkaro.util.Locators;

public class MyAccountPage extends BasePage {

	@FindBy(id=Locators.MyAccountPage.myAccount)
	private WebElement myAccount;
	
	public MyAccountPage() {
		PageFactory.initElements(BaseWebdriver.getDriver(), this);
		Assert.assertTrue(FunctionLib.isElemntVisble(myAccount),"Failed to validate element is visiable to user");
	}
	
}
