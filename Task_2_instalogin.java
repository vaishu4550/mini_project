package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task_2_instalogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\vaishnavi rajkumar\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		WebElement id = driver.findElement(By.xpath("//span[text()='Sign up']"));
	    id.click();
	    Thread.sleep(3000);
	    WebElement insta_user = driver.findElement(By.name("emailOrPhone"));
	    insta_user.sendKeys("vaishnavishind333@gmail.com");
	    WebElement insta_name = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	    insta_name.sendKeys("Vaishnavi");
	    WebElement insta_username = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	insta_username.sendKeys("vaishnavishind333579");
	WebElement insta_password = driver.findElement(By.xpath("//input[@type='password']"));
	insta_password.sendKeys("Shind@5689");
	WebElement insta_signup = driver.findElement(By.xpath("//button[text()='Sign up']"));
	insta_signup.click();
	Thread.sleep(3000);
	WebElement insta_month = driver.findElement(By.xpath("//select[@title='Month:']"));
	
	Select s= new Select( insta_month);
	s.deselectByVisibleText("February");
	WebElement insta_day = driver.findElement(By.xpath("//select[@title='Day:']"));
	Select s1=new Select(insta_day);
	s1.selectByValue("8");
	WebElement insta_year = driver.findElement(By.xpath("//select[@title='Year:']"));
		Select s2=new Select(insta_year);
		s2.selectByValue("1961");
		WebElement insta_nextbutton = driver.findElement(By.xpath("//button[text()='Next']"));
		insta_nextbutton.click();
		
		
		
		
		
		
	
	}

}
