package selenium_project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_a {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\vaishnavi rajkumar\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
 driver.get("http://www.leafground.com/pages/Alert.html");	
 WebElement simplealert = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		simplealert.click();
		Thread.sleep(3000);
driver.switchTo().alert().accept();
WebElement confirmalert = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
confirmalert.click();
Thread.sleep(3000);
driver.switchTo().alert().dismiss(); // instead dismiss we can give accept button also.. then it will ok button 
	WebElement promptalert = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
	promptalert.click();
	Alert alert=  driver.switchTo().alert();
	Thread.sleep(3000);
	driver.switchTo().alert().sendKeys("selenium");
	Thread.sleep(3000);
	driver.switchTo().alert();
	}

}
