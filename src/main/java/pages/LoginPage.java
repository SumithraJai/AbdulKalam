package pages;



import utils.Reporter;
import wrappers.OpentapsWrappers;

public class LoginPage extends OpentapsWrappers{

	public LoginPage(){

		if(!verifyTitle("Opentaps Open Source ERP + CRM"))
			Reporter.reportStep("This is not Login Page", "FAIL");
	}

	public LoginPage enterUserName(String data) {
		enterById(prop.getProperty("Login.UserName.Id"), data);
		return this;
	}

	public LoginPage enterPassword(String data) {
		enterById(prop.getProperty("Login.Password.Id"), data);
		return this;
	}

	public HomePage clickLogin() {
		clickByClassName(prop.getProperty("Login.LoginButton.Class"));
		return new HomePage();
	}
	public LoginPage clickLoginForFailure() {
		clickByClassName(prop.getProperty("Login.LoginButton.Class"));
		return this;
	}
	public LoginPage verifyErrorMessage(String data) {
		verifyTextContainsByXpath(prop.getProperty("Login.Error.Xpath"), data);
		return this;
	}




















}
