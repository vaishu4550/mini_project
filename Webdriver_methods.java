package selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_methods{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaishnavi rajkumar\\Downloads\\chromedriver 2\\chromedriver.exe");//(specify driver, specfy driver path)
         WebDriver driver=new ChromeDriver(); //upcasting (chromedriver=>class) (webdriver=>interface) converting class into interface is called upcasting
	driver.get("https://www.google.co.in/");
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	String t = driver.getTitle();
	System.out.println(t);
	String url = driver.getCurrentUrl();
	System.out.println(url);
	driver.navigate().to("https://www.instagram.com/");
	driver.navigate().back();
	driver.navigate().forward();
	Thread.sleep(8000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	}

 








}
