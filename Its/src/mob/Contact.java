package mob;


	import java.util.Iterator;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class Contact {
	    @Test()
	    public void contact() throws InterruptedException
	    {
	        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://mobileworld.azurewebsites.net");
	        driver.findElement(By.xpath("(//a[@id='navbarDropdown'])")).click();
	        driver.findElement(By.linkText("Contact Us")).click();
	        Set<String> windows = driver.getWindowHandles();
	        Iterator<String> it = windows.iterator();
	        String parentId = it.next();
	        String childId = it.next();
	        driver.switchTo().window(childId);
	        driver.manage().window().maximize();
	        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("puneeth");
	        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("puneeth@gmail.com");
	        driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("9876543210");
	        driver.findElement(By.name("message")).sendKeys("hello");
	        driver.findElement(By.xpath("//input[@type='submit']")).click();
	        driver.close();
	}
	}
