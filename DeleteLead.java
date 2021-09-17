package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("12345678");
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		WebElement findElement2 = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String text = findElement2.getText();
		System.out.println(text);
		driver.get(findElement2.getAttribute("href"));
//driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();

		WebElement findElement3 = driver.findElement(By.className("x-paging-info"));
		String text2 = findElement3.getText();
		if (text2.equals("No records to display")) {
			System.out.println("This message confirms the successful deletion");
		} else {
			System.out.println("No deletion occured");
		}
	}

}
