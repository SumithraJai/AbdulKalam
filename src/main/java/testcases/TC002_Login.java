package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC002_Login extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord, 
			String vErrorMess) {

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLoginForFailure()
		.verifyErrorMessage(vErrorMess);
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC002";
		browserName="chrome";
		testCaseName="Login to OpenTaps(Negative)";
		testDescription="Login(Failure) to Opentaps using POM framework";
	}

	
	
	
	
	
	
}
