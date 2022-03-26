package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelenium3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Preethi");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("KB");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("PreethiKB");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("It is testing session");
		
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("preethi.ischool@gmail.com");
		
		
		WebElement dropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select source =new Select (dropDown);
		
		source.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeafOrg");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sunny");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println(driver.getTitle());
		
		
		
		
		
		

		
	
		
		
		

	}

}
