package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Madhumitha");
		driver.findElement(By.name("lastname")).sendKeys("Murugan");
		driver.findElement(By.name("reg_email__")).sendKeys("madhumithajessi@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("madhumithajessi@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Madhu@212");
		WebElement findElement = driver.findElement(By.id("day"));
		Select day = new Select(findElement);
		day.selectByValue("6");
		WebElement findElement1 = driver.findElement(By.id("month"));
		Select month = new Select(findElement1);
		month.selectByIndex(2);
		WebElement findElement2 = driver.findElement(By.id("year"));
		Select year = new Select(findElement2);
		year.selectByValue("1996");
		driver.findElement(By.xpath("//input[@class='_8esa']")).click();
driver.close();

	}

}
