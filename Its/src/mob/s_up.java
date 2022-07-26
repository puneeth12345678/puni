package mob;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class s_up {

	@Test()
	public void sign() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mobileworld.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
		driver.findElement(By.xpath("//a[@href='signup.html']")).click();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Puneeth");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("S L");
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("puneeth25@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Puneeth@25");
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("15-07-2022");
		driver.findElement(By.xpath("//div[@class='col-md-2']/input[@type='radio']")).click();
		driver.findElement(By.xpath("//input[@placeholder='98"
				+ "98XXXXXXXXXX']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys("Hello");
		driver.findElement(By.xpath("//button[@class='btn btn-info form-control']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[@type='Submit']")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Puneeth");
		driver.findElement(By.id("password")).sendKeys("Puneeth@25");
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-block']")).click();
		driver.quit();

	}
}
