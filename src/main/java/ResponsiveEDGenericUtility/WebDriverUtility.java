package ResponsiveEDGenericUtility;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * this class consists of generic methods related to WebDriver actions
 * @author SrinivasTeegala/SureshRajaboina
 */

public class WebDriverUtility {

	/**
	 * this method will wait 10sec to get all the elements loaded
	 * @param driver
	 */
	public void implicitlyWaitPage(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	/**
	 * this method will maximize WebPage
	 * @param driver
	 */
	public void maximize(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	/**
	 * this method will minimize the WebPage
	 * @param driver
	 */
	public void minimize(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
	
	/**
	 * this method will handle DropDown by using index
	 * @param element
	 * @param index
	 */
	public void handleDropdown(WebElement element,int index)
	{
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	
	/**
	 * this method will handle the DropDown by using Value
	 * @param element
	 * @param value
	 */
	public void handleDropdown(WebElement element,String value)
	{
		Select s=new Select(element);
		s.selectByValue(value);
	}
	
	/**
	 * this method will handle the DropDown by using VisibleText
	 * @param Text
	 * @param element
	 */
	public void handleDropdown(String Text,WebElement element)
	{
		Select s=new Select(element);
		s.selectByVisibleText(Text);
	}
	
	/**
	 * this Method will wait a particular element click
	 * @param driver
	 * @param element
	 */
	public void waitElementToBeClickable(WebDriver driver,WebElement element)
	{
		WebDriverWait wdt=new WebDriverWait(driver, Duration.ofSeconds(20));
		wdt.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	/**
	 * this method will wait A Particular element becomes visible
	 * @param driver
	 * @param element
	 */
	public void waitElementToBeVisible(WebDriver driver,WebElement element)
	{
		WebDriverWait wbt=new WebDriverWait(driver, Duration.ofSeconds(20));
		wbt.until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	 * this method will perform Hover action on a specified element
	 * @param driver
	 * @param element
	 */
	public void mouseHoverAction(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	/**
	 * this method will perform double click anywhere in the WebPage
	 * @param driver
	 */
	public void doubleClickAction(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.doubleClick().perform();
	}
	
	/**
	 * this method will perform double click on particular element
	 * @param driver
	 * @param element
	 */
	public void doubleClickAction(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
	}
	
	/**
	 * this method will perform right click actions anywhere in WebPage
	 * @param driver
	 */
	public void rightClickAction(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.contextClick().perform();
	}
	
	/**
	 * this method will perform right click operation on particular element in the WebPage
	 * @param driver
	 * @param element
	 */
	public void rightClickAction(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
	
	/**
	 * this method will perform drag and drop from source to destination
	 * @param driver
	 * @param srcelement
	 * @param destelement
	 */
	public void dragAndDropActions(WebDriver driver,WebElement srcelement,WebElement destelement)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(srcelement, destelement);
	}
	
	/**
	 * this method will perform PageDown
	 * @throws Exception
	 */
	public void pagedown() throws Exception
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(4000);
	}
	
	/**
	 * this method will  switch to  based on given index
	 * @param driver
	 * @param frameIndex
	 */
	public void switchToframe(WebDriver driver,int frameIndex)
	{
		driver.switchTo().frame(frameIndex);
	}
	
	/**
	 * this method switch to frame based on given frame name or frame ID
	 * @param driver
	 * @param FrameIdorName
	 */
	public void switchToframe(WebDriver driver,String FrameIdorName)
	{
		driver.switchTo().frame(FrameIdorName);
	}
	
	/**
	 * this method switch back to immediate parent frame
	 * @param driver
	 */
	public void switchToParentFrame(WebDriver driver)
	{
		driver.switchTo().parentFrame();
	}
	
	/**
	 * this method switch back to default frame 
	 * @param driver
	 */
	public void switchToDeafultcpntent(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	
	/*
	 * this method will accept the alert
	 */
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	/**
	 * this method will dismiss the alert
	 * @param driver
	 */
	public void dissmissAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	/**
	 * this method will print the alert Massage
	 * @param driver
	 */
	public String getAlertText(WebDriver driver)
	{
		return driver.switchTo().alert().getText();
	}
	
	/**
	 * this method will take screen shot and store it in folder
	 * @param driver
	 * @param screenshotName
	 * @return
	 * @throws IOException
	 */
	public String takescreenshot(WebDriver driver,String screenshotName) throws IOException
	{
		TakesScreenshot ts= (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\ScreenShots\\"+screenshotName+".png");
		FileUtils.copyFile(src, dest);
	return dest.getAbsolutePath();//for extent report	
	}
}
