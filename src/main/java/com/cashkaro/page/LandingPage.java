package com.cashkaro.page;

import org.openqa.selenium.support.PageFactory;

import com.cashkaro.util.BaseWebdriver;

public class LandingPage extends BasePage {

	public LandingPage() {

		PageFactory.initElements(BaseWebdriver.getDriver(), this);
	}

	public JoinFreePage navigateToJoinPage() {
		logger.info("Navigating to Join for free page...");
		join.click();
		return new JoinFreePage();
	}

	public SignInPage navigateToSignInPage() {
		logger.info("Navigating to Sign In page...");
		signIn.click();
		return new SignInPage();
	}
}
