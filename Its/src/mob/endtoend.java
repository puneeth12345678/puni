package mob;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class endtoend {

	@Test
	public void end() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driverS/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)d;
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.get("https://mobileworld.azurewebsites.net/");
		d.manage().window().maximize();
		d.findElement(By.id("navbarDropdown")).click();
		d.findElement(By.xpath("//a[normalize-space()='Apple']")).click();
		d.findElement(By.xpath("//div[@id='apple']//div[2]//div[1]//div[1]//a[1]")).click();
		js.executeScript("window.scrollBy(0,1000)");
		d.findElement(By.xpath("//i[@class='fas fa-arrow-up']")).click();
		d.findElement(By.xpath("//a[normalize-space()='All Mobiles']")).click();
		d.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();
		Set<String> windows=d.getWindowHandles();
		Iterator<String> it=windows. iterator();
		String parentid=it.next();
		String childid=it.next();
		d.switchTo().window(childid);
		d.findElement(By.id("inputFirstName")).sendKeys("puneeth");
		d.findElement(By.xpath("//body/div[@class='container']/div[@class='card']/div[@class='card-body']/form[@id='myForm']/div[1]/div[2]/input[1]")).sendKeys("Sl");
		d.findElement(By.id("inputEmail")).sendKeys("puneeth@gmail.com");
		d.findElement(By.id("inputPassword")).sendKeys("puneeth@123");
		d.findElement(By.id("flexRadioDefault1")).click();
		d.findElement(By.xpath("//input[@placeholder='00000000000']")).sendKeys("9876543210");
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@id=' address1']")).sendKeys("sri sai PG");
		d.findElement(By.xpath("//input[@placeholder='Main St']")).sendKeys("Manjunathnagar");
		d.findElement(By.id("inputCity")).sendKeys("Bangalore");
		WebElement State=d.findElement(By.id("inputState"));
		Select drp=new Select(State);
		drp.selectByIndex(2);
	    d.findElement(By.xpath("//input[@id='inputZip']")).sendKeys("562123");
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@rel='apple']")).click();
		d.findElement(By.xpath("//input[@rel='samsung']")).click();
		d.findElement(By.xpath("//input[@placeholder='no of mobiles']")).sendKeys("3");
		d.findElement(By.xpath("//select[@id='bought']/option[@value='0']")).click();
		d.findElement(By.xpath("//div[@class='apple']//option[1]")).click();
		List<WebElement> c=d.findElements(By.id("gridCheck1"));
		c.get(0);
		c.get(1);
		d.findElement(By.xpath("//button[@data-target='#exampleModal']")).click();
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//a[@class='btn btn-secondary']")).click();
		
		
		d.quit();
		
		
	}
}
