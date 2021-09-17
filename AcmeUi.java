package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcmeUi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://acme-test.uipath.com/login");
		WebElement login = driver.findElement(By.id("email"));
		login.sendKeys("kumar.testleaf@gmail.com");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("leaf@12");
//driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Log Out")).click();
		driver.close();
	}

}
