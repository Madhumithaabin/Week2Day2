package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement login = driver.findElement(By.id("username"));
		login.sendKeys("demosalesmanager");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");

		WebElement login1 = driver.findElement(By.className("decorativeSubmit"));
		login1.click();

		WebElement link = driver.findElement(By.linkText("CRM/SFA"));
		link.click();
		driver.findElement(By.linkText("Contacts")).click();

		driver.findElement(By.linkText("Create Contact")).click();

		driver.findElement(By.id("firstNameField")).sendKeys("Madhumitha");
		driver.findElement(By.id("lastNameField")).sendKeys("Murugan");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("madhu");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("abin");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT");
		driver.findElement(By.name("description")).sendKeys("software engineer");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("madhumithajessi@gmail.com");
		WebElement findElement = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select state = new Select(findElement);
		state.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("software engineer");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String title = driver.getTitle();
		System.out.print(title);
	}

}
