package Assignments;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkHtml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int linkCount = 1;
		HttpURLConnection huc = null;
		int respCode;
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.get("http://leafground.com/pages/Link.html");
		WebElement findElement = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/a"));
		String attribute = findElement.getAttribute("href");
		System.out.println(attribute);
		WebElement findElement1 = driver.findElement(By.linkText("Verify am I broken?"));
		try {
			huc = (HttpURLConnection) (new URL(findElement1.getAttribute("href")).openConnection());

			huc.connect();

			respCode = huc.getResponseCode();

			if (respCode >= 400) {
				System.out.println("URL is a broken link");
			} else {
				System.out.println("URL is a valid link");
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement findElement2 = driver.findElement(By.linkText("Go to Home Page"));
		if (findElement2.getAttribute("href").contains("href")) {
			findElement2.click();
		}

		for (WebElement links : driver.findElements(By.tagName("a"))) {
			linkCount++;
		}
		System.out.println("Number of link available : " + linkCount);
	}

}
