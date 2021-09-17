package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args)throws InterruptedException  {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		WebElement crm = driver.findElement(By.linkText("CRM/SFA"));
		crm.click();
		 driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("test123@gmail.com");
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 Thread.sleep(5000);
		 String text = driver.findElement(By.xpath("//div[@class='x-grid3-hd-inner x-grid3-hd-firstName']/following::tr[1]/td[3]/div/a[1]")).getText();
		 System.out.println("name: "+text);
		driver.findElement(By.xpath("//div[@class='x-grid3-hd-inner x-grid3-hd-firstName']/following::tr[1]/td[3]/div/a[1]")).click();
	driver.findElement(By.linkText("Duplicate Lead")).click();
	 String duplicate = driver.findElement(By.xpath("//div[text()='Duplicate Lead']")).getText();
	 if(duplicate.equals("Duplicate Lead"))
	 {
		 System.out.println("Title is verified " +duplicate);
	 }
	 else
	 {
		 System.out.println("Title not verified");
	 }
	 driver.findElement(By.className("smallSubmit")).click();
	 String text2 = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();	
	 System.out.println("duplicate name: "+text2);
	 if(text.equals(text2))
	 {
		 System.out.println("Lead name is Duplicated");
	 }
	 else
	 {
		 System.out.println("Lead name not Duplicated");
	 }
	 Thread.sleep(5000);
	 driver.close();
	}

}
