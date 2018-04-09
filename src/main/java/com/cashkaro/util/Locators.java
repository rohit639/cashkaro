package com.cashkaro.util;

public class Locators {

	public class BasePage {
		public static final String header = "imgTopSiteLogo";
		public static final String footer = "lblFooterCopyRight";
		public static final String join = "link_join";
		public static final String signIn = "link_signin";
	}

	public class ForgotPasswordPage {
		public static final String header = "//h2[contains(.,'FORGOT PASSWORD?')]";
		public static final String frame = "//div[@id='colorbox']//iframe";// "cboxIframe";
		public static final String fromEmail = "from_email";
		public static final String resetPassword = "submit_req";
		public static final String confirmMsg = "//h2[contains(.,'EMAIL SENT WITH NEW PASSWORD')]";
		public static final String forgotPswdForm = "cboxWrapper";
	}

	public class JoinFreePage {
		public static final String faceBook = "//a[contains(.,'JOIN WITH FACEBOOK')]";
		public static final String firstName = "firstname";
		public static final String email = "email";
		public static final String confirmEmail = "con_email";
		public static final String pswd = "pwd-txt";
		public static final String submit = "join_free_submit";
	}

	public class SignInPage {
		public static final String signInLayout = "lblLayoutSignIn";
		public static final String userName = "uname";
		public static final String password = "pwd";
		public static final String layoutSignIn = "btnLayoutSignIn";
		public static final String forgotPasswrod = "lnkLayoutForgotPassword";

	}

	public class MyAccountPage {
		public static final String myAccount = "link_myaccount";

	}
}
