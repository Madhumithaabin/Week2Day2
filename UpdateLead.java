package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement login = driver.findElement(By.id("username"));
		login.sendKeys("demosalesmanager");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");

		WebElement login1 = driver.findElement(By.className("decorativeSubmit"));
		login1.click();

		WebElement link = driver.findElement(By.linkText("CRM/SFA"));
		link.click();
		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("anu");
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		
		WebElement findElement2 = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
		driver.get(findElement2.getAttribute("href"));
		String title = driver.getTitle();
		if (title.contains("opentaps")) {
			System.out.println("Title of the page is confirmed " + title);
		} else {
			System.out.println("Title of the page doesn't exist " + title);
		}
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Masters");
		driver.findElement(By.name("submitButton")).click();
		WebElement findElement = driver.findElement(By.id("viewLead_companyName_sp"));
		String text = findElement.getText();
		if (text.contains("Masters")) {
			System.out.println("Changes of Company name is confirmed");

		} else {
			System.out.println("Changes of Company name is not confirmed");
		}
		driver.close();

	}

}
