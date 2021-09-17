package Week2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.cucumber.messages.internal.com.google.protobuf.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Dropdown.html");

		WebElement drop1 = driver.findElement(By.id("dropdown1"));
		Select select = new Select(drop1);
		select.selectByIndex(4);
		WebElement drop2 = driver.findElement(By.name("dropdown2"));
		Select select2 = new Select(drop2);
		select2.selectByVisibleText("Selenium");
		WebElement drop3 = driver.findElement(By.id("dropdown3"));
		Select select3 = new Select(drop3);
		select3.selectByValue("4");
		WebElement findElement = driver.findElement(By.xpath("(//div[@class='example'])[4]/select"));
		Select allselect = new Select(findElement);
		int size = allselect.getOptions().size();
		System.out.print("Number of options available are :" + (size - 1));
		driver.findElement(By.xpath("(//div[@class='example'])[5]/select")).sendKeys("Appium");

		driver.findElement(By.xpath("(//div[@class='example'])[6]//option[4]")).click();

	}
}
