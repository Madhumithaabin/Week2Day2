package Assignments;

import java.awt.Desktop.Action;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageHtml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HttpURLConnection huc = null;
		int respCode;
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Image.html");
		driver.findElement(By.xpath("(//label[@for='home'])/following::img")).click();
		driver.get("http://leafground.com/pages/Image.html");
		WebElement findElement1 = driver.findElement(By.xpath("(//label[@for='home'])/following::img"));
		try {
			huc = (HttpURLConnection) (new URL(findElement1.getAttribute("src")).openConnection());

			huc.connect();

			respCode = huc.getResponseCode();

			if (respCode == 200) {
				System.out.println("Image is a broken link");
			} else {
				System.out.println("Image is a valid link");
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement findElement = driver.findElement(By.xpath("(//label[@for='position'])[2]/following::img"));
		Actions builder = new Actions(driver);
		builder.doubleClick(findElement).build().perform(); // Double Click = Left Click)
		// builder.moveToElement(findElement).build().perform();
		// Actions click = builder.click();

	}

}
