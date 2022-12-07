package week2.day1.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		//System.out.println(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//Thread.sleep(2000);
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
      
		driver.findElement(By.linkText("CRM/SFA")).click();
       
	  
		driver.findElement(By.linkText("Leads")).click();
		 
	    driver.findElement(By.linkText("Create Lead")).click();
	 
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
	
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("gayathri");
		    
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("N");
		
		driver.findElement(By.name("departmentName")).sendKeys("Testing");
		driver.findElement(By.name("description")).sendKeys("CreateLead");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gayathri.chandraasekar@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
			
		System.out.println(driver.getTitle());
		//driver.close();

	}


}

	


