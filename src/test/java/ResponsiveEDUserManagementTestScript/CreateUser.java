package ResponsiveEDUserManagementTestScript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ResponsiveEDGenericUtility.BaseClass;
import ResponsiveEDObjectReposotary.CreateUserPopUpPage;

//@Listeners(ResponsiveEDGenericUtility.ListenersImplementaionClass.class)
public class CreateUser extends BaseClass{
	
	@Test
	public void CreateNewUSer() throws Throwable
	{
		CreateUserPopUpPage cup = new CreateUserPopUpPage(driver);
		cup.ResponsiveEDcreateUser(driver);
	}

}
