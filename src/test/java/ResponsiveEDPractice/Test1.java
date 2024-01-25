package ResponsiveEDPractice;


import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import ResponsiveEDGenericUtility.BaseClass;


public class Test1 extends BaseClass{

	@Test
	public void tests() throws Exception
	{

//		WebDriver driver = new ChromeDriver();
//		driver.get("https://lms-sis-demo.sapphirus.in/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@formcontrolname='uname']")).sendKeys("srinivas.test");
//		driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Welcome1!");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()=' Sign In ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Users']/../../../..")).click();
	}

}
