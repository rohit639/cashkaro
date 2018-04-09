package com.cashkaro.demo;

import org.testng.annotations.Test;

import com.cashkaro.page.LandingPage;
import com.cashkaro.util.BaseWebdriver;

public class Testing extends BaseWebdriver {

	@Test(groups = { "regression", "all", "p1", }, priority = 1, enabled = true)
	public void signUp() {
		LandingPage page = new LandingPage();
		page.navigateToJoinPage().joinPage("normal");

	}

	@Test(groups = { "regression", "all", "p1", }, priority = 1, enabled = true)
	public void signIn() {
		LandingPage page = new LandingPage();
		page.navigateToSignInPage().verifySignIn();

	}

	@Test(groups = { "regression", "all", "p1", }, priority = 1, enabled = true)
	public void forgotPassword() {
		LandingPage page = new LandingPage();
		page.navigateToSignInPage().navigateToForgotPassword().verifyForgotPswd();

	}

}
