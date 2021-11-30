package selenium_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_dropdown {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\vaishnavi rajkumar\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.get("https://www.seleniumeasy.com/test/");
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	WebElement w1 = driver.findElement(By.name("States"));
	Select s=new Select(w1);
	boolean b = s.isMultiple(); // to check whether the dropdown is multiple or not we are using is multiple mthod
	System.out.println(b);
	List<WebElement> options = s.getOptions();   // in dropdown we can select multiple options. 
	                                           //to get that options as to be displayed we are using get options methods
	for (WebElement webElement : options) { // to iteterate the options without conditions here we are using for each loop..
		                                 // or     we can use iterator instead of for each
		System.out.println(webElement.getText()); // to print in console screen we are using get text method.
		
	}
	
	
	
	
	
	
	
	s.selectByVisibleText("New Jersey");
	
	
	
	
	}

}
