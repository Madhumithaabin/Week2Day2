package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.name("UserFirstName")).sendKeys("Madhumitha");
		driver.findElement(By.name("UserLastName")).sendKeys("Murugan");
		driver.findElement(By.name("UserEmail")).sendKeys("madhumithajessi@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("Greenwoods");
		driver.findElement(By.name("UserPhone")).sendKeys("9867458954");
		WebElement findElement = driver.findElement(By.name("UserTitle"));
		Select title = new Select(findElement);
		title.selectByValue("Customer_Service_Manager_AP");
		WebElement findElement1 = driver.findElement(By.name("CompanyEmployees"));
		Select emp = new Select(findElement1);
		emp.selectByValue("75");
		WebElement findElement2 = driver.findElement(By.name("CompanyCountry"));
		Select country = new Select(findElement2);
		country.selectByValue("IN");
		driver.findElement(By.xpath("//div[@class=\"checkbox-ui\"]")).click();
		driver.close();
	}

}
