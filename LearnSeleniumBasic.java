package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSeleniumBasic {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    //Set the path to driver
	WebDriverManager.chromedriver().setup();
	
	//Launch the browser
	ChromeDriver driver = new ChromeDriver();
   

	driver.get("http://leaftaps.com/opentaps/control/login");
	

	driver.manage().window().maximize();
	//Send the user name and value
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	
	//Send the password and value
    driver.findElement(By.id("password")).sendKeys("crmsfa");
    
    //Send the login button
    driver.findElement(By.className("decorativeSubmit")).click();
    
    driver.findElement(By.linkText("CRM/SFA")).click();
 
    driver.findElement(By.linkText("Leads")).click();
    
    driver.findElement(By.linkText("Create Lead")).click();
    
    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testLead");
    
   //driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("B");
    
    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Preethi");
    
    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("KB");
    
    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("preethib");
    
    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
    
    driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing is checking whether software works as per requirement.");
    
    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("preethi.ischool@gmail.com");
    
    
   WebElement dropDowm =  driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
   Select source = new Select(dropDowm);
   source.selectByVisibleText("New York");
   
   driver.findElement(By.name("submitButton")).click();

   System.out.println(driver.getTitle());

   
   
   
   
   
   
   
   
    
    

    
    
    
    
    
    
    
   
	}

}
