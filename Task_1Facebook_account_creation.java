package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task_1Facebook_account_creation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\vaishnavi rajkumar\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.get("https://www.facebook.com/");
		WebElement we = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		we.click();
		Thread.sleep(3000);
		WebElement wb = driver.findElement(By.name("firstname"));
		wb.sendKeys("Vaishnavi");
		WebElement wl = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
        wl.sendKeys("Rajkumar");
        WebElement w1 = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
        w1.sendKeys("9551155650");
        WebElement w2 = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
        w2.sendKeys("Shind@455");
       
        
        WebElement w3 = driver.findElement(By.id("day"));
        Select s=new Select(w3);
        s.selectByVisibleText("20");
        
	    WebElement w4 = driver.findElement(By.id("month"));
	    Select s1=new Select(w4);
	     s1.selectByValue("7");
	     
	   WebElement w5 = driver.findElement(By.id("year"));
	   Select s2=new Select(w5);
	   s2.selectByVisibleText("2012");
	   
	   WebElement w6 = driver.findElement(By.name("sex"));w6.click();
	   WebElement w7 = driver.findElement(By.name("websubmit"));
	   w7.click();
	   
	   
	   
	}

}
