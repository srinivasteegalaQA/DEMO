package ResponsiveEDUserManagementTestScript;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ResponsiveEDGenericUtility.BaseClass;
import ResponsiveEDGenericUtility.WebDriverUtility;
import ResponsiveEDObjectReposotary.allUserManagementDropDwnHandle;

//@Listeners(ResponsiveEDGenericUtility.ListenersImplementaionClass.class)
public class viewParticularUserDetails extends BaseClass{
	
	@Test
	public void viewUserDetails() throws Exception
	{
		allUserManagementDropDwnHandle all = new allUserManagementDropDwnHandle(driver);
		all.DropDwnHandleUserManagement(driver);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Search User']")).sendKeys("srinivas07");
		Thread.sleep(2000);
		WebDriverUtility web = new WebDriverUtility();
		web.pagedown();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//table/tbody/tr/td[7]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-icon[text()='close']/..")).click();
		Thread.sleep(2000);
	}

}
