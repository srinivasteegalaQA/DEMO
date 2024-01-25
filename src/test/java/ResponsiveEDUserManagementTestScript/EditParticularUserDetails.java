package ResponsiveEDUserManagementTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ResponsiveEDGenericUtility.BaseClass;
import ResponsiveEDGenericUtility.WebDriverUtility;
import ResponsiveEDObjectReposotary.allUserManagementDropDwnHandle;

//@Listeners(ResponsiveEDGenericUtility.ListenersImplementaionClass.class)
public class EditParticularUserDetails extends BaseClass{
	
	@Test
	public void EditParticularUser() throws Exception
	{
		allUserManagementDropDwnHandle all = new allUserManagementDropDwnHandle(driver);
		all.DropDwnHandleUserManagement(driver);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Search User']")).sendKeys("srinivas07");
		Thread.sleep(2000);
		WebDriverUtility web = new WebDriverUtility();
		web.pagedown();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//table/tbody/tr/td[7]/button[2]")).click();
		Thread.sleep(2000);
		WebElement dd= driver.findElement(By.xpath("//input[@formcontrolname='middle_name']"));
		dd.click();
		Thread.sleep(1000);
		dd.clear();
		Thread.sleep(2000);
		dd.sendKeys("Sri");
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//Button[text()='OK']")).click();
		Thread.sleep(2000);
	}
	
}
