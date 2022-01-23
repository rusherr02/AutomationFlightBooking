package AutomationTicketBooking;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booking {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir") + "\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();

		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//select[@name='fromPort']")).click();
		driver.findElement(By.xpath("//option[@value='Boston']")).click();

		driver.findElement(By.xpath("//select[@name='toPort']")).click();
		driver.findElement(By.xpath("//option[@value='Berlin']")).click();

		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//table/tbody/tr[3]//input[@class='btn btn-small']")).click();

		// input[@id='inputName']- name
		driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("xyz");

		// input[@id='address'] 123 Bell road
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("123 Bell road");

		// input[@id='city'] laptaganj
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Lapta");

		// input[@id='state'] outlaw
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Outlaw");

		// input[@id='zipCode'] //420420
		driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("420420");

		// select[@id='cardType']//option[@value='amex']
		driver.findElement(By.xpath("//select[@id='cardType']//option[@value='amex']"));

		// input[@id='creditCardNumber'] // 90939393993
		driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("90939393993");

		// input[@id='creditCardMonth'] 01
		driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("01");

		// input[@id='creditCardYear'] 2025
		driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2025");

		// input[@id='nameOnCard'] John Arora
		driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("John Arora");

		// label[@class='checkbox'] optional
		driver.findElement(By.xpath("//label[@class='checkbox']")).click();

		// input[@class='btn btn-primary'] purchase
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();

//		Confirmation
		WebElement confirmationMsg = driver
				.findElement(By.xpath("//h1[contains(text(),'Thank you for your purchase today!')]"));

		System.out.println(confirmationMsg.getText());

		driver.quit();

	}

}
