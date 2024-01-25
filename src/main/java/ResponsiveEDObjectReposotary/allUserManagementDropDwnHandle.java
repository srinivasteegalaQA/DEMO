package ResponsiveEDObjectReposotary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class allUserManagementDropDwnHandle {
	
	public allUserManagementDropDwnHandle(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void DropDwnHandleUserManagement(WebDriver driver) throws Exception
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
