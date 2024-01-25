package ResponsiveEDObjectReposotary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdministratorDashboardPage {
	
	@FindBy(xpath = "//span[text()='Dashboard']")
	private WebElement DashboardMenu; 
	
	@FindBy(xpath = "//span[text()='Announcement']")
	private WebElement AnnouncementMenu;
	
	@FindBy(xpath = "//span[text()='Forums']")
	private WebElement ForumsMenu;
	
	@FindBy(xpath = "//span[text()='Email']")
	private WebElement EmailMenu;
	
	@FindBy(xpath = "//span[text()='Students']")
	private WebElement StudentsMenu;
	
	@FindBy(xpath = "//span[text()='Users']/../../../..")
	private WebElement UserMenu;
	
	@FindBy(xpath = "//span[text()='Teachers']")
	private WebElement TeachersMenu;
	
	@FindBy(xpath = "//span[text()='Advisors']")
	private WebElement AdvisorsMenu;
	
	@FindBy(xpath = "//span[text()='Student Application']")
	private WebElement StudentApplicationMenu;
	
	@FindBy(xpath = "//span[text()='Roles']")
	private WebElement RolesMenu;
	
	@FindBy(xpath = "//span[text()='Institutions']")
	private WebElement InstitutionsMenu;
	
	@FindBy(xpath = "//span[text()='Application Questions']")
	private WebElement ApplicationQuestionsMenu;
	
	@FindBy(xpath = "//span[text()='Tracking Questions']")
	private WebElement TrackingQuestionsMenu;
	
	@FindBy(xpath = "//span[text()='Application Templates']")
	private WebElement ApplicationTemplatesMenu;
	
	@FindBy(xpath = "//span[text()='Tracking Templates']")
	private WebElement TrackingTemplatesManu;
	
	@FindBy(xpath = "//mat-label[text()='Institution']/../../../..")
	private WebElement institutinsDropDown;
	
	@FindBy(xpath = "//mat-label[text()='Search By']/../../../..")
	private WebElement searchByDropDown;
	
	@FindBy(xpath = "//mat-label[text()='Search Value']")
	private WebElement SearchValueText;
	
	@FindBy(xpath = "//mat-label[text()='Active/Inactive']/../../../..")
	private WebElement activeInactiveDropDown;
	
	@FindBy(xpath = "//span[text()='Go']")
	private WebElement goButton;
	
	public AdministratorDashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getDashboardMenu() {
		return DashboardMenu;
	}

	public WebElement getAnnouncementMenu() {
		return AnnouncementMenu;
	}

	public WebElement getForumsMenu() {
		return ForumsMenu;
	}

	public WebElement getEmailMenu() {
		return EmailMenu;
	}

	public WebElement getStudentsMenu() {
		return StudentsMenu;
	}

	public WebElement getUserMenu() {
		return UserMenu;
	}

	public WebElement getTeachersMenu() {
		return TeachersMenu;
	}

	public WebElement getAdvisorsMenu() {
		return AdvisorsMenu;
	}

	public WebElement getStudentApplicationMenu() {
		return StudentApplicationMenu;
	}

	public WebElement getRolesMenu() {
		return RolesMenu;
	}

	public WebElement getInstitutionsMenu() {
		return InstitutionsMenu;
	}

	public WebElement getApplicationQuestionsMenu() {
		return ApplicationQuestionsMenu;
	}

	public WebElement getTrackingQuestionsMenu() {
		return TrackingQuestionsMenu;
	}

	public WebElement getApplicationTemplatesMenu() {
		return ApplicationTemplatesMenu;
	}

	public WebElement getTrackingTemplatesManu() {
		return TrackingTemplatesManu;
	}

	public WebElement getInstitutinsDropDown() {
		return institutinsDropDown;
	}

	public WebElement getSearchByDropDown() {
		return searchByDropDown;
	}

	public WebElement getSearchValueText() {
		return SearchValueText;
	}

	public WebElement getActiveInactiveDropDown() {
		return activeInactiveDropDown;
	}

	public WebElement getGoButton() {
		return goButton;
	}
	
	
}
