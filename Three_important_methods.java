package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Three_important_methods {
	//  in interview if they given a task to automate web elements........then initially dont take locators and xpath
	//before that implement some important methods 
	
	//(i) to check whether the element is present or not for that use 
	//(IS DISPLAYED METHOD)
	
	// (ii) if the element is present then check that element should be enabled or not
	//(IS ENABLED)
	
	// (iii) if that particular elemnt is enabled then check whether the particular elemnt is selected or not. this will
	// be applicable for the elemnt which has checkbox or dropdown or radio button
	//( IS SELECTED)
	
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\vaishnavi rajkumar\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement we = driver.findElement(By.id("email"));
		we.sendKeys("vaishnavi4550");
		boolean d = we.isDisplayed();
		System.out.println("Element is displayed:"  +d);
		boolean e = we.isEnabled();
		System.out.println("Element is Enabled:" +e);
		boolean s = we.isSelected();
		System.out.println("Element is selected:"+s);
		
		
		
		

	}

}
