package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_executor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vaishnavi rajkumar\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.com/");
    driver.get("https://www.amazon.com/");
    JavascriptExecutor js=(JavascriptExecutor) driver; //Narrowing typecasting    driver is big datatype so we cant  
    //convert into javascript executor so we we are doing narrowing typecasting
    WebElement amazon_logo = driver.findElement(By.xpath("//div[contains(@class,'logo')]"));
    js.executeScript("arguments[0].scrollIntoView();",amazon_logo);
    Thread.sleep(3000);
    js.executeScript("window.scrollBy(0,-2000);");
    js.executeScript("window.scrollBy(0,3000);" );
    }

}
