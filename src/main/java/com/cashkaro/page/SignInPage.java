package com.cashkaro.page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.cashkaro.util.BaseWebdriver;
import com.cashkaro.util.FunctionLib;
import com.cashkaro.util.Locators;

public class SignInPage extends BasePage {
	
	@FindBy(id=Locators.SignInPage.forgotPasswrod)
	WebElement forgotPassword;
	
	@FindBy(id=Locators.SignInPage.layoutSignIn)
	WebElement layoutSign;

	@FindBy(id=Locators.SignInPage.password)
	WebElement password;

	@FindBy(id=Locators.SignInPage.signInLayout)
	WebElement signInLayout;

	@FindBy(id=Locators.SignInPage.userName)
	WebElement userName;
	
	private static final String usrName="KdcemBq@dummy.com";
	private static final String psswrd="N2d61D7";
	

	
	public SignInPage() {
		PageFactory.initElements(BaseWebdriver.getDriver(), this);
		Assert.assertTrue(FunctionLib.isElemntVisble(signInLayout),"Failed to validate element is visiable to user");
	}

	public MyAccountPage verifySignIn() {
		userName.sendKeys(usrName);
		password.sendKeys(psswrd);
		layoutSign.click();
		return new MyAccountPage();
	}
	
	public ForgotPasswordPage navigateToForgotPassword() {
		forgotPassword.click();
		return new ForgotPasswordPage();
	}
	
}
