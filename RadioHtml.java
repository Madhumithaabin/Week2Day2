package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioHtml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/radio.html");
		driver.findElement(By.xpath("//input[@id='yes']")).click();
		boolean second = driver.findElement(By.xpath("//input[@value='1']")).isEnabled();
		if (second == true)
			System.out.println("option is selected by default");
		else
			System.out.println("option is not selected by default");
	}

}
