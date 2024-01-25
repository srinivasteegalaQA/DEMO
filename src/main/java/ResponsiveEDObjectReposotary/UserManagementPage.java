package ResponsiveEDObjectReposotary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserManagementPage {

	@FindBy(xpath = "//mat-label[text()='Institutions:']/../../../..")
	private WebElement institutinsDropDown;
	
	@FindBy(xpath = "//mat-label[text()=\"Role's:\"]/../../../..")
	private WebElement rolesDropDown;
	
	@FindBy(xpath = "//mat-label[text()='Enrollment Status:']/../../../..")
	private WebElement enrollmentStatusDropDown;
	
	@FindBy(xpath = "//mat-label[text()='Search By:']/../../../..")
	private WebElement searchByDropDown;
	
	@FindBy(xpath = "//span[text()='GO']")
	private WebElement goButton;
	
	@FindBy(xpath = "//span[text()='Create']")
	private WebElement createButton;
	
	
	
	
	public UserManagementPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getInstitutinsDropDown() {
		return institutinsDropDown;
	}

	public WebElement getRolesDropDown() {
		return rolesDropDown;
	}

	public WebElement getEnrollmentStatusDropDown() {
		return enrollmentStatusDropDown;
	}

	public WebElement getSearchByDropDown() {
		return searchByDropDown;
	}

	public WebElement getGoButton() {
		return goButton;
	}

	public WebElement getCreateButton() {
		return createButton;
	}
	
	
}
