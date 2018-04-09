package com.cashkaro.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.cashkaro.util.BaseWebdriver;
import com.cashkaro.util.FunctionLib;
import com.cashkaro.util.Locators;

import java.util.Set;

public class JoinFreePage extends BasePage {

	@FindBy(xpath = Locators.JoinFreePage.faceBook)
	private WebElement faceBook;

	@FindBy(id = Locators.JoinFreePage.firstName)
	private WebElement firstName;

	@FindBy(id = Locators.JoinFreePage.email)
	private WebElement email;

	@FindBy(id = Locators.JoinFreePage.confirmEmail)
	private WebElement confirmEmail;

	@FindBy(id = Locators.JoinFreePage.pswd)
	private WebElement pswd;

	@FindBy(id = Locators.JoinFreePage.submit)
	private WebElement submit;

	public JoinFreePage() {
		PageFactory.initElements(BaseWebdriver.getDriver(), this);
		Assert.assertTrue(FunctionLib.isElemntVisble(faceBook));

	}

	public MyAccountPage joinPage(String normalFB) {
		if (normalFB.equalsIgnoreCase("FB") || normalFB.equalsIgnoreCase("FaceBook")) {
			joinViaFB();
		} else {
			FunctionLib.scrollDown();
			firstName.sendKeys(FunctionLib.getrandomString(7, true, false));
			String emailAdd = FunctionLib.getrandomString(7, true, true) + "@dummy.com";
			email.sendKeys(emailAdd);
			confirmEmail.sendKeys(emailAdd);
			String pswd1 = FunctionLib.getrandomString(7, true, true);
			Actions actions = new Actions(BaseWebdriver.getDriver());
			actions.moveToElement(pswd);
			actions.click();
			actions.sendKeys(pswd1);
			actions.build().perform();
			// log.info("Details provided for sign up are : \"First Name :
			// "+getDriver().findElement(getTestLocator("SignUp.FirstName")).getAttribute("value")+"\",
			// \"email : "+emailAdd+"\", \"password : "+pswd+"\"");
			// wait time for Captcha
			try {
				Thread.sleep(8000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			submit.click();
		}

		return new MyAccountPage();
	}

	private void joinViaFB() {
		faceBook.click();
		String mainWindow = BaseWebdriver.getDriver().getWindowHandle();
		Set<String> allWindows = BaseWebdriver.getDriver().getWindowHandles();
		for (String singleWindow : allWindows) {
			BaseWebdriver.getDriver().switchTo().window(singleWindow);
			if (BaseWebdriver.getDriver().getTitle().contains("Facebook")) {
				// perform all login things
			}
		}
		// if window is not closing by its own
		// getDriver().close();
		BaseWebdriver.getDriver().switchTo().window(mainWindow);
	}
}
