package selenium_project;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\vaishnavi rajkumar\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe ");
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("incognito"); // to change the chrome browser in incognito mode for security purpose
		
	WebDriver driver =new ChromeDriver(ch);
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	WebElement we = driver.findElement(By.id("email"));we.sendKeys("vaishnavi");
	//WebElement me = driver.findElement(By.xpath("//*[@id=\"email\"]"));me.sendKeys("vaishnavi"); (xpath for username)
	WebElement wb = driver.findElement(By.id("pass"));wb.sendKeys("Vaishu@555");
	WebElement wl = driver.findElement(By.name("login"));wl.click();
	// take screenshot
	TakesScreenshot ts=  (TakesScreenshot) driver; // narrowing typecasting // interface
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination =new File("C:\\Users\\vaishnavi rajkumar\\eclipse-workspace\\selenium\\screenshots\\snap.png");
	FileHandler.copy(source, destination); // we can use file handler or file utils
//	driver.close();
}
}
