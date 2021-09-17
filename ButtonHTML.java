package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonHTML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Button.html");
		driver.findElement(By.id("home")).click();
		WebElement findElement = driver.findElement(By.id("position"));
		Point location = findElement.getLocation();
		System.out.println(location);
		WebElement findElement2 = driver.findElement(By.id("color"));
		System.out.println(findElement2.getCssValue("color"));
		WebElement findElement3 = driver.findElement(By.id("size"));
		System.out.println(findElement3.getSize());
	}

}
