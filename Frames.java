package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\vaishnavi rajkumar\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();	
	driver.get("https://www.google.com/");
	driver.get("http://www.leafground.com/pages/frame.html");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='default.html']"));
	driver.switchTo().frame(frame1);
	WebElement frame_click = driver.findElement(By.id("Click"));
	frame_click.click();
	driver.switchTo().defaultContent(); // if i went to frames. then i want to switch to default content after that only i can 
	// move to other frames. or to access default content elements.
	Thread.sleep(3000);
	WebElement frame_nest_outer = driver.findElement(By.xpath("//iframe[@src='page.html']"));
driver.switchTo().frame(frame_nest_outer);
WebElement frame_nest_inner = driver.findElement(By.id("frame2"));
driver.switchTo().frame(frame_nest_inner);
WebElement click = driver.findElement(By.id("Click1"));
click.click();
driver.switchTo().defaultContent();
WebElement frame3 = driver.findElement(By.xpath("//iframe[@src='countframes.html']"));
System.out.println(frame3.getText());

	}

}
