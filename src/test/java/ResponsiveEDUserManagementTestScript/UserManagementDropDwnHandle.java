package ResponsiveEDUserManagementTestScript;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ResponsiveEDGenericUtility.BaseClass;
import ResponsiveEDObjectReposotary.AdministratorDashboardPage;
import ResponsiveEDObjectReposotary.UserManagementPage;

//@Listeners(ResponsiveEDGenericUtility.ListenersImplementaionClass.class)

public class UserManagementDropDwnHandle extends BaseClass{
	
	@Test
	public void UserManagementAllDropDwnHandle() throws Exception
	{
		AdministratorDashboardPage ad = new AdministratorDashboardPage(driver);
		ad.getUserMenu().click();
		Thread.sleep(2000);
		UserManagementPage um = new UserManagementPage(driver);
		um.getInstitutinsDropDown().click();
		driver.findElement(By.xpath("//span[text()='Sapphirus School']")).click();
		Thread.sleep(2000);
		um.getRolesDropDown().click();
		driver.findElement(By.xpath("//span[text()='Administrator']")).click();
		Thread.sleep(2000);
		um.getEnrollmentStatusDropDown().click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='All'])[2]")).click();
		Thread.sleep(2000);
		um.getSearchByDropDown().click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='All'])[3]")).click();
		Thread.sleep(2000);
		um.getGoButton().click();
		Thread.sleep(2000);
	}

}
