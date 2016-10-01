package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ViewLead extends OpentapsWrappers{

	public ViewLead() {
		if(!verifyTitle("My Home | opentaps CRM"))
			Reporter.reportStep("This is not CRM Home Page", "FAIL");
	}	
















}
