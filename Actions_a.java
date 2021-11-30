package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_a {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\vaishnavi rajkumar\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.get("http://automationpractice.com/index.php");
driver.manage().window().maximize();
WebElement dresses = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
Actions a=new Actions(driver);
Thread.sleep(3000);
a.moveToElement(dresses).build().perform();
WebElement evn_dress = driver.findElement(By.xpath("(//a[text()='Evening Dresses'])[2]"));
Thread.sleep(3000);
a.moveToElement(evn_dress).build().perform();	
Thread.sleep(3000);
a.click(evn_dress).build().perform();
String currentUrl = driver.getCurrentUrl();
System.out.println("current url:" + currentUrl);
}
}
