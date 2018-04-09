package com.cashkaro.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.cashkaro.util.BaseWebdriver;
import com.cashkaro.util.FunctionLib;
import com.cashkaro.util.Locators;

public class ForgotPasswordPage extends BasePage {

	@FindBy(xpath = Locators.ForgotPasswordPage.header)
	private WebElement header;

	@FindBy(xpath = Locators.ForgotPasswordPage.frame)
	private WebElement frame;

	@FindBy(id = Locators.ForgotPasswordPage.fromEmail)
	private WebElement fromEmail;

	@FindBy(id = Locators.ForgotPasswordPage.resetPassword)
	private WebElement resetPassword;

	@FindBy(xpath = Locators.ForgotPasswordPage.confirmMsg)
	private WebElement confirmMsg;

	@FindBy(id = "cboxWrapper")
	private WebElement forgotForm;

	private final static String email = "PF8rfmB@dummy.com";

	public ForgotPasswordPage() {
		PageFactory.initElements(BaseWebdriver.getDriver(), this);
		Assert.assertTrue(FunctionLib.isElemntVisble(forgotForm), "Failed to validate forgot password form is present");
		BaseWebdriver.getDriver().switchTo().frame(frame);
		Assert.assertTrue(FunctionLib.isElemntVisble(header), "Failed to validate header of page");
	}

	public void verifyForgotPswd() {
		fromEmail.sendKeys(email);
		resetPassword.click();
		Assert.assertTrue(FunctionLib.isElemntVisble(confirmMsg),
				"Failed to verify confirm message email sent for forgot password");
		BaseWebdriver.getDriver().switchTo().defaultContent();
	}

}
